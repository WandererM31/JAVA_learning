//2018.5.5
//��9����java��������̵��Ĵ�����
//���󣺶���һ�����ʱ�򣬰�һ�����ﹲ�е����Ժ���Ϊ��ȡ�������γ�һ������ģ�壬��Ϊ����
//��װ����װ���ǰѳ�������ݺͶ����ݵĲ�����װ��һ�����ݱ��������ڲ���
//    �������������ֻ��ͨ������Ȩ�Ĳ�������Ա���������ܶ����ݽ��в���
//  --���ʿ������η������ַ������η���
//     1.public���������⹫��
/*     2.protected �ܱ������������ͬһ�����е��๫��
 *     3.Ĭ�ϼ���û���η�����ͬһ�������๫��
 *     4.private˽�У�ֻ���౾����Է��ʣ������⹫��
 *     ���忴�ʼǱ���¼
 *  --���ĸ���ͱ�Ҫ�ԣ�package
 *      ������������ͬһ����Ŀ�ж��������ȡͬһ�����֣����ͻ��ô�죿
 *      �������ã�����ͬ���Ĳ�ͬ���࣬��ܶ�ʱ�ܺõĹ����࣬���Ʒ��ʷ�Χ
 *      ������package hello;  package com.xiaoming,�������Ĵ�����
 *      �����淶��Сд �õ���� com.xiaoming.aaa.bbb һ��������
 *      �ֳɵĳ��ð���java.lang.* �Զ�����Ĳ���Ҫд����
 *               java.util.*   HashMap��
 *               java.net.*���翪������java.awt.*���ڹ��߰�
 *               �Լ�д��Ҳ���Դ�������а��и�����ʹ��
 *      �������import java.util.* �Ϳ����ð��������       
 *      
 *  
 *        
 */

package hello;//�������һ������ļ���ͷ

public class Demo9_2 {

	public static void main(String[] args) {
		Clerk clerk1 = new Clerk("s",24,456f);
		System.out.println(clerk1.getSal());
		// TODO Auto-generated method stub

	}

}

//ְԱ
class Clerk
{
	public String name;
	private int age;//˽�е�
	private float salary;
	
	public Clerk(String name, int age, float sal)
	{
		this.name=name;
		this.age=age;
		this.salary=sal;
	}
	//ͨ��һ����Ա����ȥ���ƺͷ���˽�е�����
	public float getSal()//�൱����һ���ӿڣ���Ա�������Է��ʳ�Ա�ڲ����б���
	{
		return this.salary; 
	}
	
	
	
	
	
	
	
	
	
	
}