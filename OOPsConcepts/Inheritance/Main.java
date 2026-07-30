package Inheritance;
//Parent Class
class Animal{
    void eat(){
        System.out.println("Animal is eating!");
    }
    void sleep(){
        System.out.println("Animal is sleeping!");
    }
}
//Child Class
class Dog extends Animal{

}

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.eat();
        dog.sleep();    }
}

//Inheritance in Java is a mechanism in which one object acquires all the properties and behaviors of a parent object. It is an important part of OOPs (Object Oriented programming system). The idea behind inheritance in Java is that you can create new classes that are built upon existing classes.