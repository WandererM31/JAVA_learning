//2018.5.4
//��9�����෽��
package hello;

public class Demo9 {

	public static void main(String[] args) {
		
		Stu stu1 = new Stu(1,"a",450);
		Stu stu2 = new Stu(4,"b",440);	
		
		System.out.println(Stu.getTotalFee());//�����з���ֵ��ֱ�Ӵ�ӡ
		System.out.println("=======");
		
		int a = Stu.getTotalFee(); //�����з���ֵ����ֵ���ӡ
		System.out.println(a);
		System.out.println("=======");
		
		Stu.getTotalFee(); //�����ڲ��д�ӡ��ֱ�ӵ���
		
		// TODO Auto-generated method stub

	}

}

class Stu
{
	int age;
	String name;
	int fee;
	static int totalFee=0;
	
	public Stu(int age, String name, int fee)//���췽��
	{
		this.age=age;
		this.name=name;
		this.fee=fee;	
		totalFee+=fee;
	}

	//������ѧ��
	//��̬����ֻ�ܷ��ʾ�̬�������Ǿ�̬�������Է��ʾ�̬�ͷǾ�̬����
	public static int getTotalFee()
	{
		//totalFee += fee;  �����ܷ��ʷǾ�̬����fee
		System.out.println(totalFee);  //�������д��return����������
		return totalFee;
		//System.out.println(totalFee); ��unreachable code:����ֵ�����ͽ����ˣ�������ִ��
		
	}
	
	
}

//�����С�᣺
/*1��ʲôʱ���õ��������ͳ��ѧ�����ɷѶ��٣����ڹ���������
 * 2.�������ʵ������������
 * ����static Ϊ�������̬����������ʵ������
 * �����������صĹ���������
 * ʵ����������ÿ��������������
 * ������ķ��ʣ�����.�������
 */
//�෽��С�᣺
/*���ʣ�����.�෽��
 * 
 */

