package application;

import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean answerContinue = true;
        char userAnswer;

        System.out.println("Welcome to Brenokas's calculator 1st edition!");

        Calculator calc = new Calculator();

        while (answerContinue) {
            System.out.print("1st number: ");
            double first = sc.nextDouble();
            calc.setFirstNumber(first);

            System.out.print("2nd number: ");
            double second = sc.nextDouble();
            calc.setSecondNumber(second);

            System.out.println();
            System.out.println("Choose an operation:");
            System.out.println("1 - addition (+)");
            System.out.println("2 - subtraction (-)");
            System.out.println("3 - multiplication (x)");
            System.out.println("4 - division (/)");
            System.out.println("5 - EXIT");

            System.out.print("-> ");
            int operation = sc.nextInt();

            System.out.println();

            switch (operation) {
                case 1:
                    System.out.printf("%.1f + %.1f = %.1f%n", calc.getFirstNumber(), calc.getSecondNumber(), Calculator.addiction(first, second));

                    System.out.print("Do you want to continue? (y/n): ");
                    userAnswer = sc.next().charAt(0);
                    if (userAnswer == 'n') { answerContinue = false; }
                    break;

                case 2:
                    System.out.printf("%.1f - %.1f = %.1f%n", calc.getFirstNumber(), calc.getSecondNumber(), Calculator.subtraction(first, second));
                    System.out.print("Do you want to continue? (y/n): ");
                    userAnswer = sc.next().charAt(0);
                    if (userAnswer == 'n') { answerContinue = false; }
                    break;

                case 3:
                    System.out.printf("%.1f x %.1f = %.1f%n", calc.getFirstNumber(), calc.getSecondNumber(), Calculator.multiplication(first, second));
                    System.out.print("Do you want to continue? (y/n): ");
                    userAnswer = sc.next().charAt(0);
                    if (userAnswer == 'n') { answerContinue = false; }
                    break;

                case 4:
                    System.out.printf("%.1f / %.1f = %.1f%n", calc.getFirstNumber(), calc.getSecondNumber(), Calculator.division(first, second));
                    System.out.print("Do you want to continue? (y/n): ");
                    userAnswer = sc.next().charAt(0);
                    if (userAnswer == 'n') { answerContinue = false; }
                    break;

                default:
                    answerContinue = false;
                    break;
            }
        }

        System.out.println("Thank you!");
        sc.close();
    }
}
