package beecrowdUri.ex1014;

import java.util.Locale;
import java.util.Scanner;

public class Main {

    static {
        Locale.setDefault(new Locale("en", "US"));
    }

    public static int getDistance(int distance){
        return distance;
    }

    public static double getKmPerLitre(double km){
        return km;
    }

    public static double getAverageConsumption(int distance, double kmPerLitre){
        return distance / kmPerLitre;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = getDistance(scanner.nextInt());
        double kmPerLitre = getKmPerLitre(scanner.nextDouble());
        double averageConsumption = getAverageConsumption(distance,kmPerLitre);
        System.out.printf("%.3f km/l", averageConsumption);
        System.out.println();
    }
}
