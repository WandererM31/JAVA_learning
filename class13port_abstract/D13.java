/*2018.5.10��13��
 * ������ı�Ҫ��
 * ������෽����ȷ��ʱ������Ϊ���󷽷�������Ҳ����Ϊ������
 * abstract ����
 * ע�����1.�����಻��ʵ������
 *          2.���������û�г��󷽷�
 *          3.���󷽷�������������ɳ�����
 *          4.���󷽷�����������
 *          5.�����ڸ�����ʵ�֣������������õ�
 */
package class13port_abstract;

public class D13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        //1. Animal an = new Animal();
	    //���󣬳����಻��ʵ����
	}

}
abstract class Animal //������
{
	String name;
	int age;
	/*public void cry()//��������̳к��һֱ�ò���
	{
		System.out.println("��֪����ô��");
	}*/
	abstract public void cry();//���󷽷���������ȷ��
	//������󷽷��൱��Ҫ����̳�ʱ�������������
	//4.���������壬������{}
}

//������Ҳ���Ա��̳�,�������ǳ����࣬
//���� Ҫ�ѳ������е����ҳ��󷽷�ȫ��ʵ��
class Cat extends Animal
{
	public void cry()//ʵ�ָ���cry
	{
		//����⺯����ʲô����дҲ��ʵ���˸��෽��
		System.out.println("����");
	}
}



