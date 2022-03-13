package rocks.zipcode;

import java.util.LinkedList;
import java.util.Stack;

import static org.junit.Assert.assertEquals;

public class LinkedListTest {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestLinkedList1() {
        LinkedList<String> linked = new LinkedList<>();
        linked.push("Linked List Test");
        assertEquals(false, linked.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @org.junit.Test
    public void TestLinkedList2() {
        LinkedList<String> linked = new LinkedList<>();
        linked.push("Hello world");
        String result = (linked.peek());
        assertEquals(false, linked.isEmpty()); // false
        assertEquals("Hello world", result);
    }

    @org.junit.Test
    public void TestLinkedList3() {
        LinkedList<String> linked = new LinkedList<>();
        linked.push("Hello world");
        linked.pop();
        assertEquals(true, linked.isEmpty()); // false
    }
}
