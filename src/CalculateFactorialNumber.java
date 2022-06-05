import java.util.Scanner;

public class CalculateFactorialNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Factorial Number");
        int factorialNumber = scanner.nextInt();
        int totalFactorialNumber = 1;
        for (int i = 1; i <= factorialNumber; i++) {

            totalFactorialNumber = totalFactorialNumber * i;

        }
        System.out.println("Total Factorial..:" + totalFactorialNumber);
    }
}
