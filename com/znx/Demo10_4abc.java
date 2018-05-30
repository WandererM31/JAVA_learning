//2018.5.8第10讲46分钟
//方法重载
//例子，要求写一个类返回两个数的最大数，整数、浮点型
//名字相同，返回值系统自动判断调用
/*
 * 概念：类的同一种功能的多种实现方式，到底采用哪一种方式，取决于
 * 调用者给出的参数
 * 注意事项：
 * 1.方法名相同
 * 2.方法的参数类型，参数个数，顺序至少有一项不同
 * 3.方法的返回类型可以不同
 * 4.方法修饰符可以不同
 * 如果只是返回类型不同，不能构成重载，会重复
 * 如果只是控制访问修饰符号不一样，也不能重载，public protected
 */
package com.znx;

public class Demo10_4abc {

	public static void main(String[] args) {
		Abc abc =new Abc();
		System.out.println(abc.getMax(2, 4));
		System.out.println(abc.getMax(6.5f, 4));
		// TODO Auto-generated method stub

	}

}

class Abc
{
	public int getMax(int i,int j)
	{
		if(i>j)
		{
			return i;
		}
		else
		{
			return j;
		}
	}
	public float getMax(float i,float j)
	{
		if(i>j)
		{
			return i;
			
		}
		else
		{
			return j;
		}
		
	}
	
	public float getMax(float i,double j)
	{
		if(i>j)
		{
			return i;
			
		}
		else
		{
			return (float)j;
		}
		
	}
	
	//如果只是返回类型不一样，不能否构成重载
	public double getMax(float i,double  j)//重复
	{
		if(i>j)
		{
			return i;
			
		}
		else
		{
			return j;
		}
		
	}
	
}