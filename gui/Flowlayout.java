//2��ʽ���ְ���
package gui;
import java.awt.*;
import javax.swing.*;
/*
 * ע�����
 * �����С�����ƣ��Զ��������СҲû�ã����Զ�����Ϊ��Ѵ�С
 * ��������ʱ���λ�ÿɱ䣬��С���䣬�����ֻ��Ķ����Ŵ���С�����ݷ���ҳ��
 * ������ҳһ�㲻�ᶯ
 */

public class Flowlayout extends JFrame {

	//�������
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flowlayout f = new Flowlayout();
	}
	public Flowlayout()
	{
		//������� ��ʼ��
		jb1=new JButton("�в�");
		jb1.setSize(10,20);
		jb2=new JButton("����");
		jb3=new JButton("�ϲ�");
		jb4=new JButton("����");
		jb5=new JButton("����");
		jb6=new JButton("o");
		
		//������
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//ָ�����ֹ�������Ĭ�ϱ߽粼�֣���Ҫָ��
		this.setLayout(new FlowLayout());    //Ĭ�Ͼ��ж���
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));//�Ҷ���
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//���ô�������
		this.setTitle("a");
		this.setSize(300, 200);//��С������
		this.setLocation(200, 200);//λ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�jvm
		this.setResizable(false);//�����û������޸Ĵ����С
		
		//��ʾ����
		this.setVisible(true);
	}

}
