//2018.5.8��11��
//��ҵ1Լɪ�����ⶪ�������⣬��Сʱ����
//����:
package homework;

public class Josephu {
	public static void main(String[] args) {
		CycLink cyclink = new CycLink();
		cyclink.setLen(5);
		cyclink.createLink();
		cyclink.setK(2);
		cyclink.setM(2);
		cyclink.show();
		cyclink.play();
		// TODO Auto-generated method stub
	}
}

class Child  //node �ڵ���
{
	int no; //ÿ���ڵ��������������֣����ݱ��
	Child nextChild=null;//��ָ����һ���ڵ��ָ��
	//****�����һ��java��ζ���ָ�룿��������
	public Child(int no)
	{
		//��һ�����
		this.no = no;
	}
	
}

//��������
class CycLink
{
	//�ȶ���һ��ָ������ͷ������
	//ָ���һ���ڵ�����ò��ܶ�
	Child firstChild = null;//ͷָ��
	Child temp = null;//�����׵Ķ�ָ̬��
	int len = 0;//������
	int k=0; //�ӵڼ����˿�ʼ��
	int m=0; 
	
	public void setM(int m)
	{
		this.m=m;
	}
	
	//���������С
	public void setLen(int len)
	{
		this.len = len;
	}
	
	//���ôӵڼ����˿�ʼ����
	public void setK(int k)
	{
		this.k = k;
	}
	
	//��ʼ��Ϸ
	public void play() {
		
		Child temp = this.firstChild;
		//1.���ҵ���ʼ��������
		for (int i=1;i<k;i++)//ע��i�ķ�Χ
		{
			temp=temp.nextChild;
		}
		while(this.len!=1) {
		//2.��m��
		for (int j=1;j<m;j++)
		{
			temp = temp.nextChild;
		}
		//�ҵ�Ҫ��Ȧ��ǰһ��С��
		Child temp2 = temp;
		while(temp2.nextChild!=temp)//��Ϊ�ǵ�������
		{
			temp2=temp2.nextChild;
		}
		//3.������m��С���˳�Ȧ
		temp2.nextChild = temp.nextChild;
		//��tempָ����һ��������
		temp = temp.nextChild;
		this.len--;
		}
		
		//������һ��С��
		System.out.println(temp.no);
	}
	//��ʼ����������
	public void createLink()
	{
		for(int i=1;i<=len;i++)
		{
			if(i==1)//����ǵ�һ������
			{
				//������һ���ڵ�
				Child ch = new Child(i);//���û��if�򴴽�len���¶��Ľڵ㣬ֻ�б��
			    this.firstChild=ch;//���ͷָ��ָ������
			    this.temp=ch;//��ָ̬��Ҳָ����
			}else
			{   
				if(i==len)
				{
					Child ch=new Child(i);
					temp.nextChild = ch;
					temp=ch;
					temp.nextChild=this.firstChild;
				}else
				{
					Child ch = new Child(i);
					temp.nextChild=ch;//ָ����һ��
					temp=ch;//
				}
				
			}
			
		}
	}
    
	//��ӡ��������
	public void show()
    {   
		//����һ��������
    	Child temp=this.firstChild;
    	do {
    		System.out.println(temp.no);
    		temp=temp.nextChild;
    		
    	}while(temp!=this.firstChild);
    }
}





