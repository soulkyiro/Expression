
import evaluator.Addition;
import evaluator.Constant;
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

   /* @Test
    public void addDoubleIntegerExpressionTest() {
        Assert.assertEquals(4.2, new Operation("add", new BinaryOperation(new Constant(2.2), new Constant(2))).evaluator());
        Assert.assertEquals(20.4, new Operation("add", new BinaryOperation(new Constant(5.4), new Constant(15))).evaluator());
        Assert.assertEquals(220.9, new Operation("add", new BinaryOperation(new Constant(220.9), new Constant(0))).evaluator());
    }

    @Test
    public void addIntegerDoubleExpressionTest() {
        Assert.assertEquals(4.2, new Operation("add", new BinaryOperation(new Constant(2), new Constant(2.2))).evaluator());
        Assert.assertEquals(20.4, new Operation("add", new BinaryOperation(new Constant(15), new Constant(5.4))).evaluator());
        Assert.assertEquals(220.9, new Operation("add", new BinaryOperation(new Constant(0), new Constant(220.9))).evaluator());
    }

    @Test
    public void addDoubleDoubleExpressionTest() {
        Assert.assertEquals(5.0, new Operation("add", new BinaryOperation(new Constant(2.2), new Constant(2.8))).evaluator());
        Assert.assertEquals(21.0, new Operation("add", new BinaryOperation(new Constant(5.4), new Constant(15.6))).evaluator());
    }

    @Test
    public void subIntegerIntegerExpressionTest() {
        Assert.assertEquals(0, new Operation("sub", new BinaryOperation(new Constant(2), new Constant(2))).evaluator());
        Assert.assertEquals(-10, new Operation("sub", new BinaryOperation(new Constant(5), new Constant(15))).evaluator());
        Assert.assertEquals(220, new Operation("sub", new BinaryOperation(new Constant(220), new Constant(0))).evaluator());
    }

    @Test
    public void subDoubleIntegerExpressionTest() {
        Assert.assertEquals(0.2, (double) new Operation("sub", new BinaryOperation(new Constant(2.2), new Constant(2))).evaluator(),0.1);
        Assert.assertEquals(-9.6, new Operation("sub", new BinaryOperation(new Constant(5.4), new Constant(15))).evaluator());
        Assert.assertEquals(220.9, new Operation("sub", new BinaryOperation(new Constant(220.9), new Constant(0))).evaluator());
    }

    @Test
    public void subIntegerDoubleExpressionTest() {
        Assert.assertEquals(-0.2,(double) new Operation("sub", new BinaryOperation(new Constant(2), new Constant(2.2))).evaluator(),0.1);
        Assert.assertEquals(9.6, new Operation("sub", new BinaryOperation(new Constant(15), new Constant(5.4))).evaluator());
        Assert.assertEquals(-220.9, new Operation("sub", new BinaryOperation(new Constant(0), new Constant(220.9))).evaluator());
    }

    @Test
    public void subDoubleDoubleExpressionTest() {
        Assert.assertEquals(-0.6, (double) new Operation("sub", new BinaryOperation(new Constant(2.2), new Constant(2.8))).evaluator(),0.1);
        Assert.assertEquals(-10.2, new Operation("sub", new BinaryOperation(new Constant(5.4), new Constant(15.6))).evaluator());
    }*/
}
