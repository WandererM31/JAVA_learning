//第32讲，（2）qq聊天界面
package gui;
import java.awt.*;
import javax.swing.*;
public class Demo9 extends JFrame{
	
	JTextArea jta;
	JPanel jpl;
    JComboBox jcb;
    JTextField jtf;
    JButton jb;
    JScrollPane jsp;
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo9 demo9 = new Demo9();
	}
	public Demo9() {
		jta = new JTextArea();
	    jsp = new JScrollPane(jta); //加入滑动
		
		jpl = new JPanel();
		String[] words= {"鲁班七号","铠","孙尚香","阿轲","刘备"};
		jcb = new JComboBox(words);
		jtf = new JTextField(10);
		jb = new JButton("发送");
		
		
		//添加组件
		jpl.add(jcb);
		jpl.add(jtf);
		jpl.add(jb);
		
		this.add(jsp);
		this.add(jpl,BorderLayout.SOUTH);
		
		//默认边界布局
		
		//设置窗体属性
		this.setTitle("qq聊天界面");
		this.setSize(300, 300);//大小，像素
		this.setLocation(200, 200);//位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
		this.setIconImage((new ImageIcon("images/b.jpg")).getImage());
		
		//显示窗体
		this.setVisible(true);
		
	}

}
