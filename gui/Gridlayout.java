//3���񲼾ֹ�����
package gui;
import java.awt.*;
import javax.swing.*;
/*
 * ��ť��С�洰�ڴ�С�仯�������������С��ͬ�����λ�ò��洰�ڱ仯
 * GridLayout(int rows,int cols, int hgap, int vgap) ���У�ˮƽ��϶����ֱ��϶
 */
public class Gridlayout extends JFrame{
	
	//�������
	int size = 9;
	JButton jbs[] = new JButton[size];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Gridlayout gg = new Gridlayout();
	}
    public Gridlayout() {
    	
    	//�������
    	for(int i = 0;i<9;i++)  
    	{
    		jbs[i]=new JButton(String.valueOf(i));
    	}
    	
    	
    	
    	//������
    	for(int i=0;i<9;i++) {
    		this.add(jbs[i]);
    
    	}
    	
    	//�������񲼾�
    	this.setLayout(new GridLayout(3,3,10,10));//��������⣬�ֲ�
    	
		//���ô�������
		this.setTitle("���񲼾�");
		this.setSize(300, 200);//��С������
		this.setLocation(200, 200);//λ��
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�رմ���ʱ�˳�jvm
		
		//��ʾ����
		this.setVisible(true);
    }
}
