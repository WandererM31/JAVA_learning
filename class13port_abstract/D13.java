/*2018.5.10第13讲
 * 抽象类的必要性
 * 概念：父类方法不确定时，定义为抽象方法，父类也定义为抽象类
 * abstract 修饰
 * 注意事项：1.抽象类不能实例化！
 *          2.抽象类可以没有抽象方法
 *          3.抽象方法的类必须声明成抽象类
 *          4.抽象方法不能有主体
 *          5.不能在父类里实现，必须在子类用到
 */
package class13port_abstract;

public class D13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. Animal an = new Animal();
	    //错误，抽象类不能实例化
	}

}
abstract class Animal //抽象类
{
	String name;
	int age;
	/*public void cry()//这个方法继承后就一直用不到
	{
		System.out.println("不知道怎么叫");
	}*/
	abstract public void cry();//抽象方法，方法不确定
	//这个抽象方法相当于要求你继承时必须用这个方法
	//4.不能有主体，不能有{}
}

//抽象类也可以被继承,当父类是抽象类，
//我们 要把抽象类中的左右抽象方法全部实现
class Cat extends Animal
{
	public void cry()//实现父类cry
	{
		//如果这函数里什么都不写也叫实现了父类方法
		System.out.println("喵喵");
	}
}



