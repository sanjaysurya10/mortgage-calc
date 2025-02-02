import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter loan amount (Principal): ");
        double principal = scanner.nextDouble();

        System.out.print("Enter annual interest rate (in %): ");
        double annualInterestRate = scanner.nextDouble();
        double monthlyInterestRate = annualInterestRate / 12 / 100;
        System.out.print("Enter loan term (in years): ");
        int years = scanner.nextInt();
        int totalPayments = years * 12;

        double monthlyPayment = (principal * monthlyInterestRate * Math.pow(1 + monthlyInterestRate, totalPayments))
                / (Math.pow(1 + monthlyInterestRate, totalPayments) - 1);


        System.out.printf("Your monthly mortgage payment is: %.2f\n", monthlyPayment);

        scanner.close();
    }
}