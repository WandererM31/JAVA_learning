//第10讲 封装 包间引用规则
package com.znx;

public class Demo10test { //这也是一个类，叫共有类，与Dog属于同包

	public static void main(String[] args) {
		
		Dog dog1=new Dog();
		
		// TODO Auto-generated method stub

	}

}

class Dog
{
	public int a;
	protected String name;
	String color;
	private float price;
	
	public void ab1()//成员方法的修饰符不管是什么，成员函数都能访问该类里面所有的变量
	{
		System.out.println(a);
	}
}


//同一个java文件（就是一个后缀为java的文本）只能有一个public class  
//如果向使用多个class 有两中办法  
//    1 在你的java文件里的public class类外面写class类 前面不能加public  
//    2 在你的java文件里的public class类里面写public class类作为成员 

/*
public class Main {  
	  
    public static void main(String[] args) {  
        System.out.println("Hello World!");  
    }  
    public class Test1 {}  //正确  
}  
public class Test2{}//错误  
class  Test3{}//正确  
*/

