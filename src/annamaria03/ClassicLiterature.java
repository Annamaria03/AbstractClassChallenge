package annamaria03;

public class ClassicLiterature extends ProductForSale{

    public ClassicLiterature(String type, String description, double price) {
        super( type,  description,  price);
    }

    @Override
    public String showDetails() {
        return  "ClassicLiterature: " + super.toString();
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
