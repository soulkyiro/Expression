package evaluator.operation.subtract;

import evaluator.operation.Operator;

public class SubtractDoubleInteger implements Operator {

    @Override
    public Object evaluator(Object left, Object right) {
        return (double) left - (int) right;
    }
}
