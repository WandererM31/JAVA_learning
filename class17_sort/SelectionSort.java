//2018.5.24ѡ������������������С�ʱ�����
//80000������2s��ð������10s��Ч������
package class17_sort;

import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Select select= new Select();
		int arr[] = {1,6,-1,30};
		
		//������������
		int len =80000;
		int arr2[] = new int [len];
		for(int i=0;i<len;i++)
		{   
			//random����һ��0~1����
			int t=(int)(Math.random()*10000);
			arr2[i]=t;
		}
		
		//����ǰ��ӡϵͳʱ��
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
		select.sort(arr2);
		
		cal = Calendar.getInstance();//���µõ�ʵ��
		System.out.println(cal.getTime());
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}

	}

}

class Select
{
	public void sort(int arr[])
	{
		int temp=0;
		for(int j=0;j<arr.length-1;j++)
		{
			int min = arr[j];
			int minIndex = j;
			
			//�ҳ���Сֵ
			for(int k=j+1;k<arr.length;k++)
			{
				if(min>arr[k])
				{
					min = arr[k];
					minIndex = k;
				}
			}
			
			//������Сֵ��jλ����
			temp = arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
	}
}