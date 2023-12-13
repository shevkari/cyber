package day11oct23ArraysPriorityQueueStack;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(234);
		pq.add(548);
		pq.add(760);
		pq.add(690);
		pq.add(123);
		pq.add(434);
		pq.add(734);
		pq.add(690);
		
		System.out.println(pq);
		
		System.out.println(pq.poll());
		
		System.out.println(pq);
		
		System.out.println(pq.peek());
		
		System.out.println(pq.size());
		
		
//		pq.add(null); //	NullPointerException
		
		System.out.println(pq.remove());
		System.out.println(pq);
		
		Iterator iter = pq.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		PriorityQueue <Integer> pq1 = new PriorityQueue<>(pq);
		
		System.out.println(pq1);
		
		while(pq.size()!=0)
			System.out.println(pq.poll());
		
		System.out.println(pq.size());
		
		System.out.println(pq.isEmpty());
		
		System.out.println(pq.poll());
		
//		System.out.println(pq.remove()); //		 NoSuchElementException
		
	}

}
