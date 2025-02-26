package Test;

public class MockScanner {
    private final String[] inputs;
    private int index = 0;

    public MockScanner(String... inputs) {
        this.inputs = inputs;
    }

    public String nextLine() {
        if (index < inputs.length) {
            return inputs[index++];
        }
        return null; 
    }
}