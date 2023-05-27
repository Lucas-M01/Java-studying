package Exercicio3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        sc.close();

        if (number1 > number2) {
            if(number1 % number2 == 0) {
                System.out.println("Sao Multiplos");
            } else {
                System.out.println("Nao sao Multiplos");
            }
        } else if(number2 % number1 == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
            
        
    }
}
