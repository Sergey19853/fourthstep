package edu.training.js.task_four;

public class Example18 {

	public static void main(String[] args) {

		int a = 1;
        int b = 8;
        int c = -5;
        int negative  = 0;
        int positive  = 0;
        int k = 2;
        
        if (a < 0) {
        	negative++;
        }else {
        	positive++;
        }
        
        if (b < 0) {
        	negative++;
        }else {
        	positive++;
        }
        
        if (c < 0) {
        	negative++;
        }else {
        	positive++;
        }

        System.out.println("Отрицательных чисел: " + negative + ", положительных чисел: " + positive);

        if (a % k == 0) {
            System.out.println("Число " + k + " является делителем числа " + a);
        }
        if (b % k == 0) {
            System.out.println("Число " + k + " является делителем числа " + b);
        }
        if (c % k == 0) {
            System.out.println("Число " + k + " является делителем числа " + c);
        }
        
	}

}
