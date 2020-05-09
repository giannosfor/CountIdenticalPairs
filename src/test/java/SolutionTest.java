import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class SolutionTest {

    private static final int MAX_IDENTICAL_PAIRS = 1_000_000_000;
    private static final int MAX_N = 100_000;

    private Solution solution;

    @Before
    public void setUp() {
        solution = new Solution();
    }

    @Test
    public void testExampleData() throws Exception {
        assertEquals(4,solution.countIdenticalPairs(new int[]{3,5,6,3,3,5}));
    }

    @Test
    public void zeroDuplicates() throws Exception {
        assertEquals(0,solution.countIdenticalPairs(new int[]{3,5,6,4,0,9}));
    }

    @Test
    public void twoPairsData() throws Exception {
        assertEquals(5,solution.countIdenticalPairs(new int[]{3,5,6,3,3,5,6}));
    }

    @Test
    public void threePairsData() throws Exception {
        assertEquals(7,solution.countIdenticalPairs(new int[]{3,5,6,3,3,5,6,0,6}));
    }

    @Test
    public void threePairsWithQuatroData() throws Exception {
        assertEquals(10,solution.countIdenticalPairs(new int[]{3,5,6,3,3,5,6,3,6}));
    }

//    @Test // The combinations can't exceed the maximum number of identical pairs of indices.
    public void countMaxElementRange() throws Exception {
        int[] intArray = new int[MAX_N]; // By default the value is 0
        int identicalPairs = solution.countIdenticalPairs( intArray );
        assertTrue(identicalPairs < MAX_IDENTICAL_PAIRS);
    }



    @Test
    public void testCombinatory() {
        assertEquals(10, Solution.combinatory(5));
    }

    @Test
    public void threeValueCombinatory() {
        assertEquals(3, Solution.combinatory(3));
    }

    @Test
    public void twoValueCombinatory() {
        assertEquals(1, Solution.combinatory(2));
    }

    @Test
    public void OneValueCombinatory() {
        assertEquals(0, Solution.combinatory(1));
    }

    @Test
    public void zeroValueCombinatory() {
        assertEquals(0, Solution.combinatory(0));
    }
}
 
