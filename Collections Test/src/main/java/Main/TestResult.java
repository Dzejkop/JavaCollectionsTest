package Main;

import java.util.List;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class TestResult {

    public String testName;
    public List<TestingPair> pairs;

    public TestResult(String name, List<TestingPair> pairs) {
        this.testName = name;
        this.pairs = pairs;
    }

}
