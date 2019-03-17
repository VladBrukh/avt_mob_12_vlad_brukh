import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {
    @Test
    public void testGetLocalNumber() {
        int check_number = this.getLocalNumber();

        Assert.assertTrue("check_number != 14",check_number == 14);

    }
}
