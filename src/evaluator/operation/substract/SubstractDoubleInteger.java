package evaluator.operation.substract;

import evaluator.operation.Operator;

public class SubstractDoubleInteger implements Operator {

    @Override
    public Object evaluator(Object left, Object right) {
        return (double) left - (int) right;
    }
}
