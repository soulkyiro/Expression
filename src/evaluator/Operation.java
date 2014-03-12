package evaluator;

import evaluator.operation.Operator;

public class Operation implements Expression{

    private final BinaryOperation numbers;
    private final String enumerator;

    public Operation(String enumerator, BinaryOperation numbers) {
        this.numbers = numbers;
        this.enumerator = enumerator;
    }

    @Override
    public Object evaluator() {
        return defineOperation().evaluator(numbers.getLeft(),numbers.getRight());
    }

    private Operator defineOperation() {
        return new Factory().builder(enumerator, numbers.getLeft(),numbers.getRight());
    }

}
