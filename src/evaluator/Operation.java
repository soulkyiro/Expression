package evaluator;

import operation.Operator;

public class Operation implements Expression{

    private final BinaryOperation numbers;
    private final String enumerator;

    public Operation(String enumerator, BinaryOperation numbers) {
        this.numbers = numbers;
        this.enumerator = enumerator;
    }

    @Override
    public Object evaluator() {
        return defineOperation().calculate(numbers);
    }

    private Operator defineOperation() {
        return (Operator) new Factory().builder(enumerator, numbers.getLeft(),numbers.getRigth());
    }

}
