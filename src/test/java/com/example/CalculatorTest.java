import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    
    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(3, 5);
        assertEquals(8, result);
    }

    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int result = calculator.sum(3, 5);
        assertEquals(7, result);
    }
}