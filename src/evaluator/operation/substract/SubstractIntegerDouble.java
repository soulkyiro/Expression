package evaluator.operation.substract;

import evaluator.operation.Operator;

public class SubstractIntegerDouble implements Operator {


    @Override
    public Object evaluator(Object left, Object right) {
        return (int) left - (double) right;
    }

}
