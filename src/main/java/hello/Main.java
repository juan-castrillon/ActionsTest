package hello;

public class Main {

    /**
     * This function says hello world using a {@link String}
     * @return Hello World!
     */
    public String sayHello() {
        return "Hello World!";
    }


    public static void main(String[] args) {
        Main greeter = new Main();
        System.out.println(greeter.sayHello());
    }
}
