import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Order> orders = new ArrayList<>();

        Order firstOrder = new Order();
        Order secondOrder = new Order();

        List<Product> products = new ArrayList<>();
        Product firstProduct = new Product(1, "test1");
        Product secondProduct = new Product(2, "test2");
        products.add(firstProduct);
        products.add(secondProduct);

        firstOrder.createOrder(products);
        secondOrder.createOrder(products);

        orders.add(firstOrder);
        orders.add(secondOrder);
    }
}
