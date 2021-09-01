package overload;


import java.util.Random;

public class Overload {

    public static void main(String[] args) {
        Person person = new Random().nextBoolean() ? new Man() : new Woman();
        Overload overLoad = new Overload();
        overLoad.sayHello(person);
    }

    public void sayHello(Person person) {
        System.out.println("person hello");
    }

    public void sayHello(Man person) {
        System.out.println("man hello");
    }

    public void sayHello(Woman person) {
        System.out.println("woman hello");
    }

    static abstract class Person {

    }

    static class Man extends Person {

    }

    static class Woman extends Person {

    }

}
