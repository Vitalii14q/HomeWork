package linkedList;

public class Human implements Comparable<Human>{
    private int height;
    private String name;

    public Human (int height, String name) {
        this.height = height;
        this.name = name;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Human o) {
        if (this.height < o.height) {
            return -1;
        } else if (this.height > o.height) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Human{ name = " + name + " ,height = " + height + "}";
    }
}
