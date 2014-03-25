package evaluator.operation.substract;

import evaluator.operation.Operator;

public class SubstractIntegerInteger implements Operator {

    @Override
    public Object evaluator(Object left, Object right) {
        return (int) left - (int) right;    
    }
}
