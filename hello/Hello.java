package hello;

import java.io.*;

public class Hello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     //System.out.println("hello!");
		try {
			//shuruliu
			InputStreamReader isr= new InputStreamReader(System.in);
			BufferedReader br = new BufferedReader(isr);
			
			//������ʾ
		    System.out.println("�������һ����");
			//�ӿ���̨��ȡһ������
			String a1= br.readLine();
			
			System.out.println("�������2����");
		
			String a2= br.readLine();
			
			float num1 = Float.parseFloat(a1);
			float num2 = Float.parseFloat(a2);
			
			if(num1>num2)
			{
				System.out.println("��һ����");
			}
			if(num1==num2)
			{
				System.out.println("equal");
			}
			if(num1<num2)
			{
				System.out.println("�ڶ�����");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	
	}

}
