package hello;

public class Demo3for {

	public static void main(String[] args) {
		for (int i=0;i<4;i++)
		{
			System.out.println("a");
		}
		
		//先判断再执行
		int a=0;
		while(a<5)
		{
			System.out.println("ha");
			a++;
		}
		
		
		//先执行后判断
		int b=0;
		do {
			System.out.println("haha");
			b++;
		}while(b<2);
		// TODO Auto-generated method stub

	}

}
