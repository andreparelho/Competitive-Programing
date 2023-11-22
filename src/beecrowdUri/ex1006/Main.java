package beecrowdUri.ex1006;

import java.util.Scanner;

public class Main {
    private static double getNote (double note){
        return note;
    }

    private static double getHeightNote(double note, int height){
        return note * height;
    }

    private static double sumNotes(double noteA, double noteB, double noteC){
        return noteA + noteB + noteC;
    }

    private static double getMedia(double sumNotes){
        int noteHeight = 10;
        return sumNotes / noteHeight;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double a = getNote(scanner.nextDouble());
        double b = getNote(scanner.nextDouble());
        double c = getNote(scanner.nextDouble());

        a = getHeightNote(a, 2);
        b = getHeightNote(b, 3);
        c = getHeightNote(c, 5);

        double sum = sumNotes(a, b, c);
        double media = getMedia(sum);

        System.out.printf("MEDIA = %.1f%n", media);
    }
}
