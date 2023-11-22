package beecrowdUri.ex1010;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static {
        Locale.setDefault(new Locale("en", "US"));
    }

    public static int getCodeCloth(int code){
        return code;
    }

    public static int getCartNumber(int cartNum){
        return cartNum;
    }

    public static BigDecimal getClothAmount(BigDecimal amount){
        return amount;
    }

    public static BigDecimal getTotalByCloth(BigDecimal clothAmount, int cartNumber){
        return clothAmount.multiply(BigDecimal.valueOf(cartNumber));
    }

    public static BigDecimal totalAmount(BigDecimal totalCart1, BigDecimal totalCart2){
        return totalCart1.add(totalCart2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int codeCloth1 = getCodeCloth(scanner.nextInt());
        int cartNumber1 = getCartNumber(scanner.nextInt());
        BigDecimal clothAmountCart1 = getClothAmount(scanner.nextBigDecimal());
        BigDecimal totalAmountCart1 = getTotalByCloth(clothAmountCart1, cartNumber1);

        int codeCloth2 = getCodeCloth(scanner.nextInt());
        int cartNumber2 = getCartNumber(scanner.nextInt());
        BigDecimal clothAmountCart2 = getClothAmount(scanner.nextBigDecimal());
        BigDecimal totalAmountCart2 = getTotalByCloth(clothAmountCart2, cartNumber2);

        BigDecimal total = totalAmount(totalAmountCart1, totalAmountCart2);

        System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);
    }
}
