package com.demo.excp;

public class ThreadDemo {

	public static void main(String[] args) {
		A a = new A();
		B b = new B();
		C c = new C();
		
		a.start();
		b.start();
		c.start();
	}
}

class A extends Thread{
	
	public void run() {
		for(int i = 0; i < 5;i++) {
			System.out.println("A print index " + i);
		}
	}
}
class B extends Thread{
	public void run() {
		for(int i = 0; i < 5;i++) {
			System.out.println("B print index " + i);
		}
	}
}
class C extends Thread{
	public void run() {
		for(int i = 0; i < 5;i++) {
			System.out.println("C print index " + i);
		}
	}
}