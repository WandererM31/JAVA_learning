//2018.5.23��16��������
package class16_array;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//���������﷨��
		
		//1.ֱ�Ӷ����С
		float arr[] = new float[6];
		
		//2.�����������С
		int a[]; //����
		a = new int[5];
		
		int[] b;//����
		
		//3.���������ʼ��һ��
        int c[]= {2,4,5,6}; 
		
//Ԫ�ظ�ֵ��
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
