import org.junit.*;
import static org.junit.Assert.*;

public class SkillDemoTester {
    @Test
    public void getStringTester() {
        assertEquals(SkillDemo.getString(1), "CSE");
    }
}
