//2018.5.8
/*��������
 * ���������һ�������͸���ĳ�����������ƣ��������ͣ�����һ��
 *      û˵�������η�Ҳ��һ��
 * ע�����
 * 1.���෽���ķ������ͣ��������������ƣ�Ҫ�͸�����ȫһ��������������
 * 2.���෽��������С���෽���ķ���Ȩ��
 *    ���෶ΧС�����෶Χ���Դ�ֻ��С
 */

package com.znx;

public class Demo10_5 {

	public static void main(String[] args) {
		
		Cat cat1 = new Cat();
		cat1.cry();//���ø��ຯ�����������дһ����Ǹ���
		cat1.cry(4);//�����ĵ��ö����Լ��ĳ�Ա����
		Dog3 dog1 = new Dog3();
		dog1.cry();
		// TODO Auto-generated method stub
	}
}

class Animal
{
	int age;
	String name;
	public void cry()
	{
		System.out.println("���Ƕ����֪����ô�л�");
	}
}
//è��
class Cat extends Animal
{
	//�����Ա�������Ǹ���
	/*public void cry()
	{
		System.out.println("miaomiao");
	}*/
	public void cry(int a)//������һ�²��Ǹ������Լ������ĺ���
	{
		System.out.println("miaomiao");
	}
}
class Dog3 extends Animal
{
	//���Ǹ���
	/*public void cry()
	{
		System.out.println("����");
	}*/
}




