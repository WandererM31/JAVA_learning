//3网格布局管理器
package gui;
import java.awt.*;
import javax.swing.*;
/*
 * 按钮大小随窗口大小变化，但所有组件大小相同，相对位置不随窗口变化
 * GridLayout(int rows,int cols, int hgap, int vgap) 行列，水平间隙，垂直间隙
 */
public class Gridlayout extends JFrame{
	
	//定义组件
	int size = 9;
	JButton jbs[] = new JButton[size];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Gridlayout gg = new Gridlayout();
	}
    public Gridlayout() {
    	
    	//创建组件
    	for(int i = 0;i<9;i++)  
    	{
    		jbs[i]=new JButton(String.valueOf(i));
    	}
    	
    	
    	
    	//添加组件
    	for(int i=0;i<9;i++) {
    		this.add(jbs[i]);
    
    	}
    	
    	//设置网格布局
    	this.setLayout(new GridLayout(3,3,10,10));//查参数问题，手册
    	
		//设置窗体属性
		this.setTitle("网格布局");
		this.setSize(300, 200);//大小，像素
		this.setLocation(200, 200);//位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
		
		//显示窗体
		this.setVisible(true);
    }
}
