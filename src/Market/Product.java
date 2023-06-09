package Market;

import java.util.Objects;

public class Product {

    private ProductType type;
    private long cost;
    private String name;

    public Product(ProductType type, long cost, String name) {
        this.type = type;
        this.cost = cost;
        this.name = name;
    }

    public ProductType getType() {
        return type;
    }

    public long getCost() {
        return cost;
    }

    public String getName() {
        return name;
    }

    public void setType(ProductType type) {
        this.type = type;
    }

    public void setCost(long cost) {
        this.cost = cost;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return cost == product.cost && type == product.type && Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, cost, name);
    }

    @Override
    public String toString() {
        return "Product{" +
                "type=" + type +
                ", cost=" + cost +
                ", name='" + name + '\'' +
                '}';
    }
}
