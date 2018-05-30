/*2018.5.10 第13讲20分钟
 * 接口
 */
package class13port_abstract;

public class Demo13_port {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
//USB接口
interface Usb{
	//声明两个方法
	public void start();
	public void stop();
}

//编写照相机类，并实现USB接口，implements实现
//一个重要原则，当一个类实现一个接口时，
//要求该类把这个接口的所有方法统统实现
class Camera implements Usb{
	
	public void start()
	{
		System.out.println("start camera");
	}
	
	public void stop()
	{
		System.out.println("stop camera");
	}
	
}

class Phone implements Usb{
	public void start()
	{
		System.out.println("start phone");
	}
	
	public void stop()
	{
		System.out.println("stop phone");
	}
	
}

class Computer{
	//开始使用usb接口
	public void useUsb(Usb usb) {
		usb.start();
		usb.stop();
	}
}



