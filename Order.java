import java.util.ArrayList;
import java.util.List;

public class Order {
    private int orderId;
    private List<Product> products;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }
    public List<Product> getProducts(){
        return products;
    }

    public void addProduct(int productId, String productName){
        Product product = new Product(productId, productName);
        products.add(product);
    }

    public void removeProduct(Long productId){
        this.products = products.stream()
                .filter(product -> product.getProductId() != productId)
                .toList();
    }

    public void createOrder(List<Product> products){
        List addedProduct = new ArrayList<>();

        products.forEach(product -> {
            addProduct(product.getProductId(), product.getProductName());
        });

        this.orderId = (int)Math.random()*(100-1+1)+1;
    }


}
