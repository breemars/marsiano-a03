import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.HashMap;
import java.util.Map;

class SolutionTest {

    @Test
    void createMap(){
        Map<String,String> expected = new HashMap<>();
        expected.put("first", "firstName");
        expected.put("last", "lastName");
        expected.put("position", "job");
        expected.put("date", "2021");

        Map<String,String> actual = Solution39.addEmployeeAsMap("firstName", "lastName", "job", "2021");

        assertEquals(expected, actual);
    }

    
}
