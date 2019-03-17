import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetClassNumber() {
        int check_number = this.getClassNumber();

        Assert.assertTrue("check number can not be > 45",check_number > 45);
    }
}
