package application;

import entities.Calculator;

import java.util.Locale;
import java.util.Scanner;

import static entities.Calculator.printResult;

public class Main {
    public static void main(String[] args) throws IllegalAccessException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        boolean answerContinue = true;
        char userAnswer;

        System.out.println("Welcome to Brenokas's calculator 1st edition!");

        Calculator calc = new Calculator();

        while (answerContinue){
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
                    printResult(" + ", first, second, Calculator.addiction(first, second));
                    break;

                case 2:
                    printResult(" - ", first, second, Calculator.subtraction(first, second));
                    break;

                case 3:
                    printResult(" x ", first, second, Calculator.multiplication(first, second));
                    break;

                case 4:
                    printResult(" / ", first, second, Calculator.division(first, second));
                    break;
                    // If the user tries to divide by 0 it will give an error,
                    // but I still don't know how to use try-catch, it will stay like this :)

                default:
                    System.out.println("Invalid operation. Please try again.");
            }

            System.out.print("Do you want to continue? (y/n): ");
            userAnswer = sc.next().charAt(0);
            if (userAnswer == 'n') answerContinue = false;
        }

        System.out.println("Thank you!");
        sc.close();
    }
}
