//2018.5.8
//��10�� �̳У��̳еı�Ҫ��
//��ʽ��class ���� extends ����
//����̳г�Ա���Ժͳ�Ա����������˽�������޷��̳�private
//�̳е�ע�����
/*1.�������ֻ�ܼ̳�һ������.C++���Զ��ؼ̳�
 * 2.java���е��඼��object������, java.lang.Object
 * ���Զ��̳�
 * 3.jdk6�� �кܶ��࣬�ӿڣ��쳣��ö�٣�ע�ͺʹ��󣬲�jdk�����ĵ�
 * 
 */
package com.znx;

public class Demo10_jicheng {

	public static void main(String[] args) {
		Pupil p1 = new Pupil();
		p1.printName();//����ķ���Ҳ���Լ̳�
		// TODO Auto-generated method stub

	}

}


//��ѧ���Ĺ��������������һ������
class Stu{
	//�����Ա����
		public int age;
		public String name;
		public float fee;
		public void printName()
		{
			System.out.println("mingzi "+name);
		}
}

//Сѧ����
class Pupil extends Stu //�̳�Stu��������
{
	//��ѧ����Ϊ
	public void pay(float fee)
	{
		this.fee = fee;
	}
	
}
//���̳�
class Kid extends Pupil
{
	
}
//��ѧ����
class MiddleStu extends Stu
{
		//��ѧ����Ϊ
		public void pay(float fee)
		{
			this.fee = fee*0.8f;	
		}
}

//��ѧ����
class ColStu extends Stu
{
		//��ѧ����Ϊ
		public void pay(float fee)
		{
			this.fee = fee*0.1f;	
		}
}
