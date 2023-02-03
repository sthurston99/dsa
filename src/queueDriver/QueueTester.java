package queueDriver;

import queue.ArrayQueue;
import queue.QueueADT;

public class QueueTester {

	public static void main(String[] args) {
		QueueADT<Integer> q = new ArrayQueue<Integer>();
		q.add(1);
		System.out.println(q);
		q.add(2);
		System.out.println(q);
		q.add(3);
		System.out.println(q);
		q.add(4);
		System.out.println(q);

	}

}
