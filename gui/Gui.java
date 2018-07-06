//6.21第30讲布局管理器
//1边界布局管理器BorderLayout
package gui;
import java.awt.*;
import javax.swing.*;
//流程：继承JFrame，引入包，定义组件，新建，在构造函数里初始化创建组件，设置窗体属性，显示窗体
//注意事项：不是五个部分必须添加；中部组件会自动调节大小,上下左右按钮没了，中间扩充过去；
//JFrame默认布局管理器是BorderLayout

public class Gui extends JFrame{
	
	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Gui aaa = new Gui();//新建
	}
	
	public Gui() { ///构造函数里初始化
		//创建组件
		jb1=new JButton("中部");
		jb2=new JButton("北部");
		jb3=new JButton("南部");
		jb4=new JButton("西部");
		jb5=new JButton("东部");
		//添加组件
		this.add(jb1,BorderLayout.CENTER);
		//this.add(jb1); 如果后面什么参数都不写，不写布局管理，那默认只有一个按钮，写多少也只显示一个
		this.add(jb2,BorderLayout.NORTH);
		this.add(jb3,BorderLayout.SOUTH);
		this.add(jb4,BorderLayout.WEST);
		this.add(jb5,BorderLayout.EAST);
		
		//设置窗体属性
		this.setTitle("a"); //标题
		this.setSize(300, 200);//大小，像素
		this.setLocation(200, 200);//位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
		
		//显示窗体
		this.setVisible(true);
	}

}
