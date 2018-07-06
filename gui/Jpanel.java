/*
 * 第31讲 （一）JPanel 面板组件使用
 * 普通组件布局三种布局管理器解决，复杂布局要求使用布局管理器的组合
 * 一个界面只有一个JFrame窗体组件，可以有多个JPanel，上面放布局管理器
 */
package gui;
import java.awt.*;
import javax.swing.*;

public class Jpanel extends JFrame{

	//定义组件
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jpanel jj = new Jpanel();

	}
	public Jpanel() { //构造函数
		
		jp1 = new JPanel(); //默认布局为流布局！
		jp2 = new JPanel();
		
		jb1 = new JButton("西瓜");
		jb2 = new JButton("甜瓜");		
		jb3 = new JButton("苹果");
		jb4 = new JButton("桃子");
		jb5 = new JButton("葡");
		jb6 = new JButton("柠檬");
		
		//添加组件
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb6,BorderLayout.CENTER);
		
		//设置窗体属性
		this.setTitle("网格布局");
		this.setSize(300, 200);//大小，像素
		this.setLocation(200, 200);//位置
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
				
	    //显示窗体
		this.setVisible(true);
	}

}
