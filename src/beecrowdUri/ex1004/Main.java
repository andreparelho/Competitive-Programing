package beecrowdUri.ex1004;

import java.util.Scanner;

public class Main {
    public static int getNum(int a){
        return a;
    }

    public static int getProd(int a, int b){
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = getNum(scanner.nextInt());
        int b = getNum(scanner.nextInt());
        int prod = getProd(a, b);
        System.out.println("PROD = " + prod);
    }
}
