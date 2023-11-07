package edu.training.js.task_four;

public class Example16 {

	public static void main(String[] args) {

        double x = 1.0;
        double y = -2.0;

        if (x > 0 && y > 0) {
            System.out.println("Находится в 1 четверти");
        } else if (x < 0 && y > 0) {
            System.out.println("Находится во 2 четверти");
        } else if (x < 0 && y < 0) {
            System.out.println("Находится в 3 четверти");
        } else if (x > 0 && y < 0){
            System.out.println("Находится в 4 четверти");
        } else if (x == 0 && y != 0){
            System.out.println("Находится на оси y");
        } else if (x != 0 && y == 0){
            System.out.println("Находится на оси x");
        } else if (x == 0 && y == 0){
            System.out.println("Находится в начале координат");
        }

	}

}
