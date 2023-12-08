package beecrowdUri.ex1018;

import java.util.Scanner;

public class Main {

    public static int getAmountNotes(double amount, int noteValue){
        return (int) amount / noteValue;
    }

    public static double getRestAmount(double amount, int noteValue){
        return amount % noteValue;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();

        double amountRest = 0;
        int moneyNote = 0;

        amountRest = getRestAmount(amount, 100);
        moneyNote = getAmountNotes(amount, 100);
        System.out.println(moneyNote + " nota(s) de R$ 100,00");

        moneyNote = getAmountNotes(amountRest, 50);
        amountRest = getRestAmount(amountRest, 50);
        System.out.println(moneyNote + " nota(s) de R$ 50,00");

        moneyNote = getAmountNotes(amountRest, 20);
        amountRest = getRestAmount(amountRest, 20);
        System.out.println(moneyNote + " nota(s) de R$ 20,00");

        moneyNote = getAmountNotes(amountRest, 10);
        amountRest = getRestAmount(amountRest, 10);
        System.out.println(moneyNote + " nota(s) de R$ 10,00");

        moneyNote = getAmountNotes(amountRest, 5);
        amountRest = getRestAmount(amountRest, 5);
        System.out.println(moneyNote + " nota(s) de R$ 5,00");

        moneyNote = getAmountNotes(amountRest, 2);
        amountRest = getRestAmount(amountRest, 2);
        System.out.println(moneyNote + " nota(s) de R$ 2,00");

        moneyNote = (int) amountRest;
        System.out.println(moneyNote + " nota(s) de R$ 1,00");
    }
}
