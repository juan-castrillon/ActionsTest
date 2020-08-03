package hello;

public class Main {
    public String sayHello() {
        return "Hello";
    }
    public static void main(String[] args) {
        Main greeter = new Main();
        System.out.println(greeter.sayHello());
    }
}
