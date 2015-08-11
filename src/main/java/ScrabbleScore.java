import java.io.Console;
import java.util.HashMap;
import static spark.Spark.*;
import spark.template.velocity.VelocityTemplateEngine;
import spark.ModelAndView;


public class ScrabbleScore{
    public static void main (String[] args) {
        //String layout ="templates/index.vtl";
        get("/", (request, response) -> {
            HashMap<String, Object> model = new HashMap<String, Object>();

            return new ModelAndView(model, "templates/index.vtl");

        }, new VelocityTemplateEngine());


        get("/results", (request, response) -> {
            HashMap<String, Object> model = new HashMap<String, Object>();
            String userWord = request.queryParams("scrabbleWord");
            Integer wordScore = wordValue(userWord);

            model.put("scrabbleWord", userWord);
            model.put("wordScore", wordScore);

            return new ModelAndView(model, "templates/results.vtl");
        }, new VelocityTemplateEngine());

    }

    public static Integer wordValue(String userInput) {
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
    System.out.println("Here is your Scrabble Score " + sum + ".");

    return sum;

    }
}
