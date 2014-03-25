package parser;

import evaluator.Factory;
import java.util.HashMap;
import java.util.Stack;
import parser.Token.Operator;
import parser.Token.Value;

public class Parser {

    private Stack operatorStack;
    private Stack outputStack;
    HashMap<String,String> operationDictionary;

    public Parser() {
        operatorStack = new Stack();
        outputStack = new Stack();
        operationDictionary = new OperationDictionary();
    }

    public Object parse(Token[] token) {
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
        
        return new Factory().builder(operationDictionary.get(o.getOperator()),left.getValue(),right.getValue()).evaluator(left.getValue(), right.getValue());
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
}

