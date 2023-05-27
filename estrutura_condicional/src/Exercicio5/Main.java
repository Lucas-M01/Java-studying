package Exercicio5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int code, qty;
        double price, total;

        System.out.print("Digite o código do produto e a quantidade: ");
        code = sc.nextInt();
        qty = sc.nextInt();
        sc.close();

        switch(code) {
            case 1:
                price = 4.00;
                total = price * qty;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 2:
                price = 4.50;
                total = price * qty;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 3:
                price = 5.00;
                total = price * qty;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 4:
                price = 2.00;
                total = price * qty;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            case 5:
                price = 1.50;  
                total = price * qty;
                System.out.printf("Total: R$ %.2f\n", total);
                break;
            default: 
                System.out.println("CÓDIGO INVÁLIDO");
                break;
        }
    }
}
