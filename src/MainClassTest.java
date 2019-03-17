import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String check_string = this.getClassString();

        Assert.assertTrue("no substring found",
                check_string.contains("hello") || check_string.contains("Hello"));
    }
}
