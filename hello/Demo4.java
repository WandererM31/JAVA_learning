//��5���������
//��6��7�Σ���Ա����/���ԣ���Ա���������췽��
//2018.5.3-5.4
package hello;

public class Demo4 {

	public static void main(String[] args) {
		
		//һ����Ͷ���Ĵ�������Ա�����ĵ���
		Cat cat1 = new Cat();//����һֻè����
		cat1.age = 3;//������ĳ�Ա
		cat1.name = "xiaobai";
		cat1.color = "white";
		
		Cat cat2 = new Cat();
		cat2.age = 100;
		cat2.name ="xiaohua";
		cat2.color = "flower";
				
		//�������췽��
        //Master a = new Master(); //ûд���췽����ʱ�򴴽�����д����ϵͳ��Ĭ�Ϲ��췽��
		//����һ�������Ϳ������ڴ�ռ�
		//û�й��췽����ʱ��ϵͳ�Զ�����һ�����췽����������ƵĹ��췽����Ĭ�Ϲ��췽���������ˣ����Դ�����������дû�в����ķ�ʽ
        Master a = new Master(1,"aaaaa");//����˹��췽���󴴽��������ʽ
        Master bb =new Master(2,"bbbbb");
        Master c = new Master("aaaaa");//���ù��캯��2�����ݴ����ʵ�β�ͬ����ò�ͬ�Ĺ��캯��
        
        a.age=1;
        a.name = "hah";
                
        Master b; //������һ������û�з����ڴ�ռ�
        b=a;// ��a�ĵ�ַ����b��a,bָ����ͬһ���ռ䣬û�ж������ռ�
        b.age =4;//��������a.ageҲ��4��b��a�����Է��ʡ��ı��Ա����
        System.out.println(b.age);

        
        //������Ա����
        bb.speack();//���ó�Ա����
        bb.jisuan();
        bb.jisuan(5);//���õ���������ͬ�ĺ�������������
        
        bb.addd(12, 10); //���ú������������д�ӡ�����ú�����ֱ�Ӵ�ӡ��û�еĻ��͵���д
        int res=bb.addd2(12, 10); //�����з���ֵ�����ڲ���д��ӡ�����ú�ֵ���ٴ�ӡ
        System.out.println(res);   
        System.out.println(bb.addd2(23, 34));
        
        
	}

}
class Cat //��������ĸ��д
{
	int age; //��ĳ�Ա��������Ա���ԣ�
	String name;
	String color;
	Master mymaster;//��������
	//һ�����������������ϵ��
	/*
	 * ���ǳ���ĸ���Ĵ���һ�������������è��
	 * �����Ǿ����ʵ�ʵĴ���һ����������
	 * ���Ƕ����ģ�壬��������ľ���ʵ��
	 */
}

class Master
{
	int age;
	String name;
	
	//5��4��
	//�������췽���ܽ᣺
	//���췽����Ҫ��;����ɶ��¶���ĳ�ʼ������ɶ��������д
	//���췽���޷���ֵ
	//�ڴ����¶���ʱϵͳ�Զ����ø���Ĺ��췽��
	//һ��������ɶ�����췽�������ǲ����ظ����壬��Щ���췽�������ǲ���ͬ��
	//ÿ���඼��һ��Ĭ�Ϲ��췽�����Զ���Ĺ��췽���Ḳ��ϵͳĬ�ϵĹ��췽��
	public Master(int age, String name)
	{
		age =age;
		name = name;
		System.out.println("���ǹ���1");
	}
	
	//���췽��2��һ��������кܶ�����췽��������ʱȡ���ڲ���ֵ
	public Master(String name)
	{		
		name = name;
		System.out.println("���ǹ���2");
	}
	

	//������Ա��������Ϊ��
	//�����淶��1.�շ巨myCry 2.�»��߷�my_cry 3.����������ĸһ��Сд
	
	public void speack()//�÷����ɴ�ӡһ�仰
	{
		System.out.println("aaa");
	}
	
	public void jisuan()//�÷����ɼ���0����9�ĺ�
	{
		int re=0;
		for (int i=0;i<10;i++)
		{
			re=re+i;
		}
		System.out.println(re);
	}
		
	//�������Ͳ���������ͬ����Ա���������ͻ����������
	public void jisuan(int n)//�÷����ɴ��ⲿ����һ�������
	{
		int re=0;//������ͬ����������ͬ����ͻ
		for (int i=0;i<=n;i++)
		{
			re=re+i;
		}
		System.out.println("�����"+re);
	}
	
	//�����������ĺ�
	public void addd(int num1, int num2)
	{
		int re=0;
		re = num1+num2;
		System.out.println("heshi"+re);
	}
	
	//�����������ĺͲ��ѽ�����ظ��������ĺ���
	public int addd2(int num1,int num2)//���ؽ�������ͺ�ָ���ķ������ͱ���һ��
	{
		return num1+num2;
		
	}
	//��Ա�����ܽ᣺
	//1���ڵ���ĳ����Ա������ʱ�򣬸����ľ����������ͺ͸���Ҫ���βκͺ�������ֵƥ��
	//2�����������б���Զ��������û�з���ֵ

}




