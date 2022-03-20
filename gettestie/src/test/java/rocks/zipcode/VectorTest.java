package rocks.zipcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Vector;

import static org.junit.Assert.assertEquals;

public class VectorTest {

        @org.junit.Before
        public void setUp() throws Exception {
        }

        @org.junit.After
        public void tearDown() throws Exception {
        }

        @org.junit.Test
        public void TestVector1() {
            Vector<String> vector= new Vector<>();
            vector.add("Hello world");
            assertEquals(false, vector.isEmpty()); // false
        }

        // Make a bigger test exercising more Stack methods.....
        @org.junit.Test
        public void TestVector2() {
            Vector<String> vector = new Vector<>();
            vector.add("Greeting");
            vector.add("Hello world");
            String result = vector.get(1);
            assertEquals(false, vector.isEmpty()); // false
            assertEquals("Hello world", result);
        }

        @org.junit.Test
        public void TestVector3() {
            Vector<String> vector = new Vector<>();
            vector.add("Greeting");
            vector.add("Hello world");
            vector.remove("Greeting");
            assertEquals(false, vector.isEmpty()); // false
        }
}
