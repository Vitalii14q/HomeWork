package Market;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {
    private long orderId;
    private Date dateRegistration;
    private long numberOrder;
    private Date paymentDate;
    private List<Product> listProducts;
    private double discount;


    public Order(Date dateRegistration){ // конструктор
        this.dateRegistration = dateRegistration;
        this.listProducts = new ArrayList<>();
        //orderId++;
    }

    public long getIdOrder() { // тут я что то напутал
        orderId++;
        return orderId;
    }

    public void addProduct(Product product) { // метод для добавления товара в заказ
        listProducts.add(product);
    }

    public void removeProduct(Product product) { // метод для удаления товара из заказа
        listProducts.remove(product);
    }

    public long calculateTotalPrice() { // метод для расчета общей стоимости
        long  totalPrice = 0;
        for (Product product : listProducts) {
            totalPrice += product.getCost();
        }
        return totalPrice;
    }

    public void applyDiscountToOrder (double discountPercentage) { // метод для применения скидки ко всему заказу
        discount = discountPercentage / 100.0;
    }

    public Date getDateRegistration() {
        return dateRegistration;
    }

    public void setDateRegistration (Date dateRegistration) {
        this.dateRegistration = dateRegistration;
    }

    public long getNumberOrder() {
        return numberOrder;
    }

    public void setNumberOrder(long numberOrder) {
        this.numberOrder = numberOrder;
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

    public void setListProducts(List<Product> listProducts) {
        this.listProducts = listProducts;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }
}
