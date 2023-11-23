package beecrowdUri.ex1011;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static final double pi = 3.14159;

    static {
        Locale.setDefault(new Locale("en", "US"));
    }

    public static double getR(double r){
        return r;
    }

    public static double calculateVolume(double r){
        return (4/3.0) * pi * r * r * r;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double r = getR(scanner.nextDouble());
        double volume = calculateVolume(r);

        System.out.printf("VOLUME = %.3f%n", volume);
    }
}
