package rocks.zipcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

import static org.junit.Assert.assertEquals;

public class IteratorTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestIterator2() {
        ArrayList<String> set = new ArrayList<>();
        set.add("Hello world");
        set.add("Greetings");
        Iterator<String> it = set.iterator();
        String result = it.next();
        assertEquals(false, set.isEmpty()); // false
        assertEquals("Hello world", result);
    }

}
