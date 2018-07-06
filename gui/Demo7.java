//第31讲（四）下拉框，列表框，滚动窗格组件
package gui;
import java.awt.*;
import javax.swing.*;
public class Demo7 extends JFrame{

	//定义组件
	JPanel jp1,jp2;
	JLabel jlb1,jlb2;
	JComboBox jcb1; //下拉框
	JList jl1;      //列表框
	JScrollPane jsp;  //滚动窗格

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo7 demo7 = new Demo7();
	}
    public Demo7() {
    	jp1= new JPanel();
    	jp2= new JPanel();
    	
		jlb1 = new JLabel("你喜欢的人物");
		jlb2 = new JLabel("你喜欢的角色");
		
		//字符串加入到下拉列表中
		String[] jg = {"鲁班七号","铠","后羿","兰陵王","程咬金"};
		jcb1 = new JComboBox(jg);
		
		String[] jj = {"法师","战士","射手","辅助","刺客","坑爹"};
		jl1 = new JList(jj);
		
		jl1.setVisibleRowCount(4);//希望显示多少行
		jsp = new JScrollPane(jl1);//列表框加进滚动窗格中，看清是在哪加的
	    
		
		//添加组件
		jp1.add(jlb1);
		jp1.add(jcb1);
		
		jp2.add(jlb2);
		jp2.add(jsp); //加滚动
		
		this.add(jp1);
		this.add(jp2);
		
		//设置布局管理器
		this.setLayout(new GridLayout(3,1));
		
		//设置窗体属性
		this.setTitle("网格布局");
		this.setSize(300, 300);//大小，像素
		this.setLocation(200, 200);//位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
		
		//显示窗体
		this.setVisible(true);
		
    }
}
