package Market;

import java.util.ArrayList;
import java.util.List;

public class ProductManager {

    public void task1() {
        List<Product> products = createListOfProduct();

    }

    private List<Product> createListOfProduct () {
        List<Product> products = new ArrayList<>();
        Product product = new Product(ProductType.FRUIT, 350, "Banana");
        products.add(product);
        return products;
    }
}
