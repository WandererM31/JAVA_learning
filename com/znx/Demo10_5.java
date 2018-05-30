//2018.5.8
/*方法覆盖
 * 概念：子类有一个方法和父类某个方法的名称，返回类型，参数一样
 *      没说访问修饰符也得一样
 * 注意事项：
 * 1.子类方法的返回类型，参数，方法名称，要和父类完全一样，否则编译出错
 * 2.子类方法不能缩小父类方法的访问权限
 *    父类范围小，子类范围可以大，只大不小
 */

package com.znx;

public class Demo10_5 {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.cry();//调用父类函数，如果子类写一遍就是覆盖
		cat1.cry(4);//单纯的调用对象自己的成员函数
		Dog3 dog1 = new Dog3();
		dog1.cry();
		// TODO Auto-generated method stub
	}
}

class Animal
{
	int age;
	String name;
	public void cry()
	{
		System.out.println("我是动物，不知道怎么叫换");
	}
}
//猫类
class Cat extends Animal
{
	//子类成员函数覆盖父类
	/*public void cry()
	{
		System.out.println("miaomiao");
	}*/
	public void cry(int a)//参数不一致不是覆盖是自己单独的函数
	{
		System.out.println("miaomiao");
	}
}
class Dog3 extends Animal
{
	//覆盖父类
	/*public void cry()
	{
		System.out.println("汪汪");
	}*/
}




