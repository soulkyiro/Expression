package evaluator;

public class Constant<Type> implements Expression {

    private final Type constant;

    public Constant(Type constant) {
        this.constant = constant;
    }
    
    @Override
    public Object evaluator() {
        return constant;
    }
}
