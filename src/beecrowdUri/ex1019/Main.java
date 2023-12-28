package beecrowdUri.ex1019;

import java.util.Scanner;

public class Main {

    public static int getInput(int seconds){
       return seconds;
    }

    public static int secondsToHours(int seconds){
        return seconds / 3600;
    }

    public static int secondsToMinutes(int seconds){
        return (seconds % 3600) / 60;
    }

    public static double getSeconds(int seconds){
        double secondsThisHours = secondsThisHour(seconds);
        return secondsThisHours % 60;
    }

    private static double secondsThisHour(int seconds){
        return seconds % 3600;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = getInput(scanner.nextInt());

        int hours = secondsToHours(input);

        int minutes = secondsToMinutes(input);

        double seconds = getSeconds(input);

        System.out.println(hours + ":" + minutes + ":" + (int) seconds);
    }
}
