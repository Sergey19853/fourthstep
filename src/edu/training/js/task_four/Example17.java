package edu.training.js.task_four;

public class Example17 {

	public static void main(String[] args) {

        int m = 2;
        int n = 4;
        
        if (m != n) {
            if (m > n) {
                n = m;
            } else {
                m = n;
            }
        } else {
            m = 0;
            n = 0;
        }

        System.out.println(m + ", " + n);

	}

}
