package rocks.zipcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import static org.junit.Assert.assertEquals;

public class TreeSetTest {


        @org.junit.Before
        public void setUp() throws Exception {
        }

        @org.junit.After
        public void tearDown() throws Exception {
        }

        @org.junit.Test
        public void TestSetMap1() {
            TreeSet<String> map = new TreeSet<>();
            map.add("Greeting");
            map.add("Hello world");
            assertEquals(false, map.isEmpty()); // false
        }

        // Make a bigger test exercising more Stack methods.....
        @org.junit.Test
        public void TestSetMap2() {
            TreeSet<String> map = new TreeSet<>();
            map.add("Hello world");
            map.add("Greeting");
            String result = map.first();
            assertEquals(false, map.isEmpty()); // false
            assertEquals("Greeting", result);
        }

        @org.junit.Test
        public void TestSetMap3() {
            TreeSet<String> map = new TreeSet<>();
            map.add("Greeting");
            map.add("Hello world");
            map.remove("Greeting");
            assertEquals(false, map.isEmpty()); // false
        }
}
