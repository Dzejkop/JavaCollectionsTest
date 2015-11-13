package Tests;

import Main.TestObject;
import Main.TestingPair;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class GetTest extends Test {
    public GetTest(List<TestingPair> pairs) {
        super(pairs);
    }

    @Override
    public String getName() {
        return "Get Test";
    }

    @Override
    public void executeTest(Collection collection) {
        Iterator<TestObject> i = collection.iterator();
        TestObject o;
        while(i.hasNext()) {
            o = i.next();
        }
    }
}
