
package Datatypes;

public class StringConcatenationExample {
    public static void main(String[] args) {
        String greeting = "Hello";
        String target = "World";
        int year = 2026;
        String message = greeting + " " + target + " " + year;
        System.out.println(message);

        System.out.println(20+30+"Java"); //50Java
        System.out.println("Java"+20+30); //Java2030
        System.out.println("Hello"+(20+30)); // Hello50

    }
}
