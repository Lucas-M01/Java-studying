package Exercicio2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite um numero: ");
        number = sc.nextInt();
        sc.close();

        if(number % 2 == 0){
            System.out.println("PAR");
        } else {
            System.out.println("IMPAR");
        }
    }
}
