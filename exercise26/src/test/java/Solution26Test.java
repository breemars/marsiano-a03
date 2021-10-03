import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Solution26Test {

    @Test
    void calculatorTest(){
        PaymentCalculator credit = new PaymentCalculator(5000, 12, 100);
        double actual = credit.calculateMonthsUntilPaidOff();
        assertEquals(70, actual);
    }

}
