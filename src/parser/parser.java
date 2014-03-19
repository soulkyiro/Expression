package parser;

import java.util.Stack;

public class parser {

    private Stack operatorStack;
    private Stack outputStack;

    public parser() {
        operatorStack = new Stack();
        outputStack = new Stack();
    }

    public void parse(Token[] token) {
        for (Token t : token) {
            if (isOperator(t)) {
                operatorStack.add(t);
            }
            if (isNumber(t)) {
                outputStack.add(t);
            }
        }
    }

    public boolean isOperator(Token t) {
        if ("Operator".equals(t.getClass().toString())) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNumber(Token t) {
        if ("Value<>".equals(t.getClass().toString())) {
            return true;
        } else {
            return false;
        }
    }

    public void isTockenFuntion() {

    }

}
