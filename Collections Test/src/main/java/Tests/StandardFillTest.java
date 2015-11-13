package Tests;

import Main.TestObject;
import Main.TestObjectFactory;
import Main.TestingPair;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class StandardFillTest extends Test {

    public StandardFillTest(List<TestingPair> pairs) {
        super(pairs);
    }

    @Override
    public String getName() {
        return "Fill Test";
    }

    @Override
    public void executeTest(Collection collection) {
        collection.addAll(Arrays.asList(sample));
    }
}
