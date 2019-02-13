import fibonacci.*;
import org.junit.Assert;
import org.junit.Test;

public class FibonacciFactoryTest {

    @Test
    public void shouldReturn8when6thProductWasRequestedRecursivelyUsingFactory(){
        //given
        final int expectedProduct = 8;
        final int requestProduct = 6;
        final FibonacciType type = FibonacciType.RECURSIVE;

        Fibonacci fibonacciUnderTest = FibonacciFactory.produce(type);
        //when
        int result = fibonacciUnderTest.generate(requestProduct);

        //then

        Assert.assertEquals(expectedProduct, result);
        Assert.assertTrue(fibonacciUnderTest instanceof Fibonacci);
        Assert.assertTrue(fibonacciUnderTest instanceof FibonacciRecursive);
        Assert.assertFalse(fibonacciUnderTest instanceof FibonacciIterational);
    }


}
