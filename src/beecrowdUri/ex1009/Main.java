package beecrowdUri.ex1009;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static {
        Locale.setDefault(new Locale("en", "US"));
    }

    public static BigDecimal getPct(){
        return new BigDecimal(15);
    }

    public static BigDecimal getPercentageAmountSell(BigDecimal base, BigDecimal pct){
        return base.multiply(pct).divide(BigDecimal.valueOf(100));
    }

    public static String getEmployeeName(String name){
        return name;
    }

    public static BigDecimal getEmployeeSalary(BigDecimal salary){
        return salary;
    }

    public static BigDecimal getTotalSalary(BigDecimal commission, BigDecimal fixSalary){
        return commission.add(fixSalary);
    }

    public static BigDecimal getTotalAmountSell(BigDecimal totalAmountSell){
        return totalAmountSell;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String employeeName = getEmployeeName(scanner.next());
        BigDecimal fixSalary = getEmployeeSalary(scanner.nextBigDecimal());
        BigDecimal totalAmountSell = getTotalAmountSell(scanner.nextBigDecimal());
        BigDecimal pct = getPct();

        BigDecimal commission = getPercentageAmountSell(totalAmountSell, pct);
        BigDecimal totalSalary = getTotalSalary(commission, fixSalary);

        System.out.printf("TOTAL = R$ %.2f%n", totalSalary);
    }
}
