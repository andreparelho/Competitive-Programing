package beecrowdUri.ex1016;

import java.util.Scanner;

public class Main {

    public static double getDistance(double distance){
        return distance;
    }

    public static double getTimeHours(double distance){
        double kilometers = 30.0;
        return distance / kilometers;
    }

    public static double getTimeMinutes(double timeHours){
        double hourMinutes = 60;
        return timeHours * hourMinutes;
    }

    public static int castTimeMinutes(double timeMinutes){
        return (int) timeMinutes;
    }

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

       double distance = getDistance(scanner.nextDouble());

       double timeHours = getTimeHours(distance);

       double timeMinutes = getTimeMinutes(timeHours);

       int time = castTimeMinutes(timeMinutes);

       System.out.println(time + " minutos");
    }
}
