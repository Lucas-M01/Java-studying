package aplication;

import java.util.Scanner;

import util.CurrencyConverter;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double dollar, quantity, result;

        System.out.print("What is the dollar price? ");
        dollar = sc.nextDouble();
        System.out.print("How many dollars will be bought? ");
        quantity = sc.nextDouble();

        result = CurrencyConverter.converter(dollar, quantity);

        System.out.printf("Amount to be paid in reais = %.2f%n", result);

        sc.close();
    }
}
