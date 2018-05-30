//2018.5.9
//第12讲 多态
//集成插件：myeclipse插件,eclipseme手机Java开发插件
//概念：一个引用（类型）在不同情况下的多种状态。通过指向父类的指针，来调用在不同子类中实现的方法
package com.znx;

public class D12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*Cat2 cat = new Cat2();
		cat.cry();
		Dog4 dog = new Dog4();
		dog.cry();
		*/
		
		//多态
		Animal2 an = new Cat2();
		an.cry();
		an=new Dog4();
		an.cry();
	}

}

//动物类
class Animal2
{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//动物叫声
	public void cry()
	{
		System.out.println("不知道怎么叫");
	}
	
	
}

class Dog4 extends Animal2
{
	//成员方法覆盖
	public void cry()
	{
		System.out.println("wangwang");
	}
}
class Cat2 extends Animal2
{
	//覆盖
	public void cry()
	{
		System.out.println("miaomiao");
	}
}



