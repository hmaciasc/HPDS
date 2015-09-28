package expression;


//import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Evaluator_ {


    @Test
    public void should_evaluate_constant_expresion() throws Exception {
        Evaluator evaluator = new Evaluator();
        assertEquals(5, evaluator.evaluate(new Constant(5)));

    }


    @Test
    public void should_evaluate_add_expression() throws Exception {
        Evaluator evaluator = new Evaluator();
        assertEquals(5, evaluator.evaluate(new Addition(new Constant(3), new Constant(2))));
        assertEquals(9, evaluator.evaluate(new Addition(new Constant(3), new Constant(6))));
        assertEquals(12, evaluator.evaluate(new Addition(new Constant(3), new Addition(new Constant(6), new Constant(3)))));
    }
}
