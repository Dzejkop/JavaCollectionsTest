package Tests;

import Main.TestObject;
import Main.TestingPair;
import junit.extensions.TestSetup;
import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class StandardFillTestTest extends TestCase {

    @Test
    public void testName() {
        Assert.assertEquals("Fill Test", new StandardFillTest(null).getName());
    }

    @Test
    public void testPreparationAndRunning() {
        List<TestingPair> l = Mockito.mock(List.class);
        l.add(new TestingPair(new ArrayList<>()));

        Tests.Test t = new StandardFillTest(l);
        t.prepare();
        t.preform();

        Assert.assertNotNull(t.getResults());
    }

}