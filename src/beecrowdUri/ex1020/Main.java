package beecrowdUri.ex1020;

import java.util.Scanner;

public class Main {

    public static int getInput(int days){
        return days;
    }

    public static int getYear(int days){
        return days / 365;
    }

    public static int getMonth(int days){
        return (days % 365) / 30;
    }

    public static int getDays(int days){
        return (days % 365) % 30;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int input = getInput(scanner.nextInt());

        int year = getYear(input);

        int month = getMonth(input);

        int days = getDays(input);

        System.out.println(year + " ano(s)");
        System.out.println(month + " mes(es)");
        System.out.println(days + " dia(s)");
    }
}
