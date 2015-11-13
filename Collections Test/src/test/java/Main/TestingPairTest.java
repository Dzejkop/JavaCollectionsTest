package Main;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class TestingPairTest extends TestCase {

    @Test
    public void testSet() {
        TestingPair p = new TestingPair(new ArrayList<>());

        p.set(250);

        Assert.assertEquals(250, p.executionTime);
    }
}