//2018.5.4
//第8课 java面向对象编程：this,类变量，类方法，四大特征
//目标：初步理解什么是this，类变量类方法，初步理解抽象，封装，继承和多态

//8.2类变量

package hello;

public class Demo8_2 {

	public static void main(String[] args) {
		
/*		int total=0;
		
		Child ch1 = new Child(3,"niun");
		ch1.joinGame();
		total++;
		Child ch2=new Child(4,"a");
		ch2.joinGame();
		total++;
		System.out.println(total);
*/		//这种创建的total已经脱离了对象，不符合面向对象的思想
		
//////改进类变量：
		Child ch1 = new Child(3,"niun");
		ch1.joinGame();
		
		Child ch2=new Child(4,"a");
		ch2.joinGame();
		
		//System.out.println(ch1.total);//这里的提示是什么意思？？
		System.out.println(Child.total);
		
		// TODO Auto-generated method stub

	}

}

/*
class Child 
{
	int age;
	String name;	
	public Child(int age, String name)
	{
		this.age =age;
		this.name=name;   	
	}
	public void joinGame()
	{
		System.out.println("一个小孩加入了");
	}
}
*/


///////类变量：
class Child 
{
	int age;
	String name;
	static int total=0;
	//设置静态的类变量，静态变量可以被任何一个对象访问，相当于这个类下所有对象共享的变量
	//成员变量，成员自己独占的变量
	static {
		System.out.println(total);
	}
	public Child(int age, String name)
	{
		this.age =age;
		this.name=name;   	
	}
	public void joinGame()
	{
		total++;
		System.out.println("一个小孩加入了");
		System.out.println(total);
	}
}

/*总结：
 * 1、什么是类变量？
 *   类变量是该类所有对象共享的变量，任何一个该类的对象都可以访问和修改
 * 2、定义语法
 * 访问修饰符 static 数据类型  类变量名；
 * public static int total;
 * 3、访问 语法
 *   类名.类变量名         
 *   对象名.类变量名     下面这个好像不好
 *  
 */















