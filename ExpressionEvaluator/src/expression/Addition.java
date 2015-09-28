package expression;


public class Addition extends Operation{


    public Addition(Expression right, Expression left) {
        super(right, left);
    }

    @Override
    public int value(){
        return left.value() + right.value();
    }
}
