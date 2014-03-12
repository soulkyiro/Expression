package evaluator.operation.addition;

import evaluator.operation.Operator;

public class AdditionDoubleDouble implements Operator {

    @Override
    public Object evaluator(Object left, Object right) {
        return (double) left + (double) right;
    }
}
