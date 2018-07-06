//2018.6.10第26讲，异常2：抛出异常给调用者处理，在下面发生在上一层捕获
//不停向上抛出异常会搞不清位置，运行慢

package class13port_abstract;

import java.io.*;

public class D25_throws2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.test2();

	}

}
class Father
{
	private Son son;
	public Father(){
		Son son = new Son();
	}
	public void test2() {
		try {
			son.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("父亲在处理");
			e.printStackTrace();
		} //必须处理异常，要么再向上抛出，要么捕获catch
		  //son.test是调用者
	}
}
class Son
{
	public void test() throws Exception { //抛出异常给调用者处理
		FileReader fr = null;
		fr = new FileReader("d:\\dd.txt");
		//抛出异常throws：Exception, IOException, FileNoFoundException
	}
}