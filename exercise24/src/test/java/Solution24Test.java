import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


class Solution24Test {

    @Test
    void anagramTest(){
        boolean actual = Solution24.isAnagram("earth", "Heart");
        assertTrue(actual);
    }


}
