package annamaria03;

import java.util.ArrayList;

public class Store {
    public static void main(String[] args) {
        ArrayList<ProductForSale> basket = new ArrayList<>();
        ClassicLiterature book = new ClassicLiterature("Xy", "ZQ", 25.00);
        ClassicLiterature book2 = new ClassicLiterature("bz", "blabla1", 25.00);
        ClassicLiterature book3 = new ClassicLiterature("Qx", "blabla2", 25.00);
        ClassicLiterature book4 = new ClassicLiterature("Kl", "blabla3", 25.00);
        ClassicLiterature book5 = new ClassicLiterature("SP", "blabla4", 25.00);
        Encyclopedias useBorn = new Encyclopedias("usborn ", "childern's encycloipedia", 35.75);
        KiddoBooks kiddo = new KiddoBooks("No idea", "Gosh", 15.65);
        System.out.println(book.showDetails());
        System.out.println(book.getSalesPrice(2));
        book.pricedLineItem(2);
        basket.add(book);
        basket.add(book2);
        basket.add(book3);
        basket.add(book4);
        basket.add(book5);
        basket.add(useBorn);
        basket.add(kiddo);

        for (ProductForSale product : basket) {
            listOfProducts(product);
            System.out.println(product.getSalesPrice(2));
        }


    }

    public static void listOfProducts(ProductForSale item) {
        System.out.println( item.showDetails());

    }

    public static void manageOrders(OrderItem orderItem, int quantity) {


    }


}

