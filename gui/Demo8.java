//第32讲，gui编程实战，金山词霸界面
package gui;
import java.awt.*;
import javax.swing.*;
public class Demo8 extends JFrame{
	
	//定义组件
	JSplitPane jsp;//可拆分窗格
	JList jlist;
	JLabel jlb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo8 demo = new Demo8();
	}
	public Demo8() {
		
		//创建组件
		String[] words= {"鲁班七号","铠","孙尚香","阿轲","刘备"};
		jlist = new JList(words);
		
		//JLabel里放图片
		jlb = new JLabel(new ImageIcon("images/luban.jpg"));
	    
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jlb);
		//拆分窗格可伸缩
		jsp.setOneTouchExpandable(true);
		
		//添加组件
		this.add(jsp);
		
		//设置布局管理器
		
		
		//设置窗体属性
		this.setTitle("拆分窗格");
		this.setSize(300, 300);//大小，像素
		this.setLocation(200, 200);//位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
		
		//显示窗体
		this.setVisible(true);
		
		
	}

}
