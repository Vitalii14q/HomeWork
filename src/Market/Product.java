package Market;

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
}
