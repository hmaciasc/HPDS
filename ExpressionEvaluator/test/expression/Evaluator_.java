package expression;


//import org.junit.Assert;
import org.junit.Test;
import static org.junit.Assert.*;

public class Evaluator_ {


    @Test
    public void should_evaluate_constant_expresion() throws Exception {
        assertEquals(5, new Constant(5).value());
    }

    @Test
    public void should_evaluate_add_expression() throws Exception {
        assertEquals(5, new Addition(new Constant(3), new Constant(2)).value());
        assertEquals(9, new Addition(new Constant(3), new Constant(6)).value());
        assertEquals(12, new Addition(new Constant(3), new Addition(new Constant(6), new Constant(3))).value());
    }

    @Test
    public void should_evaluate_subtract_expressions() throws Exception {
        assertEquals(1, new Subtraction(new Constant(3), new Constant(2)).value());

    }
}
