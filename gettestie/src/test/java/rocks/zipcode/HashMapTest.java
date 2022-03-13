package rocks.zipcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class HashMapTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashMap1() {
        Map<String,String> map = new HashMap<>();
        map.put("Greeting","Hello world");
        assertEquals(false, map.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @org.junit.Test
    public void TestHashMap2() {
        Map<String,String> map = new HashMap<>();
        map.put("Greeting","Hello world");
        String result = (map.get("Greeting"));
        assertEquals(false, map.isEmpty()); // false
        assertEquals("Hello world", result);
    }

    @org.junit.Test
    public void TestHashMap3() {
        Map<String,String> map = new HashMap<>();
        map.put("Greeting","Hello world");
        map.remove("Greeting");
        assertEquals(true, map.isEmpty()); // false
    }
}
