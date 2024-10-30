import creditcardgame.calculator.Calculator;
import creditcardgame.lists.ProductsManager;
import creditcardgame.models.Product;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Product> products = ProductsManager.getProducts();

        ArrayList<Product> randomProducts = Calculator.getRandomProducts(products);

        System.out.println(randomProducts);

        double creditLimit = Calculator.setCreditLimit();

        System.out.println(creditLimit);
    }
}