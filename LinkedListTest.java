import static org.junit.Assert.*;

import java.util.NoSuchElementException;
import org.junit.Test;

public class LinkedListTest {

    @Test(expected = NoSuchElementException.class)
    public void testLastEmptyList() {
        LinkedList list = new LinkedList();
        list.last();
    }

    @Test
    public void testLastNonEmptyList() {
        LinkedList list = new LinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        assertEquals(3, list.last());
    }
}
