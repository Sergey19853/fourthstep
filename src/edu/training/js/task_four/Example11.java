package edu.training.js.task_four;

public class Example11 {

	public static void main(String[] args) {

		double base1 = 4;
		double base2 = 7;
		double height1 = 3;
		double height2 = 2;
		
		double area1 = (1 / 2) * base1 * height1;
		double area2 = (1 / 2) * base2 * height2;

		if(area1 > area2) {
			System.out.println("Площадь первого треугольника больше");
		}
		else {
			System.out.println("Площадь второго треугольника больше");
		}

	}

}
