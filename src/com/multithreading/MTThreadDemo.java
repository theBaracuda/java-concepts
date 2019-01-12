package com.multithreading;

public class MTThreadDemo extends Thread {

	public void run() {
		System.out.println("Thread: "+Thread.currentThread().getId());
	}
	
	public static void main(String[] args) {
		/*
		To illustrate the use of Threads
		thread is lightweight sub-process
		smallest unit of programming
		allows concurrent execution of two or more parts or a program
		facilitates maximum utilization of a CPU
		*/
		int i,n;
		n=8;
		for(i=0;i<n;i++) {
			MTThreadDemo thread = new MTThreadDemo();
			thread.start();
		}
	}

}
