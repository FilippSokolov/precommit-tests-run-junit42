import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestFailedOnBefore {
    @Before
    public void before() {
        assertTrue("fails", false);
    }

    @Test
    public void failsOnBefore() {
        assertTrue(false);
    }
}
