package org.dimigo.thread;

public class Race {

	public static void main(String[] args) {
		Thread t1 = new Thread(new Runner("홍길동"));
		Thread t2 = new Thread(new Runner("홍길순"));
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		
		System.out.println("main thread start");
		t1.start();
		t2.start();
		System.out.println("main thread end");
	}

}
