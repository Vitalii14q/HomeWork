package market;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private long orderId;
    private Date dateRegistration;
    private Date paymentDate;
    private List<Product> listProducts;
    private double discount;


    public Order(long orderId){ // конструктор
        this.dateRegistration = new Date();
        this.listProducts = new ArrayList<>();
        this.orderId = orderId;
    }

    public long getIdOrder() { // тут я что то напутал
        return orderId;
    }

    public void addProduct(Product product) { // метод для добавления товара в заказ
        listProducts.add(product);
    }

    public void removeProduct(Product product) { // метод для удаления товара из заказа
        listProducts.remove(product);
    }

    public double calculatePrice() { // метод для расчета общей стоимости
        long  totalPrice = 0;
        for (Product product : listProducts) {
            totalPrice += product.getCost();
        }
        return totalPrice;
    }

    public double calculateTotalPrice() {
        return calculatePrice() * (1 - getDiscount());
    }

    public void setDiscountToOrder (double discountPercentage) { // метод для применения скидки ко всему заказу
        discount = discountPercentage / 100.0;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration (Date date) {
        this.dateRegistration = date;
    }

    public void setNumberOrder(long orderId) {
        this.orderId = orderId;
    }

    public Date getPaymentDate() {
        return paymentDate;
    }

    public void setPaymentDate(Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    public List<Product> getListProducts() {
        return listProducts;
    }

    public double getDiscount() {
        return discount;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId=" + orderId +
                ", dateRegistration=" + dateRegistration +
                ", paymentDate=" + paymentDate +
                ", listProducts=" + listProducts +
                ", discount=" + discount +
                '}';
    }
}
