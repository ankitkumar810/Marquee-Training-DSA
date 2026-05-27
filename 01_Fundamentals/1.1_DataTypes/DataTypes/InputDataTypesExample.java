package Datatypes;

import java.util.*;

public class InputDataTypesExample {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            String s = sc.nextLine();
            int i = sc.nextInt();
            double d = sc.nextDouble();

            System.out.println("String: " + s);
            System.out.println("Double: " + d);
            System.out.println("Int: " + i);
    }
}