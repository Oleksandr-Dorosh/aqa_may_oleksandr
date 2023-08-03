package org.homework.Comparator.Main;

import org.homework.Comparator.Product.Product;
import org.homework.Comparator.ProductMarket.ProductMarket;
import org.homework.Comparator.Comparator.PriceComparator;
import org.homework.Comparator.Comparator.NameComparator;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 3.5);
        Product product2 = new Product("Bread", 2.0);
        Product product3 = new Product("Eggs", 1.2);

        List<Product> productList = Arrays.asList(product1, product2, product3);
        ProductMarket productMarket = new ProductMarket(productList);

        List<String> allProductNames = productMarket.getAllProductNames();
        System.out.println("All product names: " + allProductNames);

        List<String> allProductNamesSorted = productMarket.getAllProductNamesSorted();
        System.out.println("All product names sorted: " + allProductNamesSorted);

        List<Double> pricesGreaterThan10 = productMarket.getPricesGreaterThan10();
        System.out.println("Prices greater than 10: " + pricesGreaterThan10);

        List<Double> pricesLessThan0 = productMarket.getPricesLessThan0();
        System.out.println("Prices less than 0: " + pricesLessThan0);

        List<String> allPricesAsString = productMarket.getAllPricesAsString();
        System.out.println("All prices as string: " + allPricesAsString);

        List<Product> productsSortedByPrice = productMarket.getProductsSortedByPrice(new PriceComparator());
        System.out.println("Products sorted by price: " + productsSortedByPrice);

        List<Product> productsSortedByName = productMarket.getProductsSortedByName(new NameComparator());
        System.out.println("Products sorted by name: " + productsSortedByName);
    }
}
