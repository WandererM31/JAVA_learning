//2018.5.8��10��46����
//��������
//���ӣ�Ҫ��дһ���෵�����������������������������
//������ͬ������ֵϵͳ�Զ��жϵ���
/*
 * ������ͬһ�ֹ��ܵĶ���ʵ�ַ�ʽ�����ײ�����һ�ַ�ʽ��ȡ����
 * �����߸����Ĳ���
 * ע�����
 * 1.��������ͬ
 * 2.�����Ĳ������ͣ�����������˳��������һ�ͬ
 * 3.�����ķ������Ϳ��Բ�ͬ
 * 4.�������η����Բ�ͬ
 * ���ֻ�Ƿ������Ͳ�ͬ�����ܹ������أ����ظ�
 * ���ֻ�ǿ��Ʒ������η��Ų�һ����Ҳ�������أ�public protected
 */
package com.znx;

public class Demo10_4abc {

	public static void main(String[] args) {
		Abc abc =new Abc();
		System.out.println(abc.getMax(2, 4));
		System.out.println(abc.getMax(6.5f, 4));
		// TODO Auto-generated method stub

	}

}

class Abc
{
	public int getMax(int i,int j)
	{
		if(i>j)
		{
			return i;
		}
		else
		{
			return j;
		}
	}
	public float getMax(float i,float j)
	{
		if(i>j)
		{
			return i;
			
		}
		else
		{
			return j;
		}
		
	}
	
	public float getMax(float i,double j)
	{
		if(i>j)
		{
			return i;
			
		}
		else
		{
			return (float)j;
		}
		
	}
	
	//���ֻ�Ƿ������Ͳ�һ�������ܷ񹹳�����
	public double getMax(float i,double  j)//�ظ�
	{
		if(i>j)
		{
			return i;
			
		}
		else
		{
			return j;
		}
		
	}
	
}