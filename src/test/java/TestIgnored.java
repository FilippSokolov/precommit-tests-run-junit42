import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class TestIgnored {

    @Ignore
    @Test
    public void ignored() {
        assertTrue(true);
        assertTrue(false);
    }
}
