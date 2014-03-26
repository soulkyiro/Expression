package evaluator;

import evaluator.operation.Operator;

public abstract class BinaryOperation implements Expression {

    private final Expression left;
    private final Expression rigth;

    public BinaryOperation(Expression left, Expression rigth) {
        this.left = left;
        this.rigth = rigth;
    }

    public Object getLeft() {
        return left.evaluator();
    }

    public Object getRight() {
        return rigth.evaluator();
    }

    private Operator getOperator() {
        return new Factory().builder(this.getClass().getSimpleName(), this.getLeft(), this.getRight());
    }
    
    @Override
    public Object evaluator() {
        return getOperator().evaluator(this.getLeft(),this.getRight());
    }

}
