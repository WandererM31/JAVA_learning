//第31讲 （三）复选框单选框实现 
package gui;
import java.awt.*;
import javax.swing.*;
public class Demo6 extends JFrame {
	//定义组件
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;
	JButton jb1,jb2;
	JCheckBox jcb1, jcb2, jcb3;
	JRadioButton jrb1,jrb2;
	ButtonGroup bg;  //实现单选

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo6 bb= new Demo6();
	}
 
	public Demo6() {
		
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jlb1 = new JLabel("你喜欢的人物");
		jlb2 = new JLabel("你的性别");
		
		jb1 = new JButton("提交");
		jb2 = new JButton("取消");
		
		jcb1 = new JCheckBox("鲁班七号");
		jcb2 = new JCheckBox("铠");
		jcb3 = new JCheckBox("后羿");
		
		jrb1 = new JRadioButton("男");
		jrb2 = new JRadioButton("女");
				
		bg = new ButtonGroup();		
		
		bg.add(jrb1);//单选框加入进去才能实现单选
		bg.add(jrb2);
		
		//设置布局管理器
		this.setLayout(new GridLayout(3,1));
		
		//添加组件
		jp1.add(jlb1);
		jp1.add(jcb1);
		jp1.add(jcb2);
		jp1.add(jcb3);
		
		jp2.add(jlb2);
		jp2.add(jrb1);
		jp2.add(jrb2);
		
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//设置窗体属性
		this.setTitle("网格布局");
		this.setSize(300, 200);//大小，像素
		this.setLocation(200, 200);//位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
		
		//显示窗体
		this.setVisible(true);
	}
}
