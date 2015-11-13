package Tests;

import Main.TestObject;
import Main.TestObjectFactory;
import Main.TestingPair;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class SortTest extends Test {

    public SortTest(List<TestingPair> pairs) {
        super(pairs);
    }

    @Override
    public String getName() {
        return "Sort Test";
    }

    @Override
    public void executeTest(Collection collection) {
        sort(collection);
    }

    void sort(Collection<TestObject> collection) {
        collection.stream().sorted((a, b) -> a.compareTo(b)).collect(Collectors.toList());
    }
}
