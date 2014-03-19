package parser;

public class Token{
    
    public static class Operator extends Token{
        private String symbol;

        public Operator(String symbol) {
            this.symbol = symbol;
        }
    }
    
    public static class Value <Type> extends Token{
        private Type symbol;

        public Value(Type symbol) {
            this.symbol = symbol;
        }
    }
}
