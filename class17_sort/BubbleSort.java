//2018.5.24ð���������װ
//�������ݣ����������Ͳ����޸ģ�����������ᣬ�Ժ������
//�������͵Ĵ��������ô���
package class17_sort;

import java.util.Calendar;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,7,8,4,34,23,-1,9,6};
		
		//������������
		int len =80000;
		int arr2[] = new int [len];
		for(int i=0;i<len;i++)
		{   
			//random����һ��0~1����
			int t=(int)(Math.random()*10000);
			arr2[i]=t;
		}		

		Bubble bubble = new Bubble();//��������
		
		//����ǰ��ӡϵͳʱ��
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
		
		bubble.sort(arr2); //���ú���
			
		cal = Calendar.getInstance();//���µõ�ʵ��
		System.out.println(cal.getTime());
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		//�򵥲����Ĵ��ݣ��������ز����ض�����ı����
		int a =12;
		bubble.test(a);
		System.out.println("a="+a);
		
		int b=bubble.test2(a);
		System.out.println(b);
		
	}

}

//5.24��װ
class Bubble{ 
	
	public void sort(int arr[])
	{
		/*for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}*/
		for(int j=0;j<arr.length;j++)
		{
			for (int i=0;i<arr.length-j-1;i++)
			{
			if(arr[i]>arr[i+1])
			{
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}
			}
		} 
	}
	
	public void test(int a)
	{
		a++;
	}
	public int test2(int a)
	{
		return a++;
	}
	
}
