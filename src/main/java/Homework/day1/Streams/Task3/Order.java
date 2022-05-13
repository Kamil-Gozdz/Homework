package Homework.day1.Streams.Task3;

import java.time.LocalDate;
import java.util.List;

public class Order {
    private long id;
    private LocalDate orderDate;
    private List<Product> products;

    public Order(long id, LocalDate orderDate, List<Product> products) {
        this.id = id;
        this.orderDate = orderDate;
        this.products = products;
    }

    public long getId() {
        return id;
    }

    public LocalDate getOrderDate() {
        return orderDate;
    }

    public List<Product> getProducts() {
        return products;
    }
}
