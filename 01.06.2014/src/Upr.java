import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by ддд on 13.4.2016 г..
 */
public class Upr {
    public static void main(String[] args) {
        HashMap<String, ArrayList<Integer>> grades = new HashMap<>();
        grades.put("Peter", new ArrayList<>(Arrays.asList(5)));
        grades.put("George", new ArrayList<>(Arrays.asList(5, 5, 6)));
        grades.put("Maria", new ArrayList<>(Arrays.asList(5, 4, 4)));
        grades.get("Peter").add(6);
        grades.get("George").add(6);

        for (String key : grades.keySet()) {
        System.out.println("" + key + " -> " + grades.get(key));
        }

//            String[] words = {
//            "yes", "hi", "hello", "hi", "welcome", "yes", "yes",
//            "welcome", "hi", "yes", "hello", "yes"
//            };

//            Map<String, Integer> wordsCount = new HashMap<String, Integer>();
//            for (String word : words) {
//            Integer count = wordsCount.get(word);
//                if (count == null) {
//                count = 0;
//                }
//                wordsCount.put(word, count+1);
//            }
//
//            System.out.println(wordsCount);

//            for (String word : wordsCount.keySet()) {
//            int count = wordsCount.get(word);
//            System.out.printf("%s -> %d times\n", word, count);
//            }

    }
}
