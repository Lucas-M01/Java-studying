package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
    public static void main(String[] args) throws ParseException {
        Scanner sc =  new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter cliente data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.next());
        System.out.println("Enter order data: ");
        System.out.print("Status: ");
        String status = sc.next();
        sc.nextLine();
        System.out.print("How many items to this order? ");
        int n = sc.nextInt();

        Client client = new Client(name, email, birthDate);

        Order order = new Order(new Date(), OrderStatus.valueOf(status), client);

        for (int i = 0; i < n; i++) {
            System.out.println("Enter #" + (i + 1) + " item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int quantity = sc.nextInt();
        
            Product product = new Product(productName, productPrice);

            OrderItem orderItem = new OrderItem(quantity, productPrice, product);
            
            order.addItem(orderItem);
        }
        
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order);


        sc.close();
    }
}
