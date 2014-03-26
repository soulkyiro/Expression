package parser;

import evaluator.Factory;
import evaluator.operation.Operator;
import java.util.HashMap;
import java.util.Stack;
import parser.Token.Value;

public class MyParser {

    private Stack<Token> operatorStack;
    private Stack<Token> outputStack;
    private Stack<Token> inputStack;
    HashMap<String, String> operationDictionary;

    public MyParser() {
        operatorStack = new Stack();
        outputStack = new Stack();
        inputStack = new Stack();
        operationDictionary = new OperationDictionary();
    }

    public Object parse(Token[] tokens) {
        fillStacks(tokens);
        inputStack = inverseStack(outputStack);
        outputStack.clear();

        while (!inputStack.isEmpty()) {
            Token token = inputStack.pop();
            ShuntingYard(token);
        }
        Value e = (Value) outputStack.pop();
        return e.getValue();
    }

    private void ShuntingYard(Token token) {
        if (!isOperator(token)) {
            outputStack.push(token);
        } else {
            Value left = (Value) outputStack.pop();
            Value rigth = (Value) outputStack.pop();
            Operator operator = getOperator((Token.Operator) token, left, rigth);
            outputStack.push(new Value(operator.evaluator(left.getValue(), rigth.getValue())));
        }
    }

    private Operator getOperator(Token.Operator o, Value left, Value rigth) {
        return new Factory().builder(operationDictionary.get(o.getOperator()), left.getValue(), rigth.getValue());
    }

    private void fillStacks(Token[] token) {
        for (Token t : token) {
            setTokenStack(t);
        }
        EmptyOperatorsStackInOutputStack();
    }

    private void EmptyOperatorsStackInOutputStack() {
        while (!operatorStack.isEmpty()) {
            outputStack.push(operatorStack.pop());
        }
    }

    private void setTokenStack(Token t) {
        if (isOperator(t)) {
            operatorStack.push(t);
        } else {
            outputStack.push(t);
        }
    }

    private Stack inverseStack(Stack stack) {
        Stack newStack = new Stack();

        while (!stack.isEmpty()) {
            newStack.push(stack.pop());
        }

        return newStack;
    }

    private boolean isOperator(Token t) {
        return t instanceof Token.Operator;
    }
}
