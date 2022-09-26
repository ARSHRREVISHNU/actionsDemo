import org.testng.Assert;
import org.testng.annotations.Test;

public class TestClass {

    @Test
    public void testone(){
        Assert.assertEquals(1, 1);
    }

    @Test
    public void testTwo(){
        Assert.assertEquals("Given String", "Given String");
    }

}
