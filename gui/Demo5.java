//swing�����������  ʵ��һ����¼ϵͳ���棬�ı���������ǩ��
//��31����һ������
/*ͬһ���������ͬʱ��������Σ��ڶ��λḲ�ǵ�һ�Σ���һ�����λ����ʧ��
 * 
 */
package gui;
import java.awt.*;
import javax.swing.*;
public class Demo5 extends JFrame{
	
	//�������
	JPanel jp1,jp2,jp3;
	JLabel jlb1,jlb2;   //��ǩ�ı�
	JButton jb1,jb2;    //��ť
    JTextField jtf1,jtf2;//�ı���
    JPasswordField jps;  //����������ı������������ַ����Ǽ���״̬
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo5 aa = new Demo5();
	}
	public Demo5() {
	
	//�������
		jp1 = new JPanel();
		jp2 = new JPanel();
		jp3 = new JPanel();
		
		jlb1 = new JLabel("�û���");
		jlb2 = new JLabel("��    ��");
		
		jb1 = new JButton("ȷ��");
		jb2 = new JButton("ȡ��");
		
		jtf1 = new JTextField(10); //ָ������
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
		
		//���ò��ֹ�����Ϊ���񲼾�
		this.setLayout(new GridLayout(3,1,4,4));
		
		//���ô�������
		this.setTitle("���񲼾�");
		this.setSize(300, 200);//��С������
		this.setLocation(200, 200);//λ��
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�jvm
	    this.setResizable(false); 
	    
	    //��ʾ����
		this.setVisible(true);
	}

}
