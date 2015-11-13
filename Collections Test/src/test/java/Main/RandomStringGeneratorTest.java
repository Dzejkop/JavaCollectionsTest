package Main;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class RandomStringGeneratorTest extends TestCase {

    @Test
    public void testNextString() throws Exception {
        RandomStringGenerator randomStringGenerator = new RandomStringGenerator(new Random());
        Assert.assertNotNull(randomStringGenerator.nextString());
        Assert.assertNotNull(randomStringGenerator.nextString());
        Assert.assertNotNull(randomStringGenerator.nextString());
        Assert.assertNotNull(randomStringGenerator.nextString());
    }
}