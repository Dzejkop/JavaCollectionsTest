package Main;

import junit.framework.TestCase;
import org.junit.Test;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class TestPerformerTest extends TestCase {

    @Test
    public void testShouldThrowExceptionIfGettingResultsBeforeRunningTests() {
        TestPerformer testPerformer = new TestPerformer(null);
        try {
            testPerformer.getResults();
            fail("Should throw an exception if attempting to access results before running tests");
        } catch (IllegalStateException e) {
        }
    }
}