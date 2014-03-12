package evaluator.operation.addition;

import evaluator.BinaryOperation;
import evaluator.operation.Operator;

public class AdditionDoubleInteger implements Operator {

    @Override
    public Object evaluator(Object left, Object right) {
        return (double) left + (int)right;
    }

}
