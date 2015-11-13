package Files;

import Main.TestResult;
import Tests.Test;

import java.io.*;
import java.util.List;

/**
 * Created by Jakobs on 2015-11-12.
 */
public class ResultsWriter {

    List<TestResult> results;

    public ResultsWriter(List<TestResult> results) {
        this.results = results;
    }

    public void save(File destination) {
        try {

            if(!destination.exists()) destination.createNewFile();
            BufferedWriter writer = new BufferedWriter(new FileWriter(destination));

            results.forEach(r -> {
                try {
                    writer.write(r.testName);
                    writer.newLine();

                    r.pairs.forEach(p -> {
                        try {
                            writer.write(p.collection.getClass().getSimpleName() + " " + (p.executionTime / 1000000.0f) + "ms");
                            writer.newLine();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    });

                    writer.newLine();

                } catch (IOException e) {
                    e.printStackTrace();
                }
            });
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }


    }

}
