package evaluator.operation.multiply;

import evaluator.operation.Operator;

public class MultiplyDoubleDouble implements Operator{

    @Override
    public Object evaluator(Object left, Object right) {
        return (double) left * (double) right;
    }
    
}
