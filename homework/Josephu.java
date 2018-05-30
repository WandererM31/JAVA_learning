//2018.5.8第11讲
//作业1约瑟夫问题丢手帕问题，半小时做出
//过程:
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

class Child  //node 节点类
{
	int no; //每个节点对象包括两个部分，数据编号
	Child nextChild=null;//和指向下一个节点的指针
	//****这里查一下java如何定义指针？？？？？
	public Child(int no)
	{
		//给一个编号
		this.no = no;
	}
	
}

//环形链表
class CycLink
{
	//先定义一个指向链表头的引用
	//指向第一个节点的引用不能动
	Child firstChild = null;//头指针
	Child temp = null;//跑龙套的动态指针
	int len = 0;//链表长度
	int k=0; //从第几个人开始数
	int m=0; 
	
	public void setM(int m)
	{
		this.m=m;
	}
	
	//设置链表大小
	public void setLen(int len)
	{
		this.len = len;
	}
	
	//设置从第几个人开始数数
	public void setK(int k)
	{
		this.k = k;
	}
	
	//开始游戏
	public void play() {
		
		Child temp = this.firstChild;
		//1.先找到开始数数的人
		for (int i=1;i<k;i++)//注意i的范围
		{
			temp=temp.nextChild;
		}
		while(this.len!=1) {
		//2.数m下
		for (int j=1;j<m;j++)
		{
			temp = temp.nextChild;
		}
		//找到要出圈的前一个小孩
		Child temp2 = temp;
		while(temp2.nextChild!=temp)//因为是单向链表
		{
			temp2=temp2.nextChild;
		}
		//3.将数到m的小孩退出圈
		temp2.nextChild = temp.nextChild;
		//让temp指向下一个数数的
		temp = temp.nextChild;
		this.len--;
		}
		
		//输出最后一个小孩
		System.out.println(temp.no);
	}
	//初始化环形链表
	public void createLink()
	{
		for(int i=1;i<=len;i++)
		{
			if(i==1)//如果是第一个孩子
			{
				//创建第一个节点
				Child ch = new Child(i);//如果没有if则创建len个孤独的节点，只有编号
			    this.firstChild=ch;//则把头指针指向她，
			    this.temp=ch;//动态指针也指向她
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
					temp.nextChild=ch;//指向下一个
					temp=ch;//
				}
				
			}
			
		}
	}
    
	//打印环形链表
	public void show()
    {   
		//定义一个跑龙套
    	Child temp=this.firstChild;
    	do {
    		System.out.println(temp.no);
    		temp=temp.nextChild;
    		
    	}while(temp!=this.firstChild);
    }
}





