package com.Assignment;

class AssingmentThread2 extends Thread{
	@Override
	public void run() {
		
		for (int i = 1; i <=5; i++) {
			
			System.out.println("It's Ahmed husain..."+i);
		}
	}
}

public class Q43 {
public static void main(String[] args) {
	AssingmentThread2 o1=new AssingmentThread2();
	o1.start();
	
	for (int i = 1; i <=5; i++) {
		
		System.out.println("Main thread..."+i);
	}
	
	}
}
