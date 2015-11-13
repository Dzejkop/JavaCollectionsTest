package Main;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class TestObjectFactoryTest extends TestCase {

    @Test
    public void testRandomObject() {
        TestObjectFactory factory = new TestObjectFactory();

        TestObject o = factory.randomObject();
        Assert.assertNotNull(o);
        Assert.assertNotNull(o.stringVar);
    }

    @Test
    public void testForDuplicatesInSample() {
        TestObjectFactory factory = new TestObjectFactory();

        TestObject[] t1 = factory.generateSampleEnsureDuplicates(100);
        TestObject[] t2 = factory.generateSampleEnsureDuplicates(100);
        TestObject[] t3 = factory.generateSampleEnsureDuplicates(100);

        Assert.assertTrue(sampleHasDuplicates(t1));
        Assert.assertTrue(sampleHasDuplicates(t2));
        Assert.assertTrue(sampleHasDuplicates(t3));
    }

    private boolean sampleHasDuplicates(TestObject[] sample) {
        for(int i = 0 ; i < sample.length; i++) {
            for(int n = 0 ; n < sample.length; n++) {
                if(n != i) {
                    if(sample[i].equals(sample[n])) return true;
                }
            }
        }

        return false;
    }

    @Test
    public void testGenerateSampleLength() {

        TestObjectFactory factory = new TestObjectFactory();

        TestObject[] t1 = factory.generateSample(100);
        TestObject[] t2 = factory.generateSample(1000);
        TestObject[] t3 = factory.generateSample(10000);
        TestObject[] t4 = factory.generateSample(100000);

        Assert.assertEquals(100, t1.length);
        Assert.assertEquals(1000, t2.length);
        Assert.assertEquals(10000, t3.length);
        Assert.assertEquals(100000, t4.length);
    }
}