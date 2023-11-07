package edu.training.js.task_four;

public class Example7 {
	
	public static void main(String[] args) {
		
		int a = 1;
		int b = 2;
		int c = 3;
		int x = 4;
		int d;
		
		d = a * x * x + b * x + c;
		
		if (d > 0) {
			System.out.println("Модуль числа d = -" + d);
		}else if (d < 0) {
			System.out.println("Модуль числа d = " + d);
		}else {
			System.out.println("Модуль числа d = 0");
		} 
		
	}
}
