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
			
			//给出提示
		    System.out.println("请输入第一个数");
			//从控制台读取一行数据
			String a1= br.readLine();
			
			System.out.println("请输入第2个数");
		
			String a2= br.readLine();
			
			float num1 = Float.parseFloat(a1);
			float num2 = Float.parseFloat(a2);
			
			if(num1>num2)
			{
				System.out.println("第一个大");
			}
			if(num1==num2)
			{
				System.out.println("equal");
			}
			if(num1<num2)
			{
				System.out.println("第二个大");
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
	
	}

}
