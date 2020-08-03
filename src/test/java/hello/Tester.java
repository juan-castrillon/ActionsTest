package hello;
import org.junit.Assert;
import org.junit.Test;

public class Tester {
    @Test
    public void GreeterTest() {
        Main greeter = new Main();
        Assert.assertEquals("Hello World", greeter.sayHello());
    }

}
