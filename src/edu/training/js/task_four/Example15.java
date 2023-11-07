package edu.training.js.task_four;

public class Example15 {

	public static void main(String[] args) {

        double a = 1.0;
        double b = 2.0;
        double a1 = 0.0;
        double b1 = 0.0;

        if (a < b) {
        	a1 = (a + b) / 2;
        	b1 = 2 * a * b;
        } else {
        	b1 = (a + b) / 2;
            a1 = 2 * a * b;
        }
        
        System.out.println(a1 + " и " + b1);

	}

}
