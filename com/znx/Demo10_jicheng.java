//2018.5.8
//第10讲 继承，继承的必要性
//格式：class 子类 extends 父类
//子类继承成员属性和成员方法，父类私有属性无法继承private
//继承的注意事项：
/*1.子类最多只能继承一个父类.C++可以多重继承
 * 2.java所有的类都是object的子类, java.lang.Object
 * 可以多层继承
 * 3.jdk6中 有很多类，接口，异常，枚举，注释和错误，查jdk帮助文档
 * 
 */
package com.znx;

public class Demo10_jicheng {

	public static void main(String[] args) {
		Pupil p1 = new Pupil();
		p1.printName();//父类的方法也可以继承
		// TODO Auto-generated method stub

	}

}


//将学生的共有属性提出，做一个父类
class Stu{
	//定义成员属性
		public int age;
		public String name;
		public float fee;
		public void printName()
		{
			System.out.println("mingzi "+name);
		}
}

//小学生类
class Pupil extends Stu //继承Stu公有属性
{
	//交学费行为
	public void pay(float fee)
	{
		this.fee = fee;
	}
	
}
//多层继承
class Kid extends Pupil
{
	
}
//中学生类
class MiddleStu extends Stu
{
		//交学费行为
		public void pay(float fee)
		{
			this.fee = fee*0.8f;	
		}
}

//大学生类
class ColStu extends Stu
{
		//交学费行为
		public void pay(float fee)
		{
			this.fee = fee*0.1f;	
		}
}
