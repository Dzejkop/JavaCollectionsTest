package Tests;

import Main.TestObject;
import Main.TestingPair;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.LongStream;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class RemoveTest extends Test{

    private static final int HOW_MANY           = 5000;
    TestObject[] objectsToRemove;

    public RemoveTest(List<TestingPair> pairs) {
        super(pairs);
    }

    @Override
    public String getName() {
        return "Remove Test";
    }

    @Override
    public void prepare() {
        super.prepare();

        // Objects to remove, a set number of them distributed equally in the collection
        objectsToRemove = LongStream.range(0, HOW_MANY)
                .map(i -> Math.abs(i - HOW_MANY))
                .map(i -> i*(OBJECT_COUNT-1)/HOW_MANY)
                .mapToObj(i -> sample[(int)i])
                .toArray(size -> new TestObject[size]);
    }

    @Override
    public void executeTest(Collection collection) {
        collection.removeAll(Arrays.asList(objectsToRemove));
    }
}
