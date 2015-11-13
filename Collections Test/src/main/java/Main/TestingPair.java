package Main;

import java.util.Collection;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class TestingPair {
    public Collection<TestObject> collection;
    public long executionTime;

    public TestingPair(Collection<TestObject> collection) {
        this.collection = collection;
    }

    public void set(long time) {
        this.executionTime = time;
    }
}
