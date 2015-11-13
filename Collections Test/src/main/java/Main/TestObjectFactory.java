package Main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class TestObjectFactory {

    Random random;
    RandomStringGenerator randomStringGenerator;

    private static final int MIN_DUPLICATES_PER_SOURCE_OBJECT = 2;
    private static final int MAX_DUPLICATES_PER_SOURCE_OBJECT = 50;

    public TestObjectFactory() {
        random = new Random();
        randomStringGenerator = new RandomStringGenerator(random);
    }

    public TestObject randomObject() {
        return new TestObject(
                random.nextFloat(),
                random.nextInt(),
                randomStringGenerator.nextString()
        );
    }

    public TestObject[] generateSampleEnsureDuplicates(int count) {
        TestObject[] sample = generateSample(count);

        int n = count/20;

        for(int i = 0 ; i < n ; i++) {
            int c = random.nextInt(count);
            TestObject source = sample[c];

            // Duplicate each a random (bounded) number of times
            int q = MIN_DUPLICATES_PER_SOURCE_OBJECT + random.nextInt(MAX_DUPLICATES_PER_SOURCE_OBJECT - MIN_DUPLICATES_PER_SOURCE_OBJECT);
            for(int d = 0 ; d < q; d++) {
                sample[random.nextInt(count)] = source;
            }
        }

        return sample;
    }

    public TestObject[] generateSample(int count) {
        TestObject[] sample = new TestObject[count];

        for (int i = 0; i < count; i++) {
            sample[i] = randomObject();
        }

        return sample;
    }
}
