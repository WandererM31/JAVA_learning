//swing几个常用组件  实现一个登录系统界面，文本框密码框标签组
//第31讲第一个案例
/*同一个组件不能同时被添加两次，第二次会覆盖第一次，第一次添加位置消失了
 * 
 */
package gui;
import java.awt.*;
import javax.swing.*;
public class Demo5 extends JFrame{
	
	//定义组件
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;   //标签文本
	JButton jb1,jb2;    //按钮
    JTextField jtf1,jtf2;//文本框
    JPasswordField jps;  //密码框区别文本框在于输入字符后是加密状态
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo5 aa = new Demo5();
	}
	public Demo5() {
	
	//创建组件
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jlb1 = new JLabel("用户名");
		jlb2 = new JLabel("密    码");
		
		jb1 = new JButton("确认");
		jb2 = new JButton("取消");
		
		jtf1 = new JTextField(10); //指定长度
		jtf2 = new JTextField(10);
		jps = new JPasswordField(10);
		
		jp1.add(jlb1);
		jp1.add(jtf1);
		jp2.add(jlb2);
		jp2.add(jps);
		jp3.add(jb1);
		jp3.add(jb2);
		
		this.add(jp1);
		this.add(jp2);
		this.add(jp3);
		
		//设置布局管理器为网格布局
		this.setLayout(new GridLayout(3,1,4,4));
		
		//设置窗体属性
		this.setTitle("网格布局");
		this.setSize(300, 200);//大小，像素
		this.setLocation(200, 200);//位置
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
	    this.setResizable(false); 
	    
	    //显示窗体
		this.setVisible(true);
	}

}
