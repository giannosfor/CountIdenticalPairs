import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertEquals;

public class SolutionTest {

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testExampleData() throws Exception {
        assertEquals(4,solution.countIdenticalPairs(new int[]{3,5,6,3,3,5}));
    }
}
 
