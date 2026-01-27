import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FactorialTest {

    @Test
    public void testFactorialZero() {
        assertEquals(1, Factorial.factorial(0));
    }

    @Test
    public void testFactorialOne() {
        assertEquals(1, Factorial.factorial(1));
    }

    @Test
    public void testFactorialPositive() {
        assertEquals(120, Factorial.factorial(5));
        assertEquals(3628800, Factorial.factorial(10));
    }

    @Test
    public void testFactorialNegative() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Factorial.factorial(-3);
        });
        assertEquals("Le nombre doit être positif !", exception.getMessage());
    }

}