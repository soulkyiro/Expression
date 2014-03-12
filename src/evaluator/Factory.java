package evaluator;

import evaluator.operation.Operator;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Factory {

    public Operator builder(String operation, Object left, Object rigth) {
        try {
            return (Operator) getClass(operation,left,rigth).newInstance();
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    private Class<?> getClass(String operation, Object left, Object right) throws ClassNotFoundException {
        return Class.forName(getPackage(operation) + getSignature(operation, left, right));
    }
    
    private String getPackage(String operation) {
        return "evaluator.operation." + operation.toLowerCase() + ".";
    }

    private String getSignature(String operation, Object left, Object right) {
        return  operation + left.getClass().getSimpleName() + right.getClass().getSimpleName();
    }
}
