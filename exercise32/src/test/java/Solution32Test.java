import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class Solution24Test {

    @Test
    void isRandomNumberGeneratorWorking(){
        for(int x = 0; x < 100; x++) {
            int actual = Solution32.getNumber(1);
            if (actual >= 1 && actual <= 10)
                assertTrue(true);
            else
                fail();
        }
    }


}
