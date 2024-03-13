
import org.junit.Test;
import org.junit.Assert;

public class DiceTest {

    @Test
    public void testTossAndSum() { // testing rolling 2 dice
        Dice dice = new Dice(2);
        int toss = dice.tossAndSum();
        Assert.assertTrue(toss >= 2 && toss <= 12);
    }

}