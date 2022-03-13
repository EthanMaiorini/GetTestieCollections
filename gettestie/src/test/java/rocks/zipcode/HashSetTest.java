package rocks.zipcode;

import java.util.HashSet;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class HashSetTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestHashSet1() {
        HashSet<String> set = new HashSet<>();
        set.add("Hello world");
        assertEquals(false, set.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @org.junit.Test
    public void TestHashSet2() {
        HashSet<String> set = new HashSet<>();
        set.add("Hello world");
        boolean result = (set.contains("Hello world"));
        assertEquals(false, set.isEmpty()); // false
        assertEquals(true, result);
    }

    @org.junit.Test
    public void TestHashSet3() {
        HashSet<String> set = new HashSet<>();
        set.add("Hello world");
        set.remove("Hello world");
        assertEquals(true, set.isEmpty()); // false
    }
}
