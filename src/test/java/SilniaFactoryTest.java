import org.junit.Assert;
import org.junit.Test;
import silnia.*;

public class SilniaFactoryTest {
    @Test
    public void shouldReturn120When5thProductWasRequestedRecursivelyUsingFactory(){
        //given
        final int expectedProduct = 120;
        final int requestProduct = 5;
        final SilniaType type = SilniaType.RECURSIVE;

        Silnia silniaUnderTest = SilniaFactory.produce(type);

        //when
        int result = silniaUnderTest.generate(requestProduct);

        //then

        Assert.assertEquals(expectedProduct,result);
        Assert.assertTrue(silniaUnderTest instanceof Silnia);
        Assert.assertTrue(silniaUnderTest instanceof SilniaRecursive);
        Assert.assertFalse(silniaUnderTest instanceof SilniaIterational);

    }

    @Test
    public void shouldReturn120When5thProductWasRequestedIterationalUsingFactory(){
        //given
        final int expectedProduct = 120;
        final int requestProduct = 5;
        final SilniaType type = SilniaType.ITERATIONAL;

        Silnia silniaUnderTest = SilniaFactory.produce(type);

        //when
        int result = silniaUnderTest.generate(requestProduct);

        //then

        Assert.assertEquals(expectedProduct, result);
        Assert.assertTrue(silniaUnderTest instanceof Silnia);
        Assert.assertFalse(silniaUnderTest instanceof SilniaRecursive);
        Assert.assertTrue(silniaUnderTest instanceof SilniaIterational);
    }



}
