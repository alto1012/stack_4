package tom;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

/**
 * Base test for any class that implements the Stack interface.
 */
public class StackTest {

    /**
     * The stack to use in all the tests: set this in subclasses.
     */
    protected Stack s;

    @Before
    public void setUp() throws Exception {
        s = new Stack();
    }

    @Test
    public void testNewStackIsEmpty() {
        
        assertEquals(0, s.size());
    }

}
