package beecrowdUri.ex1017;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static {
        Locale.setDefault(new Locale("en", "US"));
    }

    public static double carKmPerLitre(){
        return 12.0;
    }

    public static double calculateGasLiters(double timeHours, double averageSpeed){
        return (timeHours * averageSpeed) / carKmPerLitre();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double gasLiters = calculateGasLiters(scanner.nextDouble(), scanner.nextDouble());
        System.out.printf("%.3f%n", gasLiters);
    }
}
