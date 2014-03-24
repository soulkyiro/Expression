
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import parser.Token;
import parser.Parser;
import parser.Token.Operator;
import parser.Token.Value;
public class ParserTest {
    
    @Test
    public void shuttingYardParserTest(){
        Token[] token = {
                new Value(5),
                new Operator("+"),
                new Value(5)
        };
        assertEquals(10,(int) new Parser().parse(token).evaluator());
        

    }
}
