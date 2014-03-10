package evaluator;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import operation.Operator;

public class Factory {

    HashMap<String, Object> dictionary;

    public Factory() {
        dictionary = new HashMap<>();

        dictionary.put("addIntegerInteger", new Operator() {

            @Override
            public Object calculate(BinaryOperation numbers) {
                return (int) numbers.getLeft().evaluator() + (int) numbers.getRigth().evaluator();
            }
        });
        dictionary.put("addIntegerDouble", new Operator() {

            @Override
            public Object calculate(BinaryOperation numbers) {
                return (int) numbers.getLeft().evaluator() + (double) numbers.getRigth().evaluator();
            }
        });
        dictionary.put("addDoubleInteger", new Operator() {

            @Override
            public Object calculate(BinaryOperation numbers) {
                return (double) numbers.getLeft().evaluator() + (int) numbers.getRigth().evaluator();
            }
        });
        dictionary.put("addDoubleDouble", new Operator() {

            @Override
            public Object calculate(BinaryOperation numbers) {
                return (double) numbers.getLeft().evaluator() + (double) numbers.getRigth().evaluator();
            }
        });

        dictionary.put("subIntegerInteger", new Operator() {

            @Override
            public Object calculate(BinaryOperation numbers) {
                return (int) numbers.getLeft().evaluator() - (int) numbers.getRigth().evaluator();
            }
        });
        dictionary.put("subIntegerDouble", new Operator() {

            @Override
            public Object calculate(BinaryOperation numbers) {
                return (int) numbers.getLeft().evaluator() - (double) numbers.getRigth().evaluator();
            }
        });
        dictionary.put("subDoubleInteger", new Operator() {

            @Override
            public Object calculate(BinaryOperation numbers) {
                return (double) numbers.getLeft().evaluator() - (int) numbers.getRigth().evaluator();
            }
        });
        dictionary.put("subDoubleDouble", new Operator() {

            @Override
            public Object calculate(BinaryOperation numbers) {
                return (double) numbers.getLeft().evaluator() - (double) numbers.getRigth().evaluator();
            }
        });
    }

    public Object builder(String operator, Object left, Object rigth) {
        try {
            BinaryOperation numbers = new BinaryOperation((Expression) left, (Expression) rigth);
            try {
                Operator op = (Operator) Class.forName("operator." + operator + getNameType(numbers.getLeft().evaluator()) + getNameType(numbers.getRigth().evaluator())).newInstance();
                return op.calculate(numbers);//dictionary.get(operator + getNameType(numbers.getLeft().evaluator()) + getNameType(numbers.getRigth().evaluator()));
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (InstantiationException | IllegalAccessException ex) {
            Logger.getLogger(Factory.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    private String getNameType(Object number) {
        return number.getClass().getSimpleName();
    }

}
