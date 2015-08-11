import java.io.Console;
import java.util.HashMap;

public class ScrabbleScore{
    public static void main (String[] args) {}

    public Integer testMethod(String userInput) {
        char[] userInputArray = userInput.toCharArray();

        Integer userInputLength = userInputArray.length;

        HashMap<Character, Integer> letterMap = new HashMap<Character, Integer>();
        letterMap.put('a', 1);
        letterMap.put('e', 1);
        letterMap.put('i', 1);
        letterMap.put('o', 1);
        letterMap.put('u', 1);
        letterMap.put('l', 1);
        letterMap.put('n', 1);
        letterMap.put('r', 1);
        letterMap.put('t', 1);
        letterMap.put('d', 2);
        letterMap.put('g', 2);
        letterMap.put('b', 3);
        letterMap.put('c', 3);
        letterMap.put('m', 3);
        letterMap.put('p', 3);
        letterMap.put('f', 4);
        letterMap.put('h', 4);
        letterMap.put('v', 4);
        letterMap.put('w', 4);
        letterMap.put('y', 4);
        letterMap.put('k', 5);
        letterMap.put('j', 8);
        letterMap.put('x', 8);
        letterMap.put('q', 10);
        letterMap.put('z', 10);

        Integer sum = 0;
    for (int i= 0; i < userInputLength; i++){

         Integer letterValue = letterMap.get(userInputArray[i]);
         sum = sum + letterValue;
    }
    return sum;
    }
}
