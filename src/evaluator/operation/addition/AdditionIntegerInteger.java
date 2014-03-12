package evaluator.operation.addition;

import evaluator.operation.Operator;

public class AdditionIntegerInteger implements Operator{

    @Override
    public Object evaluator(Object left, Object right) {
        return (int) left + (int) right;
    }
    
}
