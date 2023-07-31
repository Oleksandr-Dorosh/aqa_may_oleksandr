package Product;
import java.util.Arrays;
import java.util.List;
import static java.lang.System.out;

public class Main {
    public static void main(String[] args) {
        Product product1 = new Product("Milk", 3.5);
        Product product2 = new Product("Bread", 2.0);
        Product product3 = new Product("Eggs", 1.2);

        List<Product> productList = Arrays.asList(product1, product2, product3);
        ProductMarket productMarket = new ProductMarket(productList);

        List<String> allProductNames = productMarket.getAllProductNames();
        out.println("All product names: " + allProductNames);

        List<String> allProductNamesSorted = productMarket.getAllProductNamesSorted();
        out.println("All product names sorted: " + allProductNamesSorted);

        List<Double> pricesGreaterThan10 = productMarket.getPricesGreaterThan10();
        out.println("Prices greater than 10 : " + pricesGreaterThan10);

        List<Double> pricesLessThan5 = productMarket.getPricesLessThan5();
        out.println("Prices less than 5: " + pricesLessThan5);

        List<String> allPricesAsString = productMarket.getAllPricesAsString();
        out.println("All prices as string: " + allPricesAsString);

        List<Product> productsSortedByPrice = productMarket.getProductsSortedByPrice();
        out.println("Products sorted by price: " + productsSortedByPrice);
    }
}
