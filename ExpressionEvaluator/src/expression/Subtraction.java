package expression;

public class Subtraction extends Operation {


    public Subtraction(Expression right, Expression left) {
        super(right, left);
    }

    @Override
    int value() {
        return left.value() - right.value();
    }

}
