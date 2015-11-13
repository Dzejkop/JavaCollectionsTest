package Main;

import java.util.Base64;
import java.util.Random;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class RandomStringGenerator {

    Random random;

    public RandomStringGenerator(Random random) {
        this.random = random;
    }

    public String nextString() {
        byte[] bytes = new byte[64];
        random.nextBytes(bytes);
        String s = new String(Base64.getEncoder().encode(bytes));
        return s;
    }

}
