import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringAlgorithmTest {

    @Test
    public void testShortestWord() {
        assertEquals("a", StringAlgorithm.shortestWord("Java is a powerful language"));
    }

    @Test
    public void testShortestWordAtBeginning() {
        assertEquals("I", StringAlgorithm.shortestWord("I love learning Java"));
    }

    @Test
    public void testShortestWordAtEnd() {
        assertEquals("is", StringAlgorithm.shortestWord("Java programming is fun"));
    }

    @Test
    public void testSingleWord() {
        assertEquals("Java", StringAlgorithm.shortestWord("Java"));
    }
}