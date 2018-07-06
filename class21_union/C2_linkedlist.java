package class21_union;

import java.util.*;

public class C2_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList aa = new LinkedList();
		//同包使用类的规则，缺省是同类同包可用，可用Emp
        Emp emp = new Emp("sa01","xiaoming",1.2f);
        aa.add(emp);
        //addFirst,addLast
        //get
        //remove
        
        Vector vv = new Vector();
        vv.size();
        System.out.println(vv.size());
        Emp emp1 = new Emp("1","aa",1.2f);
        vv.add(emp1);
        
        
        //hashmap
        /*
         * 重点在于key和value的设定，key唯一性
         * 遍历key和value无法再用循环，因为key是无法循环的
         * 
         * 迭代器:
         * 通常情况下，你会希望遍历一个集合中的元素。例如，显示集合中的每个元素。
         * 一般遍历数组都是采用for循环或者增强for，这两个方法也可以用在集合框架
         * 采用迭代器遍历集合框架，它是一个对象，实现了Iterator 接口或ListIterator接口。
         * 使你能够通过循环来得到或删除集合的元素。ListIterator 继承了Iterator，以允许双向遍历列表和修改元素。
         * 第三种方法是采用迭代器的方法，该方法可以不用担心在遍历的过程中会超出集合的长度。
         */  
        Hashtable ht2 = new Hashtable();
        
        
        HashMap ht = new HashMap();
        ht.put(null, null);
        System.out.println(ht.get(null));
      //hashmap hashtable 相同点与区别：
        /*
         * hashtable是同步的，线程安全的，效率低
         * hashmap是异步的，不是线程安全，效率高
         */
        
        /*vector vs arraylist
         * 1、同步性。vector同步，线程安全；arraylist异步，线程不安全
         * 2、数据增长。内部机制都是使用数组来控制集合对象。当元素数目超过内部数组，自动扩展，
         * vector缺省下自动增长原来一倍数组长度，arraylist是原来50%。在集合保存大量数据可用vector
         * 设置集合初始化大小避免不必要的资源开销
         */
        
        /*
         * 进一步理解集合框架
         * 1、线程安全，使用vector hashtable
         * 2、不要求线程安全，ArrayList，linkedlist，hashmap
         * 3、要求键值对，hashtable,hashmap
         * 4、数据量大且要线程安全vector
         */
        
        /*
         * 24讲，集合补充 list接口？set？map接口？字典？
         */
	}

}
