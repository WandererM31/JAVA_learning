//2流式布局案例
package gui;
import java.awt.*;
import javax.swing.*;
/*
 * 注意事项：
 * 组件大小无限制，自定义组件大小也没用，会自动调整为最佳大小
 * 窗体缩放时组件位置可变，大小不变，就像手机阅读器放大缩小，内容符合页面
 * 但是网页一般不会动
 */

public class Flowlayout extends JFrame {

	//定义组件
	JButton jb1,jb2,jb3,jb4,jb5,jb6;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Flowlayout f = new Flowlayout();
	}
	public Flowlayout()
	{
		//创建组件 初始化
		jb1=new JButton("中部");
		jb1.setSize(10,20);
		jb2=new JButton("北部");
		jb3=new JButton("南部");
		jb4=new JButton("西部");
		jb5=new JButton("东部");
		jb6=new JButton("o");
		
		//添加组件
		this.add(jb1);
		this.add(jb2);
		this.add(jb3);
		this.add(jb4);
		this.add(jb5);
		this.add(jb6);
		
		//指定布局管理器：默认边界布局，需要指定
		this.setLayout(new FlowLayout());    //默认居中对齐
		this.setLayout(new FlowLayout(FlowLayout.RIGHT));//右对齐
		this.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		//设置窗体属性
		this.setTitle("a");
		this.setSize(300, 200);//大小，像素
		this.setLocation(200, 200);//位置
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//关闭窗口时退出jvm
		this.setResizable(false);//设置用户不可修改窗体大小
		
		//显示窗体
		this.setVisible(true);
	}

}
