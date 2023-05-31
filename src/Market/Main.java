package Market;

import java.util.Date;

public class Main {
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        productManager.task31();
        productManager.task32();
        productManager.task33();
        System.out.println("   ");
        Date dateRegistration = new Date();
        Order order = new Order(dateRegistration);
        order.getIdOrder();

        Product product = new Product(ProductType.TOY, 500, "Bear"); // создаем объекты заказа
        Product product1 = new Product(ProductType.DISH, 490, "Wine glasses");
        Product product2 = new Product(ProductType.FRUIT, 10, "Banana");

        order.addProduct(product); // добавляем товары в заказ
        order.addProduct(product1);
        order.addProduct(product2);

        System.out.println("Дата регистрации заказа: " + order.getDateRegistration()); // вывод информации о заказе
        System.out.println("Номер заказа: " + order.getIdOrder()); //номер заказа
        System.out.println("Товары в заказе: ");
        for (Product product3 : order.getListProducts()) {
            System.out.println("- " + product3.getName() + " (" + product3.getCost() + ")");
        }

        System.out.println("Общая стоимость заказа: " + order.calculateTotalPrice());

        order.applyDiscountToOrder(20.0);
        System.out.println("Общая стоимость заказа со скидкой: " + order.calculateTotalPrice() * (1 - order.getDiscount()));
    }

}