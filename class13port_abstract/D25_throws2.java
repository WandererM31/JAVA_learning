//2018.6.10��26�����쳣2���׳��쳣�������ߴ��������淢������һ�㲶��
//��ͣ�����׳��쳣��㲻��λ�ã�������

package class13port_abstract;

import java.io.*;

public class D25_throws2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Father f = new Father();
		f.test2();

	}

}
class Father
{
	private Son son;
	public Father(){
		Son son = new Son();
	}
	public void test2() {
		try {
			son.test();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("�����ڴ���");
			e.printStackTrace();
		} //���봦���쳣��Ҫô�������׳���Ҫô����catch
		  //son.test�ǵ�����
	}
}
class Son
{
	public void test() throws Exception { //�׳��쳣�������ߴ���
		FileReader fr = null;
		fr = new FileReader("d:\\dd.txt");
		//�׳��쳣throws��Exception, IOException, FileNoFoundException
	}
}