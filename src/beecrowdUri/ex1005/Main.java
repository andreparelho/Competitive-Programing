package beecrowdUri.ex1005;

import java.util.Scanner;

public class Main {

    public static double getNum(double a){
        return a;
    }

    public static double getHeightNote(double note, double height){
        return note * height;
    }

    public static double getSumNotes(double a, double b){
        return a + b;
    }

    public static double getNoteMedia(double plusNote){
        return plusNote / 11;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double a = getNum(scanner.nextDouble());
        double b = getNum(scanner.nextDouble());

        a = getHeightNote(a, 3.5);
        b = getHeightNote(b, 7.5);

        double plusNote = getSumNotes(a, b);

        double noteMedia = getNoteMedia(plusNote);

        System.out.printf("MEDIA = %.5f%n", noteMedia);
    }
}
