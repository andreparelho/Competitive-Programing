package beecrowdUri.ex1003;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static int getNum(int a){
        return a;
    }

    public static int getSum(int a, int b){
        return a + b;
    }

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        int a = getNum(scanner.nextInt());
        int b = getNum(scanner.nextInt());
        int plus = getSum(a, b);
        System.out.println("SOMA = " + plus);

    }
}