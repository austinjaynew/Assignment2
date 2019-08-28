
import org.junit.*;
import static org.junit.Assert.assertEquals;

public class JUnitTest {
    int[] array1 = new int[] {-5, 0, 5, 10, 15};
    @Test
        public void test_findMax() {

        int[] max = Finder.findMax(array1);
        Assert.assertEquals(max, 15);

    }
    @Test
    public void test_findMin() {

        int[] min = Finder.findMin(array1);
        Assert.assertEquals(min, 15);

    }


}
