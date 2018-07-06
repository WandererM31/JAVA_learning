//2018.6.9第25讲：泛型异常
/*
 * 泛型本质是参数化类型，所操作的数据类型被指定为一个参数，用在类、接口、和方法创建中
 * 作用：安全简单。检查类型安全，不用手动强制转换，提高代码重用率
 */
package class13port_abstract;
import java.util.*;
public class D25_fanxing {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Dog> al = new ArrayList<Dog>();
		Dog dog1 = new Dog();
        al.add(dog1);
        Dog temp = al.get(0);
        //Chicken temp = (Chicken)al.get(0);
	}

}
class Chicken
{
	private String color;
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public int getName() {
		return name;
	}
	public void setName(int name) {
		this.name = name;
	}
	private int name;
	
}
class Dog
{
	private int age;
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	private String name;
	
}