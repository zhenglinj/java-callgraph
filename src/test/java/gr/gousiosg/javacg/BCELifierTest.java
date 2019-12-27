package gr.gousiosg.javacg;

import org.apache.bcel.util.BCELifier;
import org.junit.Test;

public class BCELifierTest {
    @Test
    public void test() throws Exception {
        String[] strings = {"SampleClass"};
        BCELifier.main(strings);
    }
}
