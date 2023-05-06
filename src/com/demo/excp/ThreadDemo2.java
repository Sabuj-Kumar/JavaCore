package com.demo.excp;

public class ThreadDemo2 {

	public static void main(String[] args) {
		
		AA a = new AA();
		Thread at = new Thread(a);
		BB b = new BB();
		Thread bt = new Thread(b);
		CC c = new CC();
		Thread ct = new Thread(c);
		
		at.start();
		bt.start();
		ct.start();
	}

}
class AA implements Runnable{

	@Override
	public void run() {
		for(int i = 0; i < 5;i++) {
			System.out.println("A print index " + i);
		}
	}
	
}
class BB implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i < 5;i++) {
			System.out.println("B print index " + i);
		}
	}
}
class CC implements Runnable{
	
	@Override
	public void run() {
		for(int i = 0; i < 5;i++) {
			System.out.println("C print index " + i);
		}
	}
}
