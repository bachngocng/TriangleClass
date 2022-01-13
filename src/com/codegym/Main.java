package com.codegym;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập độ dài cạnh thứ nhất: ");
        double side1 = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ hai: ");
        double side2 = sc.nextDouble();
        System.out.print("Nhập độ dài cạnh thứ ba: ");
        double side3 = sc.nextDouble();
        sc.nextLine();

        if (isTriangle(side1, side2, side3)){
            System.out.print("Nhập màu sắc: ");
            String color = sc.nextLine();
            Shape tr1 = new Triangle(color, true, side1, side2, side3);
            System.out.println(tr1);
        } else {
            System.out.println("Chiều dài 3 cạnh không tạo nên tam giác!");
        }


    }
    public static boolean isTriangle(double a, double b, double c){
        return a < b + c && b < c + a && c < a + b;
    }
}
