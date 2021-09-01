package override;


import java.util.Random;

public class Override {

    public static void main(String[] args) {
        Person person = new Random().nextBoolean() ? new Man() : new Woman();
        person.sayHello();
    }

    static abstract class Person {
        public void sayHello() {
            System.out.println("person hello");
        }
    }

    static class Man extends Person {
        @java.lang.Override
        public void sayHello() {
            System.out.println("man hello");
        }
    }

    static class Woman extends Person {
    }

}
