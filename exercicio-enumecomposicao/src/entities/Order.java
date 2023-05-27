package entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
// import java.util.ArrayList;

import entities.enums.OrderStatus;

public class Order {
    private static final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date moment;
    private OrderStatus status;

    private Client client;
    private List<OrderItem> items = new LinkedList<OrderItem>();

    public Order() {}

    public Order(Date moment, OrderStatus status,  Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    } 
        
    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public void removeItem(OrderItem item) {
        items.remove(item);
    }

    public Double total() {
        double sum = 0.0;
        for (OrderItem item : items) {
            sum += item.subTotal();
        }
        return sum;
    }

    public String toString() {
        return "Order moment: " 
                + sdf.format(moment)
                + "\n" 
                + "Order statud: "
                + status
                + "\n" 
                + client
                + "\n"
                + "Order items: "
                + "\n"
                + items.toString();
    }
}
