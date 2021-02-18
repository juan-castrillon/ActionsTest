package hello;

public class Main {

    /**
     * This function says hello world using a {@link String}
     * @return Hello World!
     */
    public String sayHello() {
        return "Hello World!";
    }

    /**
     * Says goodbye in the console, by printing Bye
     */
    public void sayGoodbye() {
        System.out.println("Bye!");
    }


    public static void main(String[] args) {
        Main greeter = new Main();
        System.out.println(greeter.sayHello());
        greeter.sayGoodbye();
    }
}
