package parser;

import evaluator.Addition;
import evaluator.BinaryOperation;
import evaluator.Constant;
import java.util.Stack;
import parser.Token.Operator;
import parser.Token.Value;

public class Parser {

    private Stack operatorStack;
    private Stack outputStack;

    public Parser() {
        operatorStack = new Stack();
        outputStack = new Stack();
    }

    public BinaryOperation parse(Token[] token) {
        for (Token t : token) {
            if (isOperator(t)) {
                operatorStack.push(t);
            }
            if (isNumber(t)) {
                outputStack.push(t);
            }
        }
        outputStack.push(operatorStack.pop());
        Operator o = (Operator) outputStack.pop();
        Value left = (Value) outputStack.pop();
        Value right = (Value) outputStack.pop();
        if( o.getOperator().equals("+")){
            return new Addition(new Constant(left.getValue()),new Constant(right.getValue()));
        }
        return null;
    }

    public boolean isOperator(Token t) {
        String s = t.getClass().getSimpleName();
        if (t instanceof Operator) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isNumber(Token t) {
        String s = t.getClass().getSimpleName();
        if (t instanceof Value) {
            return true;
        } else {
            return false;
        }
    }

    public void isTockenFuntion() {

    }

}
