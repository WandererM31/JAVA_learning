/*
 * ��31�� ��һ��JPanel ������ʹ��
 * ��ͨ����������ֲ��ֹ�������������Ӳ���Ҫ��ʹ�ò��ֹ����������
 * һ������ֻ��һ��JFrame��������������ж��JPanel������Ų��ֹ�����
 */
package gui;
import java.awt.*;
import javax.swing.*;

public class Jpanel extends JFrame{

	//�������
	JPanel jp1,jp2;
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Jpanel jj = new Jpanel();

	}
	public Jpanel() { //���캯��
		
		jp1 = new JPanel(); //Ĭ�ϲ���Ϊ�����֣�
		jp2 = new JPanel();
		
		jb1 = new JButton("����");
		jb2 = new JButton("���");		
		jb3 = new JButton("ƻ��");
		jb4 = new JButton("����");
		jb5 = new JButton("��");
		jb6 = new JButton("����");
		
		//������
		jp1.add(jb1);
		jp1.add(jb2);
		jp2.add(jb3);
		jp2.add(jb4);
		jp2.add(jb5);
		
		this.add(jp1,BorderLayout.NORTH);
		this.add(jp2,BorderLayout.SOUTH);
		this.add(jb6,BorderLayout.CENTER);
		
		//���ô�������
		this.setTitle("���񲼾�");
		this.setSize(300, 200);//��С������
		this.setLocation(200, 200);//λ��
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�jvm
				
	    //��ʾ����
		this.setVisible(true);
	}

}
