package Market;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProductManager {

    public void task1() {
        List<Product> products = createListOfProduct();

    }

    public void task31() {
        List<Product> products = createListOfProduct();
        List<Product> result = products.stream()
                .filter(product -> product.getCost() > 100)
                .filter(product -> product.getType() == ProductType.TOY)
                .collect(Collectors.toList());
        System.out.println(result);
    }

    public void task32() {
        List<Product> products = createListOfProduct();
        products.stream()
                .filter(product -> product.getType() == ProductType.TOY)
                .forEach(product -> product.setCost((long) (product.getCost() * 0.9)));
        System.out.println(products);
    }

    public void task33() {
        List<Product> products = createListOfProduct();
        List<Product> result = products.stream()
                .filter(product -> product.getType() == ProductType.FRUIT)
                .sorted(new ComparatorProducts())
                .collect(Collectors.toList());
        System.out.println(result);
    }


    private List<Product> createListOfProduct () {
        List<Product> products = new ArrayList<>();
        Product product = new Product(ProductType.FRUIT, 350, "Banana");
        products.add(product);
        Product product1 = new Product(ProductType.DISH, 99, "Fork");
        products.add(product1);
        Product product2 = new Product(ProductType.FOOD_FRESH, 40, "Soup");
        products.add(product2);
        Product product3 = new Product(ProductType.TOY, 400, "Car");
        products.add(product3);
        Product product4 = new Product(ProductType.DRINK, 99, "RedWain");
        products.add(product4);
        Product product5 = new Product(ProductType.FRUIT, 380, "Cherry");
        products.add(product5);
        Product product6 = new Product(ProductType.FRUIT, 150, "Pineapple");
        products.add(product6);

        return products;
    }
}
