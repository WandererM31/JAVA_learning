//2018.6.9��25�����쳣
/* �쳣������ԭ���кܶ࣬ͨ���������¼����ࣺ
1���û������˷Ƿ����ݡ�
2��Ҫ�򿪵��ļ������ڡ�
3������ͨ��ʱ�����жϣ�����JVM�ڴ������
��Щ�쳣�е�����Ϊ�û����������е��ǳ����������ģ���������һЩ����Ϊ�����������ġ�
* 
* �쳣���ࣺ
������쳣��java.lang.Exception ������ȷ��������������������쳣���û������IO����,������ļ������ڣ�java������Ҫ��ǿ�ƴ�����ܱ���
����ʱ�쳣��java.lang.RuntimeException ����ʱ�쳣�ǿ��ܱ�����Ա������쳣���������쳣�෴������ʱ�쳣�����ڱ���ʱ�����ԡ�
����java.lang.Error �������쳣�������������Ա���Ƶ����⡣�����ڴ�����ͨ�������ԡ����磬��ջ���ʱ��һ������ͷ����ˣ������ڱ���Ҳ��鲻���ġ�
     һ����ټ�����ͨ��������������Դ�ڳ���bug��Դ�ڻ�������
 * 
 * Exception��Ĳ�Σ�
java.lang.Object
  �̳��� java.lang.Throwable
      �̳��� java.lang.Exception
 */
package class13port_abstract;
import java.io.*;
import java.net.*;
public class D25_throws {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//����쳣 1.���ļ�:��ʾ�ļ�������
		FileReader fr = null;
		try {
			//��һ�д����׳��쳣���ж�ִ�У�ʣ�µ�try��䶼��ִ�У�ֱ�ӽ���catch���
			//���catch��������ƥ���쳣���Ǹ�catch���
			fr = new FileReader("d:\\aa.txt"); //��Ӧe1
			Socket s = new Socket("192.1682.1.23",78); //ƥ��e2
			System.out.println("go on");
			
		}catch(FileNotFoundException e){ 
			//Exception e��󲶻񣬲������п��ܵĴ���
			//catch(FileNotFoundException e) ���ڷֲ���������С������ʲô��Ͳ���ʲô�������˱��
			
			//���쳣��Ϣ��������ų�bug��
			System.out.println("ok1");
			e.printStackTrace();//ϵͳ�Ҳ���ָ���ļ�
			
		}catch(IOException e2) {
			
			System.out.println("ok2");
			System.out.println("message��="+e2.getMessage());
			e2.printStackTrace();
			
		}finally {
			
			System.out.println("����finally");
			if(fr!=null) {
			
				try {
					fr.close(); //�ر��ļ�
				} catch (IOException e) {
				
					e.printStackTrace();
				}
			}
			
		}
		
		System.out.println("ok");//�������
		
		//2.����Զ�̶˿�192.168.12.12 ip�˿ں�
		//Socket s = new Socket("192.168.1.23",78);
		
		//�����쳣��0����������Խ�硢��β�����淶
		//int a=4/0; //java.lang.ArithmeticException
              
	}

}
/*�쳣����
 * 1.try...catch ���쳣�������жϳ����׳��쳣���Լ�������׳����ϼ�����
 *   finally  ����try����û�쳣������ִ�С�һ������Ҫ�رյ���Դ���ļ������ӣ��ڴ棩
 *   finally����ִ�е������finally�����쳣�����������߳�������ǰ�������System.exit();�ر�CPU
 * 2.�׳��쳣�������ߣ�
 * 
 */








