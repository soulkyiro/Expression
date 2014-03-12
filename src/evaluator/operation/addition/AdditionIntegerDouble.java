package evaluator.operation.addition;

import evaluator.operation.Operator;

public class AdditionIntegerDouble implements Operator {

    @Override
    public Object evaluator(Object left, Object right) {
        return (int) left + (double) right;
    }

}
