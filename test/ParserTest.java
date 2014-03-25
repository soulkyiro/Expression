
import static org.junit.Assert.assertEquals;
import org.junit.Test;
import parser.Token;
import parser.MyParser;
import parser.Token.Operator;
import parser.Token.Value;
public class ParserTest {
    
    @Test
    public void additionParserTest(){
        Token[] token = {
                new Value(5),
                new Operator("+"),
                new Value(5)
        };
        assertEquals(10,(int) new MyParser().parse(token));
       
    }
    @Test
    public void substractParserTest(){
        Token[] token = {
                new Value(5),
                new Operator("-"),
                new Value(5)
        };
        assertEquals(0,(int) new MyParser().parse(token));
       
    }
}
