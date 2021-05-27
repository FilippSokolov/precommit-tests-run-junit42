import org.junit.runners.Suite;
import org.junit.runner.RunWith;

@RunWith(Suite.class)
@Suite.SuiteClasses({TestPassed.class, TestIgnored.class, TestFailed.class})
public class TestSuite {
    //nothing
}