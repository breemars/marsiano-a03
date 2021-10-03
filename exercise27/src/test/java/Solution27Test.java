import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

//False means that no errors were thrown

class Solution24Test {

    @Test
    void validateIDTest(){
        boolean actual = Solution27.validateID("AA-1234");
        assertFalse(actual);
    }

    @Test
    void validateZIPTest(){
        boolean actual = Solution27.validateZIP("55555");
        assertFalse(actual);
    }

    @Test
    void validateNameTest(){
        boolean actual = Solution27.validateName("John");
        assertFalse(actual);
    }


}
