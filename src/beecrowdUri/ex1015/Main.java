package beecrowdUri.ex1015;

import java.util.Locale;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    static {
        Locale.setDefault(new Locale("en", "US"));
    }

    public static double getNumber(double number){
        return number;
    }

    public static double getDistance(double x1, double x2, double y1, double y2){
        double distance = Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2);
        return Math.sqrt(distance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x1 = getNumber(scanner.nextDouble());
        double y1 = getNumber(scanner.nextDouble());
        double x2 = getNumber(scanner.nextDouble());
        double y2 = getNumber(scanner.nextDouble());

        System.out.printf("%.4f", getDistance(x1, x2, y1, y2));
        System.out.println();
    }
}
