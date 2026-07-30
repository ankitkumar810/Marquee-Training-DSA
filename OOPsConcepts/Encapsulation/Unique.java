package Encapsulation;

class SeraCafe{
    private double price;

    public void setPrice (double price) {
        this.price = price;
    }
    public void order(double price){
        this.price = price;
    }

    public void billing(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }
}

public class Unique {
    public static void main(String[] args) {
        SeraCafe sera = new SeraCafe();
        sera.setPrice(10000.00);
        System.out.println(sera.getPrice());

    }
}
