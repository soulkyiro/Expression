package evaluator;

public class BinaryOperation {

    private Expression left;
    private Expression rigth;

    public BinaryOperation(Expression left, Expression rigth) {
        this.left = left;
        this.rigth = rigth;
    }

    public Expression getLeft() {
        return left;
    }

    public Expression getRigth() {
        return rigth;
    }

    public void setLeft(Expression left) {
        this.left = left;
    }

    public void setRigth(Expression rigth) {
        this.rigth = rigth;
    }
}
