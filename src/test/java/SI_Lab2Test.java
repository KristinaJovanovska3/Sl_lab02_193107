import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SI_Lab2Test {

    @Test
    public void test2() {
        //Testing branch 1,2,3,4,5,8
        Time t = new Time(34, 30, 30);
        List lists = new ArrayList<>();
        lists.add(t);
        try {
            SI_Lab2.function(lists);
        } catch (Exception e) {
            assertEquals(e.getMessage(), "The hours are grater than the maximum");
        }
    }
    @Test
    public void test6() {
        Time t = new Time(24, 0, 0);
        List list = new ArrayList<>();
        List result = new ArrayList<>();
        list.add(t);
        result = SI_Lab2.function(list);
        assertEquals(result.get(0), t.getHours() * 3600 + t.getMinutes() * 60 + t.getSeconds());
    }
}