package hello;

public class Demo3jinzita {
//��ӡ�����������ո�
	public static void main(String[] args) {
		//���Ĳ�
		int lay =4;//����
		for (int i=1;i<=lay;i++)
		{
			//���ո�
			for (int k=1;k<=lay-i;k++)
			{
				System.out.print(" ");
			}
			
			//��ӡ�Ǻ�
			for (int j=1;j<=2*i-1;j++)
			{
				//�ж��Ƕ��㻹�ǵײ㣬�οս�����
				if (i ==1||i==lay) {
				System.out.print("*");}
				else {
					if (j==1||j==2*i-1)//�����һ���е�һ�������һ������Ǻ�
					{
						System.out.print("*");
					}
					else {//�����ո�
						System.out.print(" ");
					}
					}
				}System.out.println();//����
			}
			
			
		}
		
		// TODO Auto-generated method stub

	}


