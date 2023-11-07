package edu.training.js.task_four;

public class Example10 {

	public static void main(String[] args) {

		double radius1 = 1;
		double radius2 = 2;
		
		if(Math.PI * Math.pow(radius1, 2) > Math.PI * Math.pow(radius2, 2)) {
			System.out.println("Площадь второго круга меньше");
		}
		else {
			System.out.println("Площадь первого круга меньше");
		}

	}

}
