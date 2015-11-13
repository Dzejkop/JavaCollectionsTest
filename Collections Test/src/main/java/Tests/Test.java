package Tests;

import Main.TestObject;
import Main.TestObjectFactory;
import Main.TestingPair;

import java.util.Collection;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Jakobs on 2015-11-02.
 */
public abstract class Test {

    protected static final int OBJECT_COUNT = 750000;

    TestObject[] sample;
    List<TestingPair> pairs;

    public Test(List<TestingPair> pairs) {
        this.pairs = pairs;
    }

    public abstract String getName();
    public abstract void executeTest(Collection collection);

    public void prepare() {
        sample = new TestObjectFactory().generateSampleEnsureDuplicates(OBJECT_COUNT);
    }

    public List<TestingPair> getResults() {
        return pairs;
    }

    public void preform() {
        pairs.forEach(p -> {
            long startTime, endTime;

            startTime = System.nanoTime();
            executeTest(p.collection);
            endTime = System.nanoTime();

            p.executionTime = endTime - startTime;
        });
    }
}
