package Main;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class TestObjectTest extends TestCase {

    @Test
    public void testEquals() throws Exception {
        TestObject a = new TestObject(0, 0, "");
        TestObject b = new TestObject(0, 0, "");

        Assert.assertEquals(a, b);

        b = new TestObject(1, 2, "l");

        Assert.assertNotEquals(a, b);
    }

    @Test
    public void testHashCode() {
        TestObject a = new TestObject(0, 0, "");
        TestObject b = new TestObject(0, 0, "");

        Assert.assertEquals(a.hashCode(), b.hashCode());

        b = new TestObject(1, 2, "l");

        Assert.assertNotEquals(a.hashCode(), b.hashCode());
    }

    @Test
    public void testNullPointerExceptionForNullStringInHashCodeFunction() {
        try {
            new TestObject(1, 1, null).hashCode();
            fail();
        } catch (NullPointerException e) {}
    }

    @Test
    public void testCompareTo() {

        TestObject t1 = new TestObject(1, 12, "");
        TestObject t2 = new TestObject(0, 5, "");

        Assert.assertEquals(1, t1.compareTo(t2));

        t2 = new TestObject(1, 5, "");

        Assert.assertEquals(1, t1.compareTo(t2));

        t2 = new TestObject(12, 0, "");

        Assert.assertEquals(-1, t1.compareTo(t2));

        t2 = new TestObject(1, 12, "");

        Assert.assertEquals(0, t1.compareTo(t2));

    }
}