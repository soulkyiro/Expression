package parser;

import evaluator.Factory;
import evaluator.operation.Operator;
import java.util.HashMap;
import java.util.Stack;
import parser.Token.Value;

public class MyParser {

    private Stack operatorStack;
    private Stack outputStack;
    HashMap<String,String> operationDictionary;

    public MyParser() {
        operatorStack = new Stack();
        outputStack = new Stack();
        operationDictionary = new OperationDictionary();
    }

    public Object parse(Token[] tokens) {
        Stack<Token> initialStack = new Stack();
        Value total = null;
        fillStacks(tokens);
        
        initialStack = inverseStack(outputStack);
        
        while(!initialStack.isEmpty()){
            Token token = initialStack.pop();
            if(!isOperator(token))
                operatorStack.push(token);
            else{
                Token.Operator o = (Token.Operator) token;
                Value left = (Value)operatorStack.pop();
                Value rigth = (Value)operatorStack.pop();
                Operator operator = new Factory().builder(operationDictionary.get(o.getOperator()), left.getValue(), rigth.getValue());
                operatorStack.push(new Value(operator.evaluator(left.getValue(), rigth.getValue())));
            }  
        }
        Value e = (Value)operatorStack.pop();
        return e.getValue();
    }

    private void fillStacks(Token[] token) {
        for (Token t : token) {
            if (isOperator(t)) {
                operatorStack.push(t);
            }else{
                outputStack.push(t);
            }
        }
        while(!operatorStack.isEmpty()){
            outputStack.push(operatorStack.pop());
        }
    }

    private Stack inverseStack(Stack stack) {
        Stack newStack = new Stack();
        
        while(!stack.isEmpty()){
            newStack.push(stack.pop());
        }
        return newStack;
    }

    private boolean isOperator(Token t) {
        return t instanceof Token.Operator;
    }

    private boolean isNumber(Token t) {
        return t instanceof Value;
    }
}

