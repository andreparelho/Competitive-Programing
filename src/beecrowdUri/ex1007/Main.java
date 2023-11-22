package beecrowdUri.ex1007;

import java.util.Scanner;

public class Main {
    private static int getNumber(int number){
        return number;
    }

    private static int getDifference(int num1, int num2, int num3, int num4){
        return (num1 * num2) - (num3 * num4);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = getNumber(scanner.nextInt());
        int b = getNumber(scanner.nextInt());
        int c = getNumber(scanner.nextInt());
        int d = getNumber(scanner.nextInt());

        int difference = getDifference(a, b, c, d);

        System.out.println("DIFERENCA = " + difference);
    }
}
