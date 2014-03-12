
import evaluator.Addition;
import evaluator.Constant;
import evaluator.Subtract;
import org.junit.Test;
import static org.junit.Assert.*;

public class ExpressionEvaluatorTest {

    @Test
    public void constantExpressionTest() {
        assertEquals(0, new Constant(0).evaluator());
        assertEquals(4, new Constant(4).evaluator());
        assertEquals(20, new Constant(20).evaluator());
    }

    @Test
    public void addIntegerIntegerExpressionTest() {
        assertEquals(4, new Addition(new Constant(2), new Constant(2)).evaluator());
        assertEquals(220, new Addition(new Constant(220), new Constant(0)).evaluator());
        assertEquals(20, new Addition(new Constant(5), new Constant(15)).evaluator());
    }

    @Test
    public void addDoubleIntegerExpressionTest() {
        assertEquals(4.2, new Addition(new Constant(2.2), new Constant(2)).evaluator());
        assertEquals(20.4, new Addition(new Constant(5.4), new Constant(15)).evaluator());
        assertEquals(220.9, new Addition(new Constant(220.9), new Constant(0)).evaluator());
    }

    @Test
    public void addIntegerDoubleExpressionTest() {
        assertEquals(4.2, new Addition(new Constant(2), new Constant(2.2)).evaluator());
        assertEquals(20.4, new Addition(new Constant(15), new Constant(5.4)).evaluator());
        assertEquals(220.9, new Addition(new Constant(0), new Constant(220.9)).evaluator());
    }

    @Test
    public void addDoubleDoubleExpressionTest() {
        assertEquals(5.0, new Addition(new Constant(2.2), new Constant(2.8)).evaluator());
        assertEquals(21.0, new Addition(new Constant(5.4), new Constant(15.6)).evaluator());
    }

    @Test
    public void subIntegerIntegerExpressionTest() {
        assertEquals(0, new Subtract(new Constant(2), new Constant(2)).evaluator());
        assertEquals(-10, new Subtract(new Constant(5), new Constant(15)).evaluator());
        assertEquals(220, new Subtract(new Constant(220), new Constant(0)).evaluator());
    }

    @Test
    public void subDoubleIntegerExpressionTest() {
        assertEquals(0.2, (double) new Subtract(new Constant(2.2), new Constant(2)).evaluator(), 0.1);
        assertEquals(-9.6, new Subtract(new Constant(5.4), new Constant(15)).evaluator());
        assertEquals(220.9, new Subtract(new Constant(220.9), new Constant(0)).evaluator());
    }

    @Test
    public void subIntegerDoubleExpressionTest() {
        assertEquals(-0.2, (double) new Subtract(new Constant(2), new Constant(2.2)).evaluator(), 0.1);
        assertEquals(9.6, new Subtract(new Constant(15), new Constant(5.4)).evaluator());
        assertEquals(-220.9, new Subtract(new Constant(0), new Constant(220.9)).evaluator());
    }

    @Test
    public void subDoubleDoubleExpressionTest() {
        assertEquals(-0.6, (double) new Subtract(new Constant(2.2), new Constant(2.8)).evaluator(), 0.1);
        assertEquals(-10.2, new Subtract(new Constant(5.4), new Constant(15.6)).evaluator());
    }
}
