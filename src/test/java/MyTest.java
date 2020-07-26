import com.microsoft.demo.Demo;
import org.junit.Test;
import org.junit.Assert;

public class MyTest {
    @Test
    public void test_method_1() {
        Demo d = new Demo();
        d.DoSomething(false);
    }

    @Test
    public void test_method_2() {
        Assert.assertTrue("ERROR: Felix muss auch mal ne Azure Pipeline aufsetzen ... ", false);
    }
}
