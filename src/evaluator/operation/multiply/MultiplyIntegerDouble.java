package evaluator.operation.multiply;

import evaluator.operation.Operator;

public class MultiplyIntegerDouble implements Operator{

    @Override
    public Object evaluator(Object left, Object right) {
        return (int) left * (double) right;
    }
    
}
