package util;

public class Counter {
	
	public void print(){
		try {
			for (int i = 0; i < 5; i++) {
				System.out.println("Number is ["+i+"]");
			}
		} catch (Exception e) {
			System.out.println("Cannnot print numbers exception occured !");
		}
	}
	
}
