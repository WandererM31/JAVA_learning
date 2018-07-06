/*
 * 6.8第22讲，arraylist案例：
 * arraylist是java链表， 直接用下标索引的插入删除可以不用遍历
 * 但若是比对对象中的成员变量（key找value），还是得遍历查找
 * 比如删除编号为X号的员工，X是每个员工对象下的成员变量，可不一定是对象在数组中的索引，所以并不能直接删而是要遍历
 */
package class21_union;
import java.util.*;
public class C1_arraylist2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
//定义一个类实现对员工的操作
class Empmanger
{
	
}

class Emp
{
	private String number;
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getSalary() {
		return salary;
	}
	public void setSalary(float salary) {
		this.salary = salary;
	}
	private String name;
	private float salary;
	public Emp(String number, String name,float salary)
	{
		
	}
}