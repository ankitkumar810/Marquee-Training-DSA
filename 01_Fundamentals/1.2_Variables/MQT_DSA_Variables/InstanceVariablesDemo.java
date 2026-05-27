
package MQT_DSA_Variables;

public class InstanceVariablesDemo {
    String brand;
    int year;

    public static void main(String[] args) {
        InstanceVariablesDemo car = new InstanceVariablesDemo();
        car.brand = "BMW";
        car.year = 2022;
        System.out.println("Car Brand: " + car.brand);
        System.out.println("Car Year: " + car.year);
    }
}