import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CreditCalculatorTest {
    private final int sum = 500_000;
    private final int period = 36;
    private final double rate = 10;

    private CreditCalculator calculator = new CreditCalculator();

    @Test
    void monthlyPayment() {
        int result = 18_055;
        int actual = calculator.monthlyPayment(sum, period, rate);
        assertEquals(result, actual);
    }

    @Test
    void totalAmount() {
        int result = 650_000;
        int actual = calculator.totalAmount(sum, period, rate);
        assertEquals(result, actual);
    }

    @Test
    void creditOverpayment() {
        int result = 150_000;
        int actual = calculator.creditOverpayment(sum, period, rate);
        assertEquals(result, actual);
    }
}