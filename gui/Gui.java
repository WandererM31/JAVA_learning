//6.21��30�����ֹ�����
//1�߽粼�ֹ�����BorderLayout
package gui;
import java.awt.*;
import javax.swing.*;
//���̣��̳�JFrame�������������������½����ڹ��캯�����ʼ��������������ô������ԣ���ʾ����
//ע���������������ֱ�����ӣ��в�������Զ����ڴ�С,�������Ұ�ťû�ˣ��м������ȥ��
//JFrameĬ�ϲ��ֹ�������BorderLayout

public class Gui extends JFrame{
	
	//�������
	JButton jb1,jb2,jb3,jb4,jb5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Gui aaa = new Gui();//�½�
	}
	
	public Gui() { ///���캯�����ʼ��
		//�������
		jb1=new JButton("�в�");
		jb2=new JButton("����");
		jb3=new JButton("�ϲ�");
		jb4=new JButton("����");
		jb5=new JButton("����");
		//������
		this.add(jb1,BorderLayout.CENTER);
		//this.add(jb1); �������ʲô��������д����д���ֹ�����Ĭ��ֻ��һ����ť��д����Ҳֻ��ʾһ��
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.WEST);
		this.add(jb5,BorderLayout.EAST);
		
		//���ô�������
		this.setTitle("a"); //����
		this.setSize(300, 200);//��С������
		this.setLocation(200, 200);//λ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�jvm
		
		//��ʾ����
		this.setVisible(true);
	}

}
