package beecrowdUri.ex1006;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();

        a *= 2;
        b *= 3;
        c *= 5;

        double somaNota = a + b + c;

        double media = somaNota / 10;

        System.out.printf("MEDIA = %.1f%n", media);
    }
}