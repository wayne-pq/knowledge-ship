package override;


public class Override_2 {

    public static void main(String[] args) {
        Person person = new Man();
        System.out.println(person.num);
    }

    static abstract class Person {

        public int num = 1;

        public Person() {
            sayHello();
        }

        public void sayHello() {
            System.out.println("person hello");
        }
    }

    static class Man extends Person {
        public int num = 2;

        public Man() {
            sayHello();
        }

        @java.lang.Override
        public void sayHello() {
            System.out.println("man hello");
        }
    }

    static class Woman extends Person {
        public int num = 3;
    }

}
