package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class ArrayDequeTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayDeque1() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        assertEquals(false, deque.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @org.junit.Test
    public void TestArrayDeque2() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        String result = (deque.peek());
        assertEquals(false, deque.isEmpty()); // false
        assertEquals("Hello world", result);
    }

    @org.junit.Test
    public void TestArrayDeque3() {
        ArrayDeque<String> deque = new ArrayDeque<>();
        deque.push("Hello world");
        deque.pop();
        assertEquals(true, deque.isEmpty()); // false
    }
}
