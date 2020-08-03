package hello;

public class Main {
    public String sayHello() {
        return "Hello World";
    }
    public static void main(String[] args) {
        Main greeter = new Main();
        System.out.println(greeter.sayHello());
    }
}
