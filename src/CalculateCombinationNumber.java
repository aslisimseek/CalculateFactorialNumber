import java.util.Scanner;

public class CalculateCombinationNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N Element Number..:");
        int numberN = scanner.nextInt();
        System.out.print("Enter R Element Number..:");
        int numberR = scanner.nextInt();

        int totalResult = calculateFactorial(numberN) / (calculateFactorial(numberR) * (calculateFactorial(numberN - numberR)));

        System.out.println("Combination Result..:" + totalResult);
    }

    private static int calculateFactorial(int number) {
        int totalFactorialNumber = 1;
        for (int i = 1; i <= number; i++) {

            totalFactorialNumber = totalFactorialNumber * i;

        }
        return totalFactorialNumber;
    }
}
