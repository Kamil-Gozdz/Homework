package Homework.day1.Streams.Task3;

import java.time.LocalDate;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Methods {

public static List<Product> getProductsFromCategoryComputersWithPriceMoreThan5000 (List<Product> products){
    return products.stream()
            .filter(p -> p.getCategory().equals("Computers"))
            .filter(p -> p.getPrice() > 5000)
            .collect(Collectors.toList());
    }
public static List<Product> getProductsFromComputerCategoryWithDiscount(List<Product> products){
    return products.stream()
            .filter(p -> p.getCategory().equals("Computers"))
            .map(p -> new Product(p.getId(),p.getName(),p.getCategory(),p.getPrice()*0.8))
            .collect(Collectors.toList());
    }
public static Product getCheaperProductFromComputersCategory (List<Product> products){
    return products.stream()
            .filter(p -> p.getCategory().equals("Computers")).min(Comparator.comparing(Product::getPrice))
            .get();
    }
public static List<Order> getOrderList (List<Order> orders){
    return orders.stream()
            .filter(o -> o.getProducts().stream().anyMatch(p -> p.getCategory().equals("Books")))
            .collect(Collectors.toList());
    }
public static List<Product> getListFromDate (List<Order> orders){
    return orders.stream()
            .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2022,01,01)) >= 0)
            .filter(o -> o.getOrderDate().compareTo(LocalDate.of(2022,01,02)) <= 0)
            .flatMap(o -> o.getProducts().stream())
            .distinct()
            .collect(Collectors.toList());

    }
public static List<Order> getTwoLastOrders (List<Order> orders){
    return orders.stream()
            .sorted(Comparator.comparing(Order::getOrderDate).reversed())
            .limit(2)
            .collect(Collectors.toList());
    }
public static double sumOfOldestOrder (List<Order> orders){
    return orders.stream()
            .sorted(Comparator.comparing(Order::getOrderDate))
            .limit(1)
            .flatMap(o -> o.getProducts().stream())
            .mapToDouble(Product::getPrice)
            .sum();
    }
}
