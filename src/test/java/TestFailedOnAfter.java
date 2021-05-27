import org.junit.After;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestFailedOnAfter {
    @Test
    public void failsOnAfter() {
        assertTrue(true);
    }

    @After
    public void after() {
        assertFalse("boom!", true);
    }

}
