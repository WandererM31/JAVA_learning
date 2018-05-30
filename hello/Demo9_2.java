//2018.5.5
//第9讲，java面向对象编程的四大特征
//抽象：定义一个类的时候，把一类事物共有的属性和行为提取出来，形成一个物理模板，称为抽象
//封装：封装就是把抽象的数据和对数据的操作封装在一起，数据被保护在内部，
//    程序的其他部分只有通过被授权的操作（成员方法）才能对数据进行操作
//  --访问控制修饰符：四种访问修饰符：
//     1.public公开，对外公开
/*     2.protected 受保护，对子类和同一个包中的类公开
 *     3.默认级别：没修饰符，向同一个包的类公开
 *     4.private私有，只有类本身可以访问，不对外公开
 *     具体看笔记本记录
 *  --包的概念和必要性：package
 *      比如两个人在同一个项目中定义的类想取同一个名字，会冲突怎么办？
 *      三大作用：区分同名的不同的类，类很多时很好的管理类，控制访问范围
 *      打包命令：package hello;  package com.xiaoming,会把下面的代码打包
 *      命名规范：小写 用点隔开 com.xiaoming.aaa.bbb 一般最多五层
 *      现成的常用包：java.lang.* 自动引入的不需要写就有
 *               java.util.*   HashMap类
 *               java.net.*网络开发包，java.awt.*窗口工具包
 *               自己写的也可以打包进现有包中给别人使用
 *      引入包：import java.util.* 就可以用包里的类了       
 *      
 *  
 *        
 */

package hello;//打包命令一般放在文件开头

public class Demo9_2 {

	public static void main(String[] args) {
		Clerk clerk1 = new Clerk("s",24,456f);
		System.out.println(clerk1.getSal());
		// TODO Auto-generated method stub

	}

}

//职员
class Clerk
{
	public String name;
	private int age;//私有的
	private float salary;
	
	public Clerk(String name, int age, float sal)
	{
		this.name=name;
		this.age=age;
		this.salary=sal;
	}
	//通过一个成员方法去控制和访问私有的属性
	public float getSal()//相当于是一个接口，成员方法可以访问成员内部所有变量
	{
		return this.salary; 
	}
	
	
	
	
	
	
	
	
	
	
}