package application;

import java.util.List;
import java.util.Scanner;

import entities.Company;
import entities.Individual;
import entities.Person;
import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Person> list = new ArrayList<>();

        System.out.print("Enter the number of tax payers: ");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Tax payer #" + i + " data:");
            System.out.print("Individual or company (i/c)? ");
            char type = sc.next().charAt(0);

            switch(type){
                case 'i':
                    System.out.print("Name: ");
                    sc.nextLine();
                    String name = sc.nextLine();
                    System.out.print("Anual income: ");
                    double income = sc.nextDouble();
                    System.out.print("Health expenditures: ");
                    double healthExpenditures = sc.nextDouble();
                    Person person = new Individual(name, income, healthExpenditures);
                    list.add(person);
                    break;
                case 'c':
                    System.out.print("Name: ");
                    sc.nextLine();
                    name = sc.nextLine();
                    System.out.print("Anual income: ");
                    income = sc.nextDouble();
                    System.out.print("Number of employees: ");
                    int numberOfEmployees = sc.nextInt();
                    Person company = new Company(name, income, numberOfEmployees);
                    list.add(company);
                    break;
                default:
                    System.out.println("Invalid option!");
                    break;
            }
        }

        System.out.println();
        System.out.println("TAXES PAID:");
        for (Person person : list) {
            System.out.println(person.getName() + ": $ " + String.format("%.2f", person.tax()));
        }
        System.out.println();
        double sum = 0;
        for (Person person : list) {
            sum += person.tax();
        }
        System.out.println("TOTAL TAXES: $ " + String.format("%.2f", sum));

        sc.close();
    }
}