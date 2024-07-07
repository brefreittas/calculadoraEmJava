package entities;

public class Calculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public static double addiction(double num1, double num2) {
        return num1 + num2;
    }

    public static double subtraction(double num1, double num2) {
        return num1 - num2;
    }

    public static double multiplication(double num1, double num2){
        return num1 * num2;
    }

    public static double division(double num1, double num2) throws IllegalAccessException {
        if (num2 == 0) throw new IllegalAccessException("Cannot be 0!");
        return num1 / num2;
    }

    public static void printResult(String operator, double firstNumber, double secondNumber, double result){
        System.out.printf("%.1f%s%.1f = %.1f%n", firstNumber, operator, secondNumber, result);
    }

}
