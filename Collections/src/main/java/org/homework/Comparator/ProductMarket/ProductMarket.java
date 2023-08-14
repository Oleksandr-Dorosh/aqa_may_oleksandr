package org.homework.Comparator.ProductMarket;

import org.homework.Comparator.Product.Product;
import org.homework.Comparator.Comparator.PriceComparator;
import org.homework.Comparator.Comparator.NameComparator;

import java.util.List;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ProductMarket {
    private List<Product> products;

    public ProductMarket(List<Product> products) {
        this.products = products;
    }

    public List<String> getAllProductNames() {
        return products.stream()
                .map(Product::getName)
                .collect(Collectors.toList());
    }

    public List<String> getAllProductNamesSorted() {
        return products.stream()
                .map(Product::getName)
                .sorted()
                .collect(Collectors.toList());
    }

    public List<Double> getPricesGreaterThan10() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price > 10)
                .collect(Collectors.toList());
    }

    public List<Double> getPricesLessThan0() {
        return products.stream()
                .map(Product::getPrice)
                .filter(price -> price < 0)
                .collect(Collectors.toList());
    }

    public List<String> getAllPricesAsString() {
        return products.stream()
                .map(product -> String.valueOf(product.getPrice()))
                .collect(Collectors.toList());
    }

    public List<Product> getProductsSortedByPrice(Comparator<Product> comparator) {
        return products.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }

    public List<Product> getProductsSortedByName(Comparator<Product> comparator) {
        return products.stream()
                .sorted(comparator)
                .collect(Collectors.toList());
    }
}
