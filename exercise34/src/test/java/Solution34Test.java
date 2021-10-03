import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


class Solution24Test {

    @Test
    void isListBuildingWorking(){
        List<String> list = Solution34.getList();
        assertEquals("Thor of Asgard", list.get(4));
    }


}
