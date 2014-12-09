package thread;

import util.Counter;



public class DemoThread implements  Runnable{

	private Thread t;
	private String name;
	private Counter c;
	
	public DemoThread(){}
	public DemoThread(Counter counter,String name){
		this();
		this.name = name;
		this.c = counter; 
	}
	
	@Override
	public void run() {
		synchronized (c) {
			c.print();
		}
	}
	
	public void start(){
		if(t == null){
			t = new Thread(this, name);
			t.start();
		}
	}
	
}

