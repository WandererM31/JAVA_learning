//��32������2��qq�������
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
	    jsp = new JScrollPane(jta); //���뻬��
		
		jpl = new JPanel();
		String[] words= {"³���ߺ�","��","������","����","����"};
		jcb = new JComboBox(words);
		jtf = new JTextField(10);
		jb = new JButton("����");
		
		
		//������
		jpl.add(jcb);
		jpl.add(jtf);
		jpl.add(jb);
		
		this.add(jsp);
		this.add(jpl,BorderLayout.SOUTH);
		
		//Ĭ�ϱ߽粼��
		
		//���ô�������
		this.setTitle("qq�������");
		this.setSize(300, 300);//��С������
		this.setLocation(200, 200);//λ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�jvm
		this.setIconImage((new ImageIcon("images/b.jpg")).getImage());
		
		//��ʾ����
		this.setVisible(true);
		
	}

}
