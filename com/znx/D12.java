//2018.5.9
//��12�� ��̬
//���ɲ����myeclipse���,eclipseme�ֻ�Java�������
//���һ�����ã����ͣ��ڲ�ͬ����µĶ���״̬��ͨ��ָ�����ָ�룬�������ڲ�ͬ������ʵ�ֵķ���
package com.znx;

public class D12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		/*Cat2 cat = new Cat2();
		cat.cry();
		Dog4 dog = new Dog4();
		dog.cry();
		*/
		
		//��̬
		Animal2 an = new Cat2();
		an.cry();
		an=new Dog4();
		an.cry();
	}

}

//������
class Animal2
{
	String name;
	int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	//�������
	public void cry()
	{
		System.out.println("��֪����ô��");
	}
	
	
}

class Dog4 extends Animal2
{
	//��Ա��������
	public void cry()
	{
		System.out.println("wangwang");
	}
}
class Cat2 extends Animal2
{
	//����
	public void cry()
	{
		System.out.println("miaomiao");
	}
}



