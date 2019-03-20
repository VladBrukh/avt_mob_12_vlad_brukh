import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassString() {
        String check_string = this.getClassString();

        Assert.assertTrue("none of the substrings \"Hello\" and \"hello\" were found in the string \"Hello, world\"",
                check_string.contains("hello") || check_string.contains("Hello"));
    }
}
