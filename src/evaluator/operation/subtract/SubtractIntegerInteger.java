package evaluator.operation.subtract;

import evaluator.operation.Operator;

public class SubtractIntegerInteger implements Operator {

    @Override
    public Object evaluator(Object left, Object right) {
        return (int) left - (int) right;    
    }
}
