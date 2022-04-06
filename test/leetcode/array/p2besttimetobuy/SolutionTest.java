package leetcode.array.p2besttimetobuy;

//import org.testng.annotations.Test;
import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.Preconditions;
import org.junit.jupiter.api.Assertions;

public class SolutionTest {
    private static Solution2 s = new Solution2();

    @Test
    public void test1() {
        int result = s.maxProfit(new int[]{7,1,5,3,6,4});
        Assertions.assertEquals(result,7);
    }
    @Test
    public void test2() {
        int result = s.maxProfit(new int[]{1,2,3,4,5});
        Assertions.assertEquals(result,4);
    }
    @Test
    public void test3() {
        int result = s.maxProfit(new int[]{7,6,4,3,1});
        Assertions.assertEquals(result,0);
    }
}
