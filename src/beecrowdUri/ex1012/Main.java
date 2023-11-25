package beecrowdUri.ex1012;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    public static final double pi = 3.14159;


    static {
        Locale.setDefault(new Locale("en", "US"));
    }

    public static double getNumber(double number){
        return number;
    }

    public static double calcTriangleRectangleArea(double base, double height){
        return base * height / 2;
    }

    public static double calcCircleArea(double ray){
        return pi * ray * ray;
    }

    public static double calTrapezeArea(double baseOne, double baseTwo, double height){
        return (baseOne + baseTwo) * height / 2;
    }

    public static double calcSquareArea(double side){
        return side * side;
    }

    public static double calcRectangleArea(double sideOne, double sideTwo){
        return sideOne * sideTwo;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = getNumber(scanner.nextDouble());
        double b = getNumber(scanner.nextDouble());
        double c = getNumber(scanner.nextDouble());

        double triangleRectangle = calcTriangleRectangleArea(a, c);
        System.out.printf("TRIANGULO: %.3f%n" , triangleRectangle);

        double circleArea = calcCircleArea(c);
        System.out.printf("CIRCULO: %.3f%n", circleArea);

        double trapezeArea = calTrapezeArea(a, b, c);
        System.out.printf("TRAPEZIO: %.3f%n", trapezeArea);

        double squareArea = calcSquareArea(b);
        System.out.printf("QUADRADO: %.3f%n", squareArea);

        double rectangleArea = calcRectangleArea(a, b);
        System.out.printf("RETANGULO: %.3f%n", rectangleArea);
    }
}
