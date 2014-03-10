package operation;

import evaluator.BinaryOperation;

public class addIntegerInteger implements Operator{

    @Override
    public Object calculate(BinaryOperation numbers) {
        return (int) numbers.getLeft().evaluator() + (int) numbers.getRigth().evaluator();
    }
    
}
