package application;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

import entities.Employee;

import java.io.FileReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Comparator;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        Double salary = sc.nextDouble();
        List<Employee> list = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(path))) {

            String line = br.readLine();

            while (line != null) {
                String[] fields = line.split(",");
                String name = fields[0];
                String email = fields[1];
                Double salaryEmployee = Double.parseDouble(fields[2]);

                list.add(new Employee(name, email, salaryEmployee));

                
        
                line = br.readLine();
            }

            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            
            Comparator<String> comp = (e1, e2) -> e1.toUpperCase().compareTo(e2.toUpperCase());

            List<String> email = list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted(comp).collect(Collectors.toList());
            
            email.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", list.stream().filter(e -> e.getName().charAt(0) == 'M').map(e -> e.getSalary()).reduce(0.0, (x, y) -> x + y)));
            
        }
        catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } 
        sc.close();
    }
    
}
