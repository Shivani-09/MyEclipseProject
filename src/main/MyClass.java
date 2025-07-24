package main;

import java.util.Random;

public class MyClass {

	public static int addNum(int a, int b) {
		return a + b;
	}
	
	public  int addNum(int a, int b, int c) {
		return a + b + c;
	}
	
	public double addNum(double a, double b, double c) {
		return a+b+c;
	}
	
	public void addNum() {
		Random r = new Random();
		System.out.println(r.nextInt(5) + r.nextInt(3));
	
	}
	
	
	public static void main(String[] args) {
	
		int result = addNum(2,3);
		System.out.println(result);
		
		MyClass c = new MyClass();
		int result2 = c.addNum(4, 5);
		System.out.println(result2);
		
		MyClass d = new MyClass();
		double result3 = d.addNum(2.3,3.4,4.5);
		System.out.println(result3);		
	
		MyClass m = new MyClass();
		m.addNum();
	}
}