package application;

import java.util.Scanner;

import model.entities.Account;
import model.exceptions.DomainException;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        try{
            System.out.println("Enter account data");
            System.out.print("Number: ");
            int number = sc.nextInt();
            sc.nextLine();
            System.out.print("Holder: ");
            String holder = sc.nextLine();
            System.out.print("Initial balance: ");
            double balance = sc.nextDouble();
            System.out.print("Withdraw limit: ");
            double limit = sc.nextDouble();
            System.out.println();
            
            Account acc = new Account(number, holder, balance, limit);

            System.out.print("Enter amount for withdraw: ");
            double amount = sc.nextDouble();
            acc.withdraw(amount);
            System.out.println("New balance: " + acc.getBalance());
        } catch(DomainException e){
            System.out.println("Withdraw error: " + e.getMessage());
        }finally{
            sc.close();
        }
    }
}
