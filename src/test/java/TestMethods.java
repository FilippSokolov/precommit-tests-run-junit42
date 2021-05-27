import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestMethods {

    @Test
    public void failed() {
        assertTrue(false);
    }

    @Test
    public void passed() {
        assertTrue(true);
    }
}
