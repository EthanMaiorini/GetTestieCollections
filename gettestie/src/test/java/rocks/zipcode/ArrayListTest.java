package rocks.zipcode;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class ArrayListTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayList1() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello world");
        assertEquals(false, list.isEmpty()); // false
    }

    // Make a bigger test exercising more ArrayList methods.....
    @org.junit.Test
    public void TestArrayList2() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello world");
        String result = (list.get(0));
        assertEquals(false, list.isEmpty()); // false
        assertEquals("Hello world", result);
    }

    @org.junit.Test
    public void TestArrayList3() {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hello world");
        list.remove(0);
        assertEquals(true, list.isEmpty()); // false
    }
}
