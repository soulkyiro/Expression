
import org.junit.Assert;
import org.junit.Test;
import parser.Token;
import parser.Token.Operator;
import parser.Token.Value;
public class ParserTest {
    
    @Test
    public void shuttingYardParserTest(){
        Token[] token = {
                new Value("5"),
                new Operator("+"),
                new Value("5")
        };
        assertArrayEquals(10, new Parser().parse(token));
        

    }
}
