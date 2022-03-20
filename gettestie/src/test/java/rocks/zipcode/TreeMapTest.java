package rocks.zipcode;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

import static org.junit.Assert.assertEquals;

public class TreeMapTest {


        @org.junit.Before
        public void setUp() throws Exception {
        }

        @org.junit.After
        public void tearDown() throws Exception {
        }

        @org.junit.Test
        public void TestTreeMap1() {
            Map<String, String> map = new TreeMap<>();
            map.put("Greeting", "Hello world");
            assertEquals(false, map.isEmpty()); // false
        }

        // Make a bigger test exercising more Stack methods.....
        @org.junit.Test
        public void TestTreeMap2() {
            Map<String, String> map = new TreeMap<>();
            map.put("Greeting", "Hello world");
            String result = (map.get("Greeting"));
            assertEquals(false, map.isEmpty()); // false
            assertEquals("Hello world", result);
        }

        @org.junit.Test
        public void TestTreeMap3() {
            Map<String, String> map = new TreeMap<>();
            map.put("Greeting", "Hello world");
            map.remove("Greeting");
            assertEquals(true, map.isEmpty()); // false
        }
    }

