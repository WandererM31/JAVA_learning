package gui;
import java.awt.*;
import javax.swing.*;
public class Gui1 {
//��29��������̵ģ��ĳ��������Gui.java���̳�JFrame
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        JFrame f1 = new JFrame();//��������������������������
        f1.setTitle("haha");
        f1.setSize(200,200);
        f1.setVisible(true);
        f1.setLocation(300, 200);
        
        //��֤�رմ���ʱjvmҲ�ر�
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    JButton b1 = new JButton();
	    f1.add(b1);//��������������
	}
	

}
