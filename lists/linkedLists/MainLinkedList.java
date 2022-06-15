package lists.linkedLists;
import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
//		List<Eeger> ll = new LinkedList();
//		List<Eeger> al = new ArrayList();
//          ll.add(12);
//          ll.add(2);
//          ll.add(32);
//          
//          System.out.prEln(ll);
//          
//          getTimeDiff(al);
//          getTimeDiff(ll);
//	}
//
//	static void getTimeDiff(List<Eeger> list) {
//		long start = System.currentTimeMillis();
//		for(E i =0;i<100000;i++) {
//			list.add(0,i);
//		}
//		long end = System.currentTimeMillis();
//		
//		System.out.prEln(list.getClass().getName()+"--> "+(end-start));
		
		MyLinkedList<Integer> myll = new MyLinkedList();
		
	for(int i =0;i<10;i++ ) {
		myll.add(i);
	}
		
		myll.print();
		}
}
