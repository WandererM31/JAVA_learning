//2018.5.4
//第9课开头，静态变量和静态区域块
package hello;

public class Demo8_3leibianliang {
	
	static int i=1; //随着类定义开辟内存，存到类的代码区
	static //静态区域块,在类定义的时候已经开辟内存，即时没有对象也执行。在创建对象时只执行一次
	{
		System.out.println(i);
		System.out.println("a");
		i++;
	}
	
	public Demo8_3leibianliang() //主类构造函数
	{
		System.out.println("b");
		i++;
	}
	
	public static void main(String[] args) {
		
		//执行静态区域块，没有对象也执行
		
		Demo8_3leibianliang t1 = new Demo8_3leibianliang();//执行静态区域块、构造函数
		//System.out.println(t1.i);
		
		//Demo8_3leibianliang t2 = new Demo8_3leibianliang();//不再执行静态区域块
		//System.out.println(t2.i);
		Cog d = new Cog();
				
		// TODO Auto-generated method stub
	}
	
}


class Cog{ 
	static int i=6;  //没有对象就不会执行，为什么呢？？再去查静态区域块更多的内容
	static
	{
		System.out.println(i);
		System.out.println("hahah");
		i++;
	}
}


