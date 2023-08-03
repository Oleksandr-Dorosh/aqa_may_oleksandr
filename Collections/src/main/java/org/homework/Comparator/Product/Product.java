package org.homework.Comparator.Product;

public class Product implements Comparable<Product> {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "name= '" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public int compareTo(Product otherProduct) {
        return name.compareTo(otherProduct.getName());
    }
}
