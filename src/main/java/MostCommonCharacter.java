import java.util.*;

public class MostCommonCharacter {
    /**
     * Find the most common character in str.
     * You could use a HashMap that maps a Character key to an Int value to represent how many times a Character has
     * been spotted.
     * @param str A String.
     * @return the most common character within str.
     */
    public char recurringChar(String str) {
        Map<Character, Integer> counter = new HashMap<>();
        for(int j=0; j<str.length(); j++) {
            if(!counter.containsKey(str.charAt(j))) {
                counter.put(str.charAt(j), 1);
            } else {
                counter.replace(str.charAt(j), counter.get(str.charAt(j))+1);
            }
        }
        int maxOccur = 0;
        char max = ' ';
        for(Map.Entry<Character, Integer> entry : counter.entrySet()) {
            if(entry.getValue()>maxOccur) {
                max = entry.getKey();
            }
        }
        return max;
    }
}
