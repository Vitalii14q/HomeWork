package Market;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Collectors;

public class OrderManager {
    private long orderId = 0;

    private long generateId() {
        return orderId++;
    }

    public List<Order> createListOrders () {
        List<Order> orders = new ArrayList<>();
        Order order1 = new Order(generateId());
        addOrderDate(order1, "2023-01-24");

        Product product1 = new Product(ProductType.TOY, 500, "Bear"); // создаем объекты заказа
        Product product2 = new Product(ProductType.DISH, 560, "Glass");
        Product product3 = new Product(ProductType.FRUIT, 10, "Banana");

        order1.addProduct(product1); // добавляем товары в заказ
        order1.addProduct(product2);
        order1.addProduct(product3);
        orders.add(order1);

        Order order2 = new Order(generateId());

        Product product4 = new Product(ProductType.TOY, 400, "Boll"); // создаем объекты заказа
        Product product5 = new Product(ProductType.DISH, 560, "Glass");
        Product product6 = new Product(ProductType.FRUIT, 50, "Pine Apple");

        order2.addProduct(product4); // добавляем товары в заказ
        order2.addProduct(product5);
        order2.addProduct(product6);
        orders.add(order2);

        Order order3 = new Order(generateId());
        addOrderDate(order3, "2023-02-01");

        Product product7 = new Product(ProductType.TOY, 1000, "Lego"); // создаем объекты заказа
        Product product8 = new Product(ProductType.DISH, 390, "Plate");
        Product product9 = new Product(ProductType.FRUIT, 200, "Watermelon");

        order3.addProduct(product7); // добавляем товары в заказ
        order3.addProduct(product8);
        order3.addProduct(product9);
        orders.add(order3);

        return orders;
    }

    public void task61 () {
        List<Order> orders = createListOrders();

        List<Order> filterAdd = orders.stream()
                .filter(order -> order.getPaymentDate() == null)
                .collect(Collectors.toList());

        System.out.println(orders);
        System.out.println(filterAdd);
    }

    public void task62 (String dateStart, String dateEnd) { // searchOrdersByDate
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        List<Order> orders = createListOrders();
        Date startDate = null;
        Date endDate = null;

        try {
            startDate = dateFormat.parse(dateStart);
            endDate = dateFormat.parse(dateEnd);


        } catch (ParseException error) {
            System.out.println("Invalid date format: " + error.getMessage());
        }

        final Date startDate1 = startDate;
        final Date endDate1 = endDate;
        List<Order> filteredOrders = orders.stream()
                .filter(order -> order.getDateRegistration().after(startDate1) && order.getDateRegistration().before(endDate1)) //after() определяет была ли первая дата позже второй
                .collect(Collectors.toList()); //before() определяет была ли первая дата раньше второй. Методы класса Date
        System.out.println(filteredOrders);

    }

    public void task63 () {
        List<Order> orders = createListOrders();

        orders.stream()
                .filter(order -> order.calculatePrice() > 1000)
                .forEach(order -> order.setDiscountToOrder(5));

        System.out.println(orders);
    }

    public void addOrderDate(Order order, String date) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            Date orderDate = dateFormat.parse(date);
            order.setDateRegistration(orderDate);
        } catch (ParseException error) {
            System.out.println("Invalid date format: " + error.getMessage());
        }
    }

    public void task64 () {
        HashMap<Product, Integer> countProduct = new HashMap<>();
        for (Order order : createListOrders()) {
            for (Product product : order.getListProducts()) {
                if (countProduct.containsKey(product)){
                    countProduct.put(product, countProduct.get(product) + 1);
                } else {
                    countProduct.put(product, 1);
                }
            }
        }
        List<Map.Entry<Product, Integer>> sortedProducts = countProduct.entrySet().stream()
                        .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
                        .limit(3)
                        .collect(Collectors.toList());
        System.out.println("Популярные продукты");
        for (int i = 0; i < sortedProducts.size(); i++) {
            Map.Entry<Product, Integer> entry = sortedProducts.get(i);
            Product product = entry.getKey();
            int count = entry.getValue();
            System.out.println(product.getName() + " - " + count + " occurrences");
        }
    }
}