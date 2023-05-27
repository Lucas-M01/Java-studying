package aplication;

import java.util.Scanner;

import entities.AccountBank;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AccountBank data = new AccountBank();

        System.out.print("Enter account number: ");
        int number = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter account holder: ");
        String holder = sc.nextLine();
        System.out.print("Is there an initial deposit (y/n)? ");
        char response = sc.next().charAt(0);
        sc.nextLine();
        System.out.println();

        

        if(response == 'y'){
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            data = new AccountBank(number, holder, initialDeposit);
        } else {
            data = new AccountBank(number, holder);
        }

        System.out.println("Account data:");
        System.out.println(data);

        System.out.print("Enter a deposit value: ");
        double depositValue = sc.nextDouble();
        data.deposit(depositValue);
        

        System.out.println("Updated account data:");
        System.out.println(data);

        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        data.withdraw(withdrawValue);
        
        System.out.println("Updated account data:");
        System.out.println(data);

        sc.close();
    }
}