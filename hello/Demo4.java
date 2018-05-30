//第5课类与对象
//第6，7课，成员变量/属性，成员方法，构造方法
//2018.5.3-5.4
package hello;

public class Demo4 {

	public static void main(String[] args) {
		
		//一、类和对象的创建，成员变量的调用
		Cat cat1 = new Cat();//创建一只猫对象
		cat1.age = 3;//访问类的成员
		cat1.name = "xiaobai";
		cat1.color = "white";
		
		Cat cat2 = new Cat();
		cat2.age = 100;
		cat2.name ="xiaohua";
		cat2.color = "flower";
				
		//三、构造方法
        //Master a = new Master(); //没写构造方法的时候创建对象写法。系统用默认构造方法
		//定义一个对象后就开辟了内存空间
		//没有构造方法的时候，系统自动创建一个构造方法，而你设计的构造方法把默认构造方法给覆盖了，所以创建对象不能再写没有参数的方式
        Master a = new Master(1,"aaaaa");//添加了构造方法后创建对象的形式
        Master bb =new Master(2,"bbbbb");
        Master c = new Master("aaaaa");//调用构造函数2，根据传入的实参不同会调用不同的构造函数
        
        a.age=1;
        a.name = "hah";
                
        Master b; //定义了一个名字没有分配内存空间
        b=a;// 把a的地址给了b，a,b指向了同一个空间，没有额外分配空间
        b.age =4;//如果输出则a.age也是4，b和a都可以访问、改变成员变量
        System.out.println(b.age);

        
        //二、成员方法
        bb.speack();//调用成员方法
        bb.jisuan();
        bb.jisuan(5);//调用的是两个不同的函数，函数重载
        
        bb.addd(12, 10); //调用函数，函数里有打印语句调用函数就直接打印，没有的话就得再写
        int res=bb.addd2(12, 10); //函数有返回值，可内部不写打印，调用后赋值，再打印
        System.out.println(res);   
        System.out.println(bb.addd2(23, 34));
        
        
	}

}
class Cat //类名首字母大写
{
	int age; //类的成员变量（成员属性）
	String name;
	String color;
	Master mymaster;//引用类型
	//一、类与对象的区别和联系：
	/*
	 * 类是抽象的概念的代表一类事物比如人类猫类
	 * 对象是具体的实际的代表一个具体事物
	 * 类是对象的模板，对象是类的具体实例
	 */
}

class Master
{
	int age;
	String name;
	
	//5月4日
	//三、构造方法总结：
	//构造方法主要用途是完成对新对象的初始化，别啥都往里面写
	//构造方法无返回值
	//在创建新对象时系统自动调用该类的构造方法
	//一个类可以由多个构造方法，但是不能重复定义，这些构造方法必须是不相同的
	//每个类都有一个默认构造方法，自定义的构造方法会覆盖系统默认的构造方法
	public Master(int age, String name)
	{
		age =age;
		name = name;
		System.out.println("我是构造1");
	}
	
	//构造方法2，一个类可以有很多个构造方法，调用时取决于参数值
	public Master(String name)
	{		
		name = name;
		System.out.println("我是构造2");
	}
	

	//二、成员函数（行为）
	//命名规范：1.驼峰法myCry 2.下划线法my_cry 3.方法名首字母一般小写
	
	public void speack()//该方法可打印一句话
	{
		System.out.println("aaa");
	}
	
	public void jisuan()//该方法可计算0——9的和
	{
		int re=0;
		for (int i=0;i<10;i++)
		{
			re=re+i;
		}
		System.out.println(re);
	}
		
	//带参数和不带参数的同名成员函数不会冲突，函数重载
	public void jisuan(int n)//该方法可从外部接收一个数求和
	{
		int re=0;//作用域不同，变量名相同不冲突
		for (int i=0;i<=n;i++)
		{
			re=re+i;
		}
		System.out.println("结果是"+re);
	}
	
	//计算两个数的和
	public void addd(int num1, int num2)
	{
		int re=0;
		re = num1+num2;
		System.out.println("heshi"+re);
	}
	
	//计算两个数的和并把结果返回给调用它的函数
	public int addd2(int num1,int num2)//返回结果的类型和指定的返回类型必须一样
	{
		return num1+num2;
		
	}
	//成员方法总结：
	//1、在调用某个成员方法的时候，给出的具体数据类型和个数要和形参和函数返回值匹配
	//2、方法参数列表可以多个，可以没有返回值

}




