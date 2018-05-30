//2018.5.23第16讲2对象数组的使用
//第17讲排序
/*数组总结：
 *  对象数组在定义后必须为每个对象分配空间new对象 ，才能赋值
 *  数组大小必须事先指定，不能动态输入，编译的时候就要知道多大
 *   
 */
package class16_array;
import java.io.*;

public class Array2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//定义对象数组
		Dog dogs[]=new Dog[4];
		
		dogs[0]=new Dog();//这句话必不可少
		
		//给各个狗赋初值
	    //Exception in thread "main" java.lang.NullPointerException
		//直接下面这样写，错误，空指针异常
		dogs[0].setName("花花");
		dogs[0].setWeight(4.5f);
	
        //循环赋值，从控制台输入
		InputStreamReader isr = new InputStreamReader (System.in);
		BufferedReader br = new BufferedReader(isr);
		for(int i=0;i<4;i++) {
			dogs[i]=new Dog();
			System.out.println("请输入狗命"+(i+1));
			//从控制台读取狗名
			String name = br.readLine();//注意异常处理：try catch
			//名字赋给对象
			dogs[i].setName(name);
			
			System.out.println("请输入狗体重");
			String s_weight = br.readLine();//运行停在readline上如果不输入就不进行下去
			//ReadLine读取字符串，转化为float
			float weight = Float.parseFloat(s_weight);
			dogs[i].setWeight(weight);
						
		}
		//算平均
		float allweight = 0;
		for(int i =0;i<4;i++)
		{
			allweight+=dogs[i].getWeight();//私有属性无法直接访问
		}
		System.out.println(allweight/dogs.length); //对象数组也有长度
        
		//第17讲排序
		//找出最大最小
		float maxWeight = dogs[0].getWeight();
		int maxIndex=0;
		for(int i=1;i<dogs.length;i++)
		{
			if(maxWeight<dogs[i].getWeight())
			{
				maxWeight = dogs[i].getWeight();
				maxIndex = i;
			}
		}
		System.out.println("体重最大的狗是"+(maxIndex+1)+"只狗"+dogs[maxIndex].getName()
				+"体重"+dogs[maxIndex].getWeight());
		
		//比较字符串内容是否想等equal
		//==比较数据，比较字符串的地址
		
	}

}



class Dog{
	private String name;
	private int age;
	private float weight; 
	
	public float getWeight() { //这是为什么这样用呢
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	} 
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
