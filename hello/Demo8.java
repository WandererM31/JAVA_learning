//2018.5.4
//��8�� java��������̣�this,��������෽�����Ĵ�����
//Ŀ�꣺�������ʲô��this��������෽�������������󣬷�װ���̳кͶ�̬
//���ܣ�this����Ҫ��

package hello;

public class Demo8 {

	public static void main(String[] args) {
		
		Dog dog1 = new Dog(2,"С��");//����һ������
		
		Person p1 = new Person(dog1,23,"���¸�");//����һֻ��Ҳ���Ե�
		Person p2 = new Person(dog1,24,"��");
		p1.showInfo();
		p1.dog.showInfo();		

	}

}

//����һ����
class Person
{
	int age;
	String name;
	Dog dog;//��������
	
	//���췽��
	public Person(Dog dog, int age, String name)
	{		
		//age=age;//���β��ػ�������ĳ�Ա�����������,�ɶ��Բ���
		this.age=age; //this.age��ʾ���age���Ժ󴴽��Ķ���ĳ�Ա������
		              //�����age���β�ʵ�ʴ�������
		              //this������һ������Ķ���ģ��������������
		this.name=name;
		this.dog = dog;
	}
	
	//��Ա��������ʾ�˵�����
	public void showInfo()
	{
		System.out.println("����"+ this.name);
	}
}

class Dog
{
	int age;
	String name;
	
	public Dog(int age, String name)
	{
		this.age = age;
		this.name = name;	
	}
	
	public void showInfo()
	{
		System.out.println("����"+ this.name);
	}
}

//�ܽ᣺1.java��������ÿ���������this������ǰ����
//2.thisֻ�����ඨ����ڲ�ʹ�ã��������ⲿʹ��















