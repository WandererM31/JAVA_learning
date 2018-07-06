/*
 * 6.8��21������-ArrayList
 * ����Ҳ��ʵ����List�Ľӿڣ�ʵ���˿ɱ��С�����飬������ʺͱ���Ԫ��ʱ���ṩ���õ����ܡ�
 * ����Ҳ�Ƿ�ͬ����,�ڶ��̵߳�����²�Ҫʹ�á�ArrayList ������ǰ���ȵ�50%������ɾ��Ч�ʵ͡�
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
		System.out.println(a1.size()); //��С
		//��ӣ����ظ����
		a1.add(clerk1); //��ӵ���clerk1������֣�Ҳ������ָ��Ķ���ĵ�ַ
		a1.add(clerk2); 
		a1.add(clerk3);
		a1.add(1,clerk3); //��������뵽����ָ��λ��
		//����
		System.out.println(a1.get(0));
		Clerk temp = (Clerk) a1.get(0);  //���ཻ�����಻����Ҫǿ��ת������̬���
		System.out.println(temp.getAge()); 
        
		//�������������ж���
		for(int i=0;i<a1.size();i++)
		{
			Clerk temp1 = (Clerk)a1.get(i);
			System.out.println(temp1.getName()); 
		}
		//ɾ�������ж���
		System.out.println("====ɾ��===");
		a1.remove(0);//�Ƴ����б���ָ��λ���ϵ�Ԫ�ء������ƶ����к���Ԫ�أ����������� 1����
		a1.remove(clerk3);//remove(object o)�Ƴ����б����״γ��ֵ�ָ��Ԫ��
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
