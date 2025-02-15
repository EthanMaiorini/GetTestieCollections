package rocks.zipcode;

import static org.junit.Assert.*;
import java.util.Stack;

public class TestStack {

    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestStack1() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        assertEquals(false, stack.isEmpty()); // false
    }

    // Make a bigger test exercising more Stack methods.....
    @org.junit.Test
    public void TestStack2() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        String result = (stack.peek());
        assertEquals(false, stack.isEmpty()); // false
        assertEquals("Hello world", result);
    }

    @org.junit.Test
    public void TestStack3() {
        Stack<String> stack = new Stack<>();
        stack.push("Hello world");
        stack.pop();
        assertEquals(true, stack.isEmpty()); // false
    }
}
