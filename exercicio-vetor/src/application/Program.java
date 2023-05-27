package application;

import java.util.Scanner;

import entities.Rent;


public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Rent[] vect = new Rent[10];

        System.out.print("Quantos estudantes vao alugar?  ");
        int estudantes = sc.nextInt();
        System.out.println();

        for (int i = 0; i < estudantes; i++) {
            System.out.println("Registrar estudante #" + (i + 1) + ":");
            System.out.print("Nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.print("Email: ");
            String email = sc.nextLine();
            System.out.print("Quarto: ");
            int quarto = sc.nextInt();
        
            vect[quarto] = new Rent(nome, email);
            
            System.out.println();
        }

        System.out.println("Quartos ocupados: ");
        
        for (int i = 0; i < vect.length; i++) {
            if(vect[i] != null){  
                System.out.println(i + ": " + vect[i]);
            }
        }


        sc.close();
    }
}