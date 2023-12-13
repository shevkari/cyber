package day11oct23ArraysPriorityQueueStack;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;

public class StackDemo {
	
	// example of 
	// mail system
	// Whatsapp post
	// Google pay transaction 
	

	public static void main(String[] args) {

		Stack<Integer> ss = new Stack<>();	// FILO matters 
		
		System.out.println(ss.size());
		
		ss.push(34);
		ss.push(67);
		ss.push(12);
		ss.push(46);
		ss.push(100);
		
		System.out.println(ss);
		System.out.println(ss.size());
		
		Integer TopElementPoint = ss.peek();	//	Point towards top element
		System.out.println(TopElementPoint);
		System.out.println(ss); 
		
		Integer TopElementOut = ss.pop();
		System.out.println(TopElementOut);
		System.out.println(ss); 

		Integer IfAvailable = ss.search(34);	// 	give index
		Integer IfNOTAvailable = ss.search(100);	// gives -ve value if NOT in stack
		
		System.out.println(IfAvailable);
		System.out.println(IfNOTAvailable);
		
		ss.add(21);
		
		System.out.println(ss);
		
		System.out.println(ss.empty());
		
		Stack<Integer> SS1 = (Stack<Integer>) ss.clone();
		
		System.out.println(SS1);

		ss.clear();
		
		System.out.println(ss.size());
		System.out.println(ss.empty());
		
		
		System.out.println(SS1.firstElement());
		System.out.println(SS1.get(3));
		System.out.println(SS1.peek());
		
		System.out.println(SS1.toString());
		System.out.println(SS1.toString().length());
		
		System.out.println((SS1 instanceof Stack));	// True
		System.out.println((SS1 instanceof Collection));	// True
		System.out.println((SS1 instanceof List));	// True
		System.out.println((SS1 instanceof Object));	// True
		System.out.println((SS1 instanceof Set));	// false
		System.out.println((SS1 instanceof Map));	// false
		System.out.println((SS1 instanceof Queue));	// false
		
		for (Integer x : SS1) {
			System.out.println(x);
		}
		
		System.out.println("-".repeat(15));
		
		for(int i=0; i<SS1.size(); i++)
		{
			System.out.println(SS1.get(i));
		}
		System.out.println("-".repeat(15));
		
		
		Iterator iter = SS1.iterator();
		while(iter.hasNext())
			System.out.println(iter.next());
		
		System.out.println("-".repeat(15));
		
		
		ListIterator<Integer> iter1 = SS1.listIterator();
		while(iter1.hasNext())
			System.out.println(iter1.next());

		System.out.println("-".repeat(15));
		
		while(iter1.hasPrevious())
			System.out.println(iter1.previous());
	
		System.out.println("-".repeat(15));
		
		int Totalelement = SS1.size();
		
		for(int i=0; i<Totalelement; i++)
			System.out.println(SS1.get(i));
		
		System.out.println("-".repeat(15));
		
		
		
		
		
	}

}
