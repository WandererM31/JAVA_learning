//2018.5.23��16��2���������ʹ��
//��17������
/*�����ܽ᣺
 *  ���������ڶ�������Ϊÿ���������ռ�new���� �����ܸ�ֵ
 *  �����С��������ָ�������ܶ�̬���룬�����ʱ���Ҫ֪�����
 *   
 */
package class16_array;
import java.io.*;

public class Array2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//�����������
		Dog dogs[]=new Dog[4];
		
		dogs[0]=new Dog();//��仰�ز�����
		
		//������������ֵ
	    //Exception in thread "main" java.lang.NullPointerException
		//ֱ����������д�����󣬿�ָ���쳣
		dogs[0].setName("����");
		dogs[0].setWeight(4.5f);
	
        //ѭ����ֵ���ӿ���̨����
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i=0;i<4;i++) {
			dogs[i]=new Dog();
			System.out.println("�����빷��"+(i+1));
			//�ӿ���̨��ȡ����
			String name = br.readLine();//ע���쳣����try catch
			//���ָ�������
			dogs[i].setName(name);
			
			System.out.println("�����빷����");
			String s_weight = br.readLine();//����ͣ��readline�����������Ͳ�������ȥ
			//ReadLine��ȡ�ַ�����ת��Ϊfloat
			float weight = Float.parseFloat(s_weight);
			dogs[i].setWeight(weight);
						
		}
		//��ƽ��
		float allweight = 0;
		for(int i =0;i<4;i++)
		{
			allweight+=dogs[i].getWeight();//˽�������޷�ֱ�ӷ���
		}
		System.out.println(allweight/dogs.length); //��������Ҳ�г���
        
		//��17������
		//�ҳ������С
		float maxWeight = dogs[0].getWeight();
		int maxIndex=0;
		for(int i=1;i<dogs.length;i++)
		{
			if(maxWeight<dogs[i].getWeight())
			{
				maxWeight = dogs[i].getWeight();
				maxIndex = i;
			}
		}
		System.out.println("�������Ĺ���"+(maxIndex+1)+"ֻ��"+dogs[maxIndex].getName()
				+"����"+dogs[maxIndex].getWeight());
		
		//�Ƚ��ַ��������Ƿ����equal
		//==�Ƚ����ݣ��Ƚ��ַ����ĵ�ַ
		
	}

}



class Dog{
	private String name;
	private int age;
	private float weight; 
	
	public float getWeight() { //����Ϊʲô��������
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
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
	
}
