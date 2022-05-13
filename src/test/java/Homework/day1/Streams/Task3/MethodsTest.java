package Homework.day1.Streams.Task3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class MethodsTest {

    private List<Product> products;
    private List<Order> orders;
    private Product product1;
    private Product product2;
    private Product product3;
    private Product product4;
    private Product product5;
    private Product product6;
    private Order order1;
    private Order order2;
    private Order order3;
    private Order order4;
    private Order order5;

    @BeforeEach
    void setUp(){
        product1 = new Product(10L,"Keyboard","Computers",20);
        product2 = new Product(20L,"Asus","Computers",6600);
        product3 = new Product(30L,"Lenovo","Computers",7000);
        product4 = new Product(40L,"Godfather","Books",20);
        product5 = new Product(50L,"SSD Disc","Computers",200);
        product6 = new Product(60L,"Garmin","Watches",1100);

        order1 = new Order(1L, LocalDate.of(2022,03,05),List.of(product1,product2,product3));
        order2 = new Order(2L, LocalDate.of(2022,01,01),List.of(product1,product2,product1));
        order3 = new Order(3L, LocalDate.of(2022,01,02),List.of(product1,product3,product3));
        order4 = new Order(4L, LocalDate.of(2022,05,05),List.of(product4,product2,product6));
        order5 = new Order(5L, LocalDate.of(2022,04,12),List.of(product5,product2,product3));

        products = List.of(product1,product2,product3,product4,product5,product6);
        orders = List.of(order1, order2, order3, order4,order5);
    }
    @Test
    void shouldReturnProductsFromCategoryComputersWithPriceMoreThan5000(){
    //when
    List<Product> result = Methods.getProductsFromCategoryComputersWithPriceMoreThan5000(products);
    //then
    assertThat(result).containsExactly(product2,product3);
    }
    @Test
    void shouldReturnProductsFromCategoryComputersWithDiscount(){
        //given
        List<Product> expectedResult = List.of(
                new Product(10L, "Keyboard", "Computers", 16),
                new Product(20L, "Asus", "Computers", 5280),
                new Product(30L, "Lenovo", "Computers", 5600),
                new Product(50L, "SSD Disc", "Computers", 160)
        );
        //when
        List<Product> result = Methods.getProductsFromComputerCategoryWithDiscount(products);
        //then
        assertThat(result).isEqualTo(expectedResult);
    }
    @Test
    void shouldReturnCheaperProductFromComputersCategory(){
        //when
        Product result = Methods.getCheaperProductFromComputersCategory(products);
        //then
        assertThat(result).isEqualTo(product1);
    }
    @Test
    void shouldReturnAnyOrderFromBookCategory(){
        //when
        List<Order> result = Methods.getOrderList(orders);
        //then
        assertThat(result).containsExactly(order4);
    }
    @Test
    void shouldReturnProductsFromDate(){
        //when
        List<Product> result = Methods.getListFromDate(orders);
        //then
        assertThat(result).containsExactly(product1,product2,product3);
    }
    @Test
    void shouldReturnListOfTwoLastOrders(){
        //when
        List<Order> result = Methods.getTwoLastOrders(orders);
        //then
        assertThat(result).containsExactly(order4,order5);
    }
    @Test
    void shouldReturnTotalSumOfOldestOrder(){
        //when
        double result = Methods.sumOfOldestOrder(orders);
        //then
        assertThat(result).isEqualTo(6640);
    }
}