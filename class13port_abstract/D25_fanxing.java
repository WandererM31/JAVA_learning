//2018.6.9��25���������쳣
/*
 * ���ͱ����ǲ��������ͣ����������������ͱ�ָ��Ϊһ�������������ࡢ�ӿڡ��ͷ���������
 * ���ã���ȫ�򵥡�������Ͱ�ȫ�������ֶ�ǿ��ת������ߴ���������
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