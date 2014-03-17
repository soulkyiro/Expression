package evaluator.operation.multiply;

import evaluator.operation.Operator;

public class MultiplyDoubleInteger implements Operator{

    @Override
    public Object evaluator(Object left, Object right) {
        return (double) left * (int) right;
    }
    
}
