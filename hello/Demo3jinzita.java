package hello;

public class Demo3jinzita {
//打印金字塔，数空格
	public static void main(String[] args) {
		//打四层
		int lay =4;//几层
		for (int i=1;i<=lay;i++)
		{
			//数空格
			for (int k=1;k<=lay-i;k++)
			{
				System.out.print(" ");
			}
			
			//打印星号
			for (int j=1;j<=2*i-1;j++)
			{
				//判断是顶层还是底层，镂空金字塔
				if (i ==1||i==lay) {
				System.out.print("*");}
				else {
					if (j==1||j==2*i-1)//如果是一行中第一个或最后一个则打星号
					{
						System.out.print("*");
					}
					else {//否则打空格
						System.out.print(" ");
					}
					}
				}System.out.println();//打换行
			}
			
			
		}
		
		// TODO Auto-generated method stub

	}


