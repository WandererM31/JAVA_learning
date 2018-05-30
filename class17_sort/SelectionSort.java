//2018.5.24选择排序与随机生成数列、时间计算
//80000，运行2s，冒泡运行10s，效果显著
package class17_sort;

import java.util.*;

public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Select select= new Select();
		int arr[] = {1,6,-1,30};
		
		//构建无需数列
		int len =80000;
		int arr2[] = new int [len];
		for(int i=0;i<len;i++)
		{   
			//random产生一个0~1的数
			int t=(int)(Math.random()*10000);
			arr2[i]=t;
		}
		
		//排序前打印系统时间
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
		select.sort(arr2);
		
		cal = Calendar.getInstance();//重新得到实例
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
			
			//找出最小值
			for(int k=j+1;k<arr.length;k++)
			{
				if(min>arr[k])
				{
					min = arr[k];
					minIndex = k;
				}
			}
			
			//交换最小值和j位置数
			temp = arr[j];
			arr[j]=arr[minIndex];
			arr[minIndex]=temp;
			
		}
	}
}