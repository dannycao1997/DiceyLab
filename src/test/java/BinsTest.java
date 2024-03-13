
import org.junit.Assert;
import org.junit.Test;

public class BinsTest {
    @Test
    public void testIncrement(){
        Bins bins = new Bins(2, 12);
        bins.incrementBin(12);
        Assert.assertEquals(1, bins.getBin(12).intValue());
    }
}