package co.edureka;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueApi {

	public static void main(String[] args) {
		
//		Queue<Integer> queue = new PriorityQueue<Integer>();
		
		PriorityQueue<Integer> queue = new PriorityQueue<Integer>();
		for(int i=10;i>0;i--) {
			queue.add(i); // Adding the data as integers from 10 to 1
		}
		
		// Queue 			: Head 10 9 8 7 6 5 4 3 2 1 (Tail)
		// PriorityQueue 	: Head 1 2 3 4 5 6 7 8 9 10 (Tail)
		// PriorityQueue will sort the data :)
		// 1. Peek : To fetch Head of Queue
		// 2. Poll : To Remove Head of Queue
		
		//System.out.println(">> Head is: "+queue.peek()+" Size: "+queue.size()); // 1
		//queue.poll(); // Removing Head of Queue
		//System.out.println(">> Head Now is: "+queue.peek()+" Size: "+queue.size()); // ?
		
		final int size = queue.size();
		
		for(int i=0;i<size;i++) {
			System.out.println(">> Head is: "+queue.peek());
			queue.poll(); // size shall be decremented by 1
		}

	}

}
