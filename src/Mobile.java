public class Mobile {

    private String brand;
    private String model;
    private double price;

    public Mobile(String brand, String model, double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }

    public void showDetails(){
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println(" ");
    }

    public  static void main(String[] args){
        Mobile m1 = new Mobile("Samsung","Galaxy S24", 899);
        Mobile m2 = new Mobile("Asus", "ROG 8", 799);
        Mobile m3 = new Mobile("Apple", "Iphone 15", 999);

        m1.showDetails(); m2.showDetails(); m3.showDetails();
    }

}