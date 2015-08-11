import org.junit.*;
import static org.junit.Assert.*;
import java.util.HashMap;

public class ScrabbleScoreTest{
    @Test
    public void ScrabbleScore_returnAScrabbleScoreForALetter_1() {
    ScrabbleScore ScrabbleScoreTest = new ScrabbleScore();
    Integer score = 1;
    assertEquals(score, ScrabbleScoreTest.testMethod("a"));

    }

    @Test
    public void ScrabbleScore_returnScoreForAString_Interger() {
    ScrabbleScore ScrabbleScoreTest = new ScrabbleScore();
    Integer score = 4;
    assertEquals(score, ScrabbleScoreTest.testMethod("and"));
    }

}
