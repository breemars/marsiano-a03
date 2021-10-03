import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;


class Solution38Test {

    @Test
    void isListBreakerWorking(){
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(56);
        expected.add(7);

        List<Integer> actual = Solution38.getList("   2 56    7  ");
        assertEquals(expected, actual);
    }

    @Test
    void onlyEvensInListWorking(){
        List<Integer> expected = new ArrayList<>();
        expected.add(2);
        expected.add(56);

        List<Integer> actual = new ArrayList<>();
        actual.add(2);
        actual.add(56);
        actual.add(7);
        actual = Solution38.filterEvenNumbers(actual);

        assertEquals(expected, actual);
    }


}
