import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

class Solution36Test {
    List<Double> list = new ArrayList<>();

    @BeforeEach
    void createList(){
        list.add(100.0);
        list.add(200.0);
        list.add(1000.0);
        list.add(300.0);
    }

    @Test
    void standardDevTest(){
        double actual = Solution36.std(list, 400);
        assertEquals(353.5533905932738, actual);
    }

    @Test
    void maximumTest(){
        double actual = Solution36.max(list);
        assertEquals(1000, actual);
    }

    @Test
    void minimumTest(){
        double actual = Solution36.min(list);
        assertEquals(100, actual);
    }

    @Test
    void averageTest(){
        double actual = Solution36.average(list);
        assertEquals(400, actual);
    }


}
