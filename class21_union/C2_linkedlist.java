package class21_union;

import java.util.*;

public class C2_linkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList aa = new LinkedList();
		//ͬ��ʹ����Ĺ���ȱʡ��ͬ��ͬ�����ã�����Emp
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
         * �ص�����key��value���趨��keyΨһ��
         * ����key��value�޷�����ѭ������Ϊkey���޷�ѭ����
         * 
         * ������:
         * ͨ������£����ϣ������һ�������е�Ԫ�ء����磬��ʾ�����е�ÿ��Ԫ�ء�
         * һ��������鶼�ǲ���forѭ��������ǿfor������������Ҳ�������ڼ��Ͽ��
         * ���õ������������Ͽ�ܣ�����һ������ʵ����Iterator �ӿڻ�ListIterator�ӿڡ�
         * ʹ���ܹ�ͨ��ѭ�����õ���ɾ�����ϵ�Ԫ�ء�ListIterator �̳���Iterator��������˫������б���޸�Ԫ�ء�
         * �����ַ����ǲ��õ������ķ������÷������Բ��õ����ڱ����Ĺ����лᳬ�����ϵĳ��ȡ�
         */  
        Hashtable ht2 = new Hashtable();
        
        
        HashMap ht = new HashMap();
        ht.put(null, null);
        System.out.println(ht.get(null));
      //hashmap hashtable ��ͬ��������
        /*
         * hashtable��ͬ���ģ��̰߳�ȫ�ģ�Ч�ʵ�
         * hashmap���첽�ģ������̰߳�ȫ��Ч�ʸ�
         */
        
        /*vector vs arraylist
         * 1��ͬ���ԡ�vectorͬ�����̰߳�ȫ��arraylist�첽���̲߳���ȫ
         * 2�������������ڲ����ƶ���ʹ�����������Ƽ��϶��󡣵�Ԫ����Ŀ�����ڲ����飬�Զ���չ��
         * vectorȱʡ���Զ�����ԭ��һ�����鳤�ȣ�arraylist��ԭ��50%���ڼ��ϱ���������ݿ���vector
         * ���ü��ϳ�ʼ����С���ⲻ��Ҫ����Դ����
         */
        
        /*
         * ��һ����⼯�Ͽ��
         * 1���̰߳�ȫ��ʹ��vector hashtable
         * 2����Ҫ���̰߳�ȫ��ArrayList��linkedlist��hashmap
         * 3��Ҫ���ֵ�ԣ�hashtable,hashmap
         * 4������������Ҫ�̰߳�ȫvector
         */
        
        /*
         * 24�������ϲ��� list�ӿڣ�set��map�ӿڣ��ֵ䣿
         */
	}

}
