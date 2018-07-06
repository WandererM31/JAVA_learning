/*
 * 6.8第21讲集合-ArrayList
 * 该类也是实现了List的接口，实现了可变大小的数组，随机访问和遍历元素时，提供更好的性能。
 * 该类也是非同步的,在多线程的情况下不要使用。ArrayList 增长当前长度的50%，插入删除效率低。
 */
package class21_union;

import java.util.*;
public class C1_arraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Clerk clerk1 = new Clerk("A",20,1000);
		Clerk clerk2 = new Clerk("B",22,2000);
		Clerk clerk3 = new Clerk("C",23,4000);
		
		ArrayList a1 = new ArrayList();
		System.out.println(a1.size()); //大小
		//添加，可重复添加
		a1.add(clerk1); //添加的是clerk1这个名字，也就是它指向的对象的地址
		a1.add(clerk2); 
		a1.add(clerk3);
		a1.add(1,clerk3); //将对象插入到数组指定位置
		//访问
		System.out.println(a1.get(0));
		Clerk temp = (Clerk) a1.get(0);  //父类交给子类不允许，要强制转换（多态概念）
		System.out.println(temp.getAge()); 
        
		//遍历数组中所有对象
		for(int i=0;i<a1.size();i++)
		{
			Clerk temp1 = (Clerk)a1.get(i);
			System.out.println(temp1.getName()); 
		}
		//删除数组中对象
		System.out.println("====删除===");
		a1.remove(0);//移除此列表中指定位置上的元素。向左移动所有后续元素（将其索引减 1）。
		a1.remove(clerk3);//remove(object o)移除此列表中首次出现的指定元素
		for(int i=0;i<a1.size();i++)
		{
			Clerk temp1 = (Clerk)a1.get(i);
			System.out.println(temp1.getName()); 
		}
	}

}
class Clerk 
{
	private int age;
	private String name;
	private int salary;
	
	public Clerk(String name, int age, int salary)
	{
		this.name = name;
		this.age = age;
		this.salary = salary;
	}
	
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
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}
