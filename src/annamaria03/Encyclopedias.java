package annamaria03;

public class Encyclopedias extends ProductForSale{

    public Encyclopedias(String type, String description, double price) {
        super(type,  description,  price);
    }

    @Override
    public String showDetails() {
        return "Encyclopedia: " + super.toString();
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

