package rocks.zipcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.PriorityQueue;

import static org.junit.Assert.assertEquals;

public class ComparableTest {
    @org.junit.Before
    public void setUp() throws Exception {
    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestArrayDeque3() {
        ArrayList<Person> deque = new ArrayList<>();
        Person bob = new Person("Bob",2020);
        Person joe = new Person("Joe",2017);
        Person mike = new Person("Mike",2017);
        Person nick = new Person("Nick",1969);
        String string ="";
        deque.add(bob);
        deque.add(joe);
        deque.add(mike);
        deque.add(nick);
        Collections.sort(deque);
        for(Person p:deque)
            string += p.getName();
        assertEquals("BobJoeMikeNick", string);
    }

}
