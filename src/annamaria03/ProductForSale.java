package annamaria03;
  record OrderItem( int quantity, ProductForSale product) {

  }
public abstract class ProductForSale {

    protected String type;
    private String description;
    private double price;

    public ProductForSale(String type, String description, double price) {
        this.type = type;
        this.description = description;
        this.price = price;
    }

    @Override
    public String toString() {
        return ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    public double getSalesPrice(int quantity) {
        return quantity * price;
    }

    public void pricedLineItem(int quantity){
            System.out.printf("Your basket contains %d %s." , quantity, type);

    }

    public String getDescription() {
        return description;
    }

    public abstract String showDetails();



}
