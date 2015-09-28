package expression;

/**
 * Created by usuario on 28/09/2015.
 */
public abstract class Operation extends Expression {
    protected final Expression left;
    protected final Expression right;

    public Operation(Expression right, Expression left) {
        this.right = right;
        this.left = left;
    }
}
