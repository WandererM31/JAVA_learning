package gui;
import java.awt.*;
import javax.swing.*;
public class Gui1 {
//第29讲面向过程的，改成面向对象Gui.java，继承JFrame
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame f1 = new JFrame();//顶层容器，可添加其他组件的类
        f1.setTitle("haha");
        f1.setSize(200,200);
        f1.setVisible(true);
        f1.setLocation(300, 200);
        
        //保证关闭窗口时jvm也关闭
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JButton b1 = new JButton();
	    f1.add(b1);//添加组件到窗口上
	}
	

}
