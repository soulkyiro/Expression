package parser;


import java.util.HashMap;

public class OperationDictionary extends HashMap<String,String>{

    public OperationDictionary() {
        put("+", "Addition");
        put("-", "Substract");
        put("*", "Multiply");
    }
    
    
}
