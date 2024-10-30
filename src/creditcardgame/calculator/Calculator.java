package creditcardgame.calculator;

import creditcardgame.models.Product;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

public class Calculator {

    public static ArrayList<Product> getRandomProducts(ArrayList<Product> products) {
        Collections.shuffle(products);

        ArrayList<Product> randomProducts = new ArrayList<>();

        for (int i = 0; i < Math.min(10, products.size()); i++) {
            randomProducts.add(products.get(i));
        }

        return randomProducts;
    }

    public static double setCreditLimit(){
        Random random = new Random();
        return random.nextDouble() * 10000;
    }
}
