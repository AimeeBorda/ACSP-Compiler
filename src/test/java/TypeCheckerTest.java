import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.junit.Assert.assertEquals;

@RunWith(JUnit4.class)
public class TypeCheckerTest {

    @Test
    public void testSkip(){
        assertEquals("",null,null);
    }
}
