//2018.5.4
//第8课 java面向对象编程：this,类变量，类方法，四大特征
//目标：初步理解什么是this，类变量类方法，初步理解抽象，封装，继承和多态
//功能：this的重要性

package hello;

public class Demo8 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog(2,"小黄");//创建一个对象
		
		Person p1 = new Person(dog1,23,"郭德纲");//共享一只狗也可以的
		Person p2 = new Person(dog1,24,"王");
		p1.showInfo();
		p1.dog.showInfo();		

	}

}

//定义一个类
class Person
{
	int age;
	String name;
	Dog dog;//引用类型
	
	//构造方法
	public Person(Dog dog, int age, String name)
	{		
		//age=age;//是形参呢还是上面的成员变量？会混淆,可读性不好
		this.age=age; //this.age表示这个age是以后创建的对象的成员变量，
		              //后面的age是形参实际传进来的
		              //this是属于一个具体的对象的，而不是属于类的
		this.name=name;
		this.dog = dog;
	}
	
	//成员方法：显示人的名字
	public void showInfo()
	{
		System.out.println("人名"+ this.name);
	}
}

class Dog
{
	int age;
	String name;
	
	public Dog(int age, String name)
	{
		this.age = age;
		this.name = name;	
	}
	
	public void showInfo()
	{
		System.out.println("狗名"+ this.name);
	}
}

//总结：1.java虚拟机会给每个对象分配this，代表当前对象
//2.this只能在类定义的内部使用，不能在外部使用















