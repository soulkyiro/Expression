package evaluator;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import operation.Operator;

public class Factory {

    HashMap<String, Object> dictionary;

    public Factory() {
    }

    public Object builder(String ope, BinaryOperation numbers) {

            try {
                return (Operator) Class.forName("operation." + ope + getNameType(numbers.getLeft().evaluator()) + getNameType(numbers.getRigth().evaluator())).newInstance();
            } catch (ClassNotFoundException | InstantiationException | IllegalAccessException ex) {
                Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
            }
        return null;
    }
    

    private String getNameType(Object number) {
        return number.getClass().getSimpleName();
    }

}
