
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTest {

    int[] arrayTest = new int[]{-5, 0, 5, 10, 15};

    @Test
    public void test_findMax() {

        int max = Finder.findMax(arrayTest);
        Assert.assertEquals(max, 15);

    }

    @Test
    public void test_findMin() {

        int min = Finder.findMin(arrayTest);
        Assert.assertEquals(min, -5);

    }


}
