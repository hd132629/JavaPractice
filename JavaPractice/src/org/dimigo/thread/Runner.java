package org.dimigo.thread;

import java.util.Random;

public class Runner extends Thread{
	private String name;
	
	public Runner(){
		
	}
	
	public Runner(String name){
		this.name= name;
	}
	
	public void run(){
		try {
			Thread.sleep(1000);
			System.out.println(name + " 출발");
			Thread.sleep(1000);
			for(int i=100; i>=0; i-=10){
				System.out.println(name + " " + i + " 미터");
				Thread.sleep(1000);		
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + " 골인");
	}
}
