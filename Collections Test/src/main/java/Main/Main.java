package Main;

import Files.ResultsWriter;

import java.io.File;
import java.util.*;

/**
 * Created by Jakobs on 2015-11-02.
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Start");

        List<Collection<TestObject>> collections = new ArrayList<>();
        collections.add(new ArrayList<>());
        collections.add(new HashSet<>());
        collections.add(new LinkedList<>());
        collections.add(new LinkedHashSet<>());
        collections.add(new TreeSet<>());

        TestPerformer testPerformer = new TestPerformer(collections);
        testPerformer.setupTests();
        testPerformer.runTests();

        ResultsWriter resultsWriter = new ResultsWriter(testPerformer.getResults());
        resultsWriter.save(new File("results.txt"));

        System.out.println("End");
    }
}
