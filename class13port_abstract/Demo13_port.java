/*2018.5.10 ��13��20����
 * �ӿ�
 */
package class13port_abstract;

public class Demo13_port {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
	}

}
//USB�ӿ�
interface Usb{
	//������������
	public void start();
	public void stop();
}

//��д������࣬��ʵ��USB�ӿڣ�implementsʵ��
//һ����Ҫԭ�򣬵�һ����ʵ��һ���ӿ�ʱ��
//Ҫ����������ӿڵ����з���ͳͳʵ��
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
	//��ʼʹ��usb�ӿ�
	public void useUsb(Usb usb) {
		usb.start();
		usb.stop();
	}
}



