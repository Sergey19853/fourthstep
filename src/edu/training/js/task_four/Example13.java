package edu.training.js.task_four;

public class Example13 {

	public static void main(String[] args) {
			
		double x1 = 1;
		double y1 = 2;
		double x2 = 3;
		double y2 = 4;

        double a = Math.sqrt(x1 * x1 + y1 * y1);
        double b = Math.sqrt(x2 * x2 + y2 * y2);

        if (a < b) {
            System.out.println("Точка 'а' ближе к началу координат");
        } else if (a == b){
            System.out.println("Точки на одиноковом расстоянии");
        } else {
            System.out.println("Точка 'а' дальше от начала координат, чем точка 'b'");
        }

	}

}
