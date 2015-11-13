package Main;

import Tests.*;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class TestPerformer {

    private boolean isTestingOver = false;

    List<Collection<TestObject>> testedCollections;
    List<Test> tests;

    public TestPerformer(List<Collection<TestObject>> testedCollections) {
        this.testedCollections = testedCollections;
        tests = new ArrayList<>();
    }

    public void setupTests() {
        tests.add(new StandardFillTest(generateTestingPairs()));
        tests.add(new RemoveTest(generateTestingPairs()));
        tests.add(new SortTest(generateTestingPairs()));
        tests.add(new GetTest(generateTestingPairs()));
    }

    private List<TestingPair> generateTestingPairs() {
        return testedCollections.stream().map(c -> new TestingPair(c)).collect(Collectors.toList());
    }

    public List<TestResult> getResults() {
        if (!isTestingOver) throw new IllegalStateException();
        return tests.stream().map(t -> new TestResult(t.getName(), t.getResults())).collect(Collectors.toList());
    }

    public void runTests() {
        tests.forEach(t -> {
            t.prepare();
            t.preform();
        });

        isTestingOver = true;
    }
}
