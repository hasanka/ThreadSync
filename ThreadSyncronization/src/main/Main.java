package main;

import thread.DemoThread;
import util.Counter;


public class Main {
	public static void main(String[] args) {
		Counter c = new Counter();
		DemoThread t1 = new DemoThread(c,"T1");
		DemoThread t2 = new DemoThread(c,"T2");
		t1.start();
		t2.start();
	}
}
