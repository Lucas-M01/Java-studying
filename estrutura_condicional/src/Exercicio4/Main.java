package Exercicio4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int number1, number2, day = 24;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite dois números: ");
        number1 = sc.nextInt();
        number2 = sc.nextInt();
        sc.close();

        if(number1 == number2){
            System.out.println("O JOGO DUROU " + day + " HORA(S)");
        } else if (number1 < number2){
            System.out.println("O JOGO DUROU " + (number2 - number1) + " HORA(S)");
        } else {
            System.out.println("O JOGO DUROU " + ((number1 - number2) - day)*-1 + " HORA(S)");
        }
    }
}
