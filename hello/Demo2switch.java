package hello;
//�����û������жϽ������ڼ����μ�4��switch���֧���
import java.io.*;

public class Demo2switch {

	public static void main(String[] args) throws IOException {
		//char c='a';
		String str;
		int a;
		BufferedReader buf;
		buf = new BufferedReader(new InputStreamReader(System.in));
		str = buf.readLine();
		a = Integer.parseInt(str);
		switch(a)
		{
		case 'a':
			System.out.println("1");
			int bb=10;
			System.out.println(bb);
			break;//ÿ��case���涼Ҫ��break����ȫ�����û���ж�
		case 'b':
			System.out.println("2");
		case 'c':
			System.out.println("3");
		default:
			System.out.println("bzd");
			
		}
		// TODO Auto-generated method stub
     
	}

}
