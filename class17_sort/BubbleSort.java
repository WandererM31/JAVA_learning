//2018.5.24冒泡排序与封装
//参数传递，简单数据类型不会修改，复合类型则会，以后继续讲
//数组类型的传递是引用传递
package class17_sort;

import java.util.Calendar;

public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,5,7,8,4,34,23,-1,9,6};
		
		//构建无需数列
		int len =80000;
		int arr2[] = new int [len];
		for(int i=0;i<len;i++)
		{   
			//random产生一个0~1的数
			int t=(int)(Math.random()*10000);
			arr2[i]=t;
		}		

		Bubble bubble = new Bubble();//创建对象
		
		//排序前打印系统时间
        Calendar cal = Calendar.getInstance();
        System.out.println(cal.getTime());
		
		bubble.sort(arr2); //调用函数
			
		cal = Calendar.getInstance();//重新得到实例
		System.out.println(cal.getTime());
		
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		//简单参数的传递，函数返回不返回都不会改变参数
		int a =12;
		bubble.test(a);
		System.out.println("a="+a);
		
		int b=bubble.test2(a);
		System.out.println(b);
		
	}

}

//5.24封装
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
