package leetcode.dynprog.p322coinchange;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class ChangeCoinTest {
    public Solution s = new Solution1();
    public int[] coins;
    public int amount;
    public int expCoinNum;

    public ChangeCoinTest(int[] pCoins, int pAmount, int pExpCoinNum) {
        coins = pCoins;
        amount = pAmount;
        expCoinNum = pExpCoinNum;
    }

    @Parameterized.Parameters
    public static Object[][] getTests() {
        return new Object[][]{
                new Object[] {new int[]{357,239,73,52}, 9832, 35},
                new Object[] {new int[]{186,419,83,408}, 6249, 20},
                new Object[] {new int[]{1,2,5}, 11, 3},
                new Object[] {new int[]{5,2,1}, 11, 3},
                new Object[] {new int[]{2}, 3, -1},
                new Object[] {new int[]{1}, 0, 0},

        };
    }
    @Test
    public void test() {
        Assert.assertEquals(expCoinNum, s.coinChange(coins, amount));
    }
}
