//��32����gui���ʵս����ɽ�ʰԽ���
package gui;
import java.awt.*;
import javax.swing.*;
public class Demo8 extends JFrame{
	
	//�������
	JSplitPane jsp;//�ɲ�ִ���
	JList jlist;
	JLabel jlb;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo8 demo = new Demo8();
	}
	public Demo8() {
		
		//�������
		String[] words= {"³���ߺ�","��","������","����","����"};
		jlist = new JList(words);
		
		//JLabel���ͼƬ
		jlb = new JLabel(new ImageIcon("images/luban.jpg"));
	    
		jsp = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,jlist,jlb);
		//��ִ��������
		jsp.setOneTouchExpandable(true);
		
		//������
		this.add(jsp);
		
		//���ò��ֹ�����
		
		
		//���ô�������
		this.setTitle("��ִ���");
		this.setSize(300, 300);//��С������
		this.setLocation(200, 200);//λ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�jvm
		
		//��ʾ����
		this.setVisible(true);
		
		
	}

}
