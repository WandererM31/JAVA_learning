//��31�����ģ��������б�򣬹����������
package gui;
import java.awt.*;
import javax.swing.*;
public class Demo7 extends JFrame{

	//�������
	JPanel jp1,jp2;
	JLabel jlb1,jlb2;
	JComboBox jcb1; //������
	JList jl1;      //�б��
	JScrollPane jsp;  //��������

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Demo7 demo7 = new Demo7();
	}
    public Demo7() {
    	jp1= new JPanel();
    	jp2= new JPanel();
    	
		jlb1 = new JLabel("��ϲ��������");
		jlb2 = new JLabel("��ϲ���Ľ�ɫ");
		
		//�ַ������뵽�����б���
		String[] jg = {"³���ߺ�","��","����","������","��ҧ��"};
		jcb1 = new JComboBox(jg);
		
		String[] jj = {"��ʦ","սʿ","����","����","�̿�","�ӵ�"};
		jl1 = new JList(jj);
		
		jl1.setVisibleRowCount(4);//ϣ����ʾ������
		jsp = new JScrollPane(jl1);//�б��ӽ����������У����������ļӵ�
	    
		
		//������
		jp1.add(jlb1);
		jp1.add(jcb1);
		
		jp2.add(jlb2);
		jp2.add(jsp); //�ӹ���
		
		this.add(jp1);
		this.add(jp2);
		
		//���ò��ֹ�����
		this.setLayout(new GridLayout(3,1));
		
		//���ô�������
		this.setTitle("���񲼾�");
		this.setSize(300, 300);//��С������
		this.setLocation(200, 200);//λ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�jvm
		
		//��ʾ����
		this.setVisible(true);
		
    }
}
