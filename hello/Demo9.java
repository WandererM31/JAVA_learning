//2018.5.4
//第9讲，类方法
package hello;

public class Demo9 {

	public static void main(String[] args) {
		
		Stu stu1 = new Stu(1,"a",450);
		Stu stu2 = new Stu(4,"b",440);	
		
		System.out.println(Stu.getTotalFee());//函数有返回值，直接打印
		System.out.println("=======");
		
		int a = Stu.getTotalFee(); //函数有返回值，赋值后打印
		System.out.println(a);
		System.out.println("=======");
		
		Stu.getTotalFee(); //函数内部有打印，直接调用
		
		// TODO Auto-generated method stub

	}

}

class Stu
{
	int age;
	String name;
	int fee;
	static int totalFee=0;
	
	public Stu(int age, String name, int fee)//构造方法
	{
		this.age=age;
		this.name=name;
		this.fee=fee;	
		totalFee+=fee;
	}

	//返回总学费
	//静态方法只能访问静态变量，非静态方法可以访问静态和非静态变量
	public static int getTotalFee()
	{
		//totalFee += fee;  错。不能访问非静态变量fee
		System.out.println(totalFee);  //可以随便写但return必须放在最后
		return totalFee;
		//System.out.println(totalFee); 错，unreachable code:返回值后函数就结束了，不会再执行
		
	}
	
	
}

//类变量小结：
/*1、什么时候用到类变量：统计学生共缴费多少，属于公共的属性
 * 2.类变量与实例变量的区别：
 * 加上static 为类变量静态变量否则是实例变量
 * 类变量是类相关的公共的属性
 * 实例变量属于每个对象个体的属性
 * 类变量的访问：类名.类变量名
 */
//类方法小结：
/*访问：类名.类方法
 * 
 */

