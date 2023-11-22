package beecrowdUri.ex1008;

import java.math.BigDecimal;
import java.util.Locale;
import java.util.Scanner;

public class Main {

    static  {
        Locale.setDefault(new Locale("en", "US"));
    }

    public static int getEmployeeNumber(int employeeNum){
        return employeeNum;
    }

    public static int getWorkHours(int workHours){
        return workHours;
    }

    public static BigDecimal getSalaryPerHour(BigDecimal salaryPerHour){
        return salaryPerHour;
    }

    public static BigDecimal getSalary(int workHours, BigDecimal salaryPerHour){
        return salaryPerHour.multiply(BigDecimal.valueOf(workHours));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int employeeNumber = getEmployeeNumber(scanner.nextInt());
        int workHours = getWorkHours(scanner.nextInt());

        BigDecimal salaryPerHour = getSalaryPerHour(scanner.nextBigDecimal());
        BigDecimal salary = getSalary(workHours, salaryPerHour);

        System.out.println("NUMBER = " + employeeNumber);
        System.out.printf("SALARY = U$ %.2f%n", salary);
    }
}
