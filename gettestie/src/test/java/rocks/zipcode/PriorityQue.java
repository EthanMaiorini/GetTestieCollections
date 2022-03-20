package rocks.zipcode;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

import static org.junit.Assert.assertEquals;

public class PriorityQue {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestPriorityQueue2() {
        PriorityQueue<String> deque = new PriorityQueue<>();
        deque.add("Hello world");
        String result = (deque.peek());
        assertEquals(false, deque.isEmpty()); // false
        assertEquals("Hello world", result);
    }

    @org.junit.Test
    public void TestArrayDeque3() {
        PriorityQueue<String> deque = new PriorityQueue<>();
        deque.add("Hello world");
        deque.add("Greeting");
        deque.add("Alright");
        deque.add("Howdy");
        String result = (deque.peek());
        String result2 = deque.poll();
        assertEquals(false, deque.isEmpty()); // false
        assertEquals("Alright", result);
        assertEquals("Alright", result2);
    }

}
