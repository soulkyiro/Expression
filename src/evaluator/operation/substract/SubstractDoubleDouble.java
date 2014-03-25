package evaluator.operation.substract;

import evaluator.operation.Operator;

public class SubstractDoubleDouble implements Operator {

    @Override
    public Object evaluator(Object left, Object right) {
        return (double) left - (double) right;
    }

}
