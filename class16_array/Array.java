//2018.5.23第16讲：数组
package class16_array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//定义数组语法：
		
		//1.直接定义大小
		float arr[] = new float[6];
		
		//2.先声明后定义大小
		int a[]; //声明
		a = new int[5];
		
		int[] b;//声明
		
		//3.声明定义初始化一体
        int c[]= {2,4,5,6}; 
		
//元素赋值：
		arr[0]=3;
		arr[1]=4;
		arr[2]=5;
		
		float all=0;
		for(int i=0;i<6;i++)
		{
			all += arr[i];
		}
		System.out.println(all);
	}

}
