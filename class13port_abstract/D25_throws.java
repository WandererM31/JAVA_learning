//2018.6.9第25讲：异常
/* 异常发生的原因有很多，通常包含以下几大类：
1、用户输入了非法数据。
2、要打开的文件不存在。
3、网络通信时连接中断，或者JVM内存溢出。
这些异常有的是因为用户错误引起，有的是程序错误引起的，还有其它一些是因为物理错误引起的。
* 
* 异常分类：
检查性异常：java.lang.Exception 程序正确外在条件不满足引起的异常，用户错误或IO错误,例如打开文件不存在，java编译器要求强制处理才能编译
运行时异常：java.lang.RuntimeException 运行时异常是可能被程序员避免的异常。与检查性异常相反，运行时异常可以在编译时被忽略。
错误：java.lang.Error 错误不是异常，而是脱离程序员控制的问题。错误在代码中通常被忽略。例如，当栈溢出时，一个错误就发生了，它们在编译也检查不到的。
     一般很少见很难通过程序解决，可能源于程序bug或源于环境问题
 * 
 * Exception类的层次：
java.lang.Object
  继承者 java.lang.Throwable
      继承者 java.lang.Exception
 */
package class13port_abstract;
import java.io.*;
import java.net.*;
public class D25_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//检查异常 1.打开文件:提示文件不存在
		FileReader fr = null;
		try {
			//有一行错了抛出异常就中断执行，剩下的try语句都不执行，直接进入catch语句
			//多个catch语句则进入匹配异常的那个catch语句
			fr = new FileReader("d:\\aa.txt"); //对应e1
			Socket s = new Socket("192.1682.1.23",78); //匹配e2
			System.out.println("go on");
			
		}catch(FileNotFoundException e){ 
			//Exception e最大捕获，捕获所有可能的错误
			//catch(FileNotFoundException e) 属于分步捕获，是最小捕获，有什么错就捕获什么错，捕获不了别的
			
			//把异常信息输出利于排出bug：
			System.out.println("ok1");
			e.printStackTrace();//系统找不到指定文件
			
		}catch(IOException e2) {
			
			System.out.println("ok2");
			System.out.println("message：="+e2.getMessage());
			e2.printStackTrace();
			
		}finally {
			
			System.out.println("进入finally");
			if(fr!=null) {
			
				try {
					fr.close(); //关闭文件
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
			
		}
		
		System.out.println("ok");//正常打出
		
		//2.连接远程端口192.168.12.12 ip端口号
		//Socket s = new Socket("192.168.1.23",78);
		
		//运行异常：0被除、数组越界、入参不满足规范
		//int a=4/0; //java.lang.ArithmeticException
              
	}

}
/*异常处理：
 * 1.try...catch 从异常发生点中断程序并抛出异常：自己捕获或抛出让上级处理
 *   finally  不管try中有没异常，都会执行。一般会把需要关闭的资源（文件，链接，内存）
 *   finally不会执行的情况：finally块中异常；程序所在线程死亡；前面代码有System.exit();关闭CPU
 * 2.抛出异常给调用者：
 * 
 */








