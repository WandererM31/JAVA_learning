//2018.5.4
//��9�ο�ͷ����̬�����;�̬�����
package hello;

public class Demo8_3leibianliang {
	
	static int i=1; //�����ඨ�忪���ڴ棬�浽��Ĵ�����
	static //��̬�����,���ඨ���ʱ���Ѿ������ڴ棬��ʱû�ж���Ҳִ�С��ڴ�������ʱִֻ��һ��
	{
		System.out.println(i);
		System.out.println("a");
		i++;
	}
	
	public Demo8_3leibianliang() //���๹�캯��
	{
		System.out.println("b");
		i++;
	}
	
	public static void main(String[] args) {
		
		//ִ�о�̬����飬û�ж���Ҳִ��
		
		Demo8_3leibianliang t1 = new Demo8_3leibianliang();//ִ�о�̬����顢���캯��
		//System.out.println(t1.i);
		
		//Demo8_3leibianliang t2 = new Demo8_3leibianliang();//����ִ�о�̬�����
		//System.out.println(t2.i);
		Cog d = new Cog();
				
		// TODO Auto-generated method stub
	}
	
}


class Cog{ 
	static int i=6;  //û�ж���Ͳ���ִ�У�Ϊʲô�أ�����ȥ�龲̬�������������
	static
	{
		System.out.println(i);
		System.out.println("hahah");
		i++;
	}
}


