//2018.5.4
//��8�� java��������̣�this,��������෽�����Ĵ�����
//Ŀ�꣺�������ʲô��this��������෽�������������󣬷�װ���̳кͶ�̬

//8.2�����

package hello;

public class Demo8_2 {

	public static void main(String[] args) {
		
/*		int total=0;
		
		Child ch1 = new Child(3,"niun");
		ch1.joinGame();
		total++;
		Child ch2=new Child(4,"a");
		ch2.joinGame();
		total++;
		System.out.println(total);
*/		//���ִ�����total�Ѿ������˶��󣬲�������������˼��
		
//////�Ľ��������
		Child ch1 = new Child(3,"niun");
		ch1.joinGame();
		
		Child ch2=new Child(4,"a");
		ch2.joinGame();
		
		//System.out.println(ch1.total);//�������ʾ��ʲô��˼����
		System.out.println(Child.total);
		
		// TODO Auto-generated method stub

	}

}

/*
class Child 
{
	int age;
	String name;	
	public Child(int age, String name)
	{
		this.age =age;
		this.name=name;   	
	}
	public void joinGame()
	{
		System.out.println("һ��С��������");
	}
}
*/


///////�������
class Child 
{
	int age;
	String name;
	static int total=0;
	//���þ�̬�����������̬�������Ա��κ�һ��������ʣ��൱������������ж�����ı���
	//��Ա��������Ա�Լ���ռ�ı���
	static {
		System.out.println(total);
	}
	public Child(int age, String name)
	{
		this.age =age;
		this.name=name;   	
	}
	public void joinGame()
	{
		total++;
		System.out.println("һ��С��������");
		System.out.println(total);
	}
}

/*�ܽ᣺
 * 1��ʲô���������
 *   ������Ǹ������ж�����ı������κ�һ������Ķ��󶼿��Է��ʺ��޸�
 * 2�������﷨
 * �������η� static ��������  ���������
 * public static int total;
 * 3������ �﷨
 *   ����.�������         
 *   ������.�������     ����������񲻺�
 *  
 */















