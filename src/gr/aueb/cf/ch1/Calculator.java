package gr.aueb.cf.ch1;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.print("Δώσε έναν αριθμό: ");
        int number = scanner.nextInt();


        int temp = number;
        int digitCount = 0;
        while (temp > 0) {
            digitCount++;
            temp /= 10;
        }

        temp = number;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digitCount);
            temp /= 10;
        }

        // Εκτύπωση αποτελέσματος
        System.out.println("Το άθροισμα είναι: " + sum);

        scanner.close();
    }
}
