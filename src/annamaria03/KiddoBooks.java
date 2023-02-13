package annamaria03;

public class KiddoBooks extends ProductForSale{

    public KiddoBooks(String type, String description, double price) {
        super(type,  description,  price);
    }

    @Override
    public String showDetails() {
        return "Kiddo book: " +super.toString();
    }

    @Override
    public double getSalesPrice(int quantity) {
        return super.getSalesPrice(quantity);
    }

    @Override
    public void pricedLineItem(int quantity) {
        super.pricedLineItem(quantity);
    }
}
