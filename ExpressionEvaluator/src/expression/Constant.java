package expression;

//import interpreter.Operation;

public class Constant extends Expression {

    private int value;

    public Constant(int data) {
        this.value = data;
    }

    @Override
    public int value() {
        return value;
    }
}