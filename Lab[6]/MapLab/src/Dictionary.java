import java.util.*;
import java.util.regex.Pattern;

public class Dictionary {

    public Map<Character, Set<String>> dict = new HashMap<>();

    public void printDict() {
        if (dict.size() == 0) {
            System.out.println("Empty Dictionary");
        } else {
            dict.forEach((key, value) -> System.out.println(key + ":" + value));
        }
    }

    public void getWords(char k) {
        System.out.println(dict.get(k));
    }

    public void insertWord(String word) {
        char firstChar = word.toLowerCase().charAt(0);

        if (dict.containsKey(firstChar)) {
            Set<String> newVal = dict.get(firstChar);
            newVal.add(word);
            dict.put(firstChar, newVal);
        } else {
            Set<String> values = new TreeSet<>();
            values.add(word);
            dict.put(firstChar, values);
        }
    }

    public void insert(Set<String> InputList) {
        for (String s : InputList) {
            insertWord(s);
        }
    }

    public void removeWord(String word) {

        char firstChar = word.toLowerCase().charAt(0);

        if (dict.containsKey(firstChar)) {
            Set<String> vals = dict.get(firstChar);
            if (!vals.remove(word)) {
                System.out.println("Word not found");
            } else {
                System.out.println("Removed successfully");
            }
        }

        else {
            System.out.println("Word Not found");
        }

    }

    public void removeAll(Character ch) {

        if (dict.containsKey(ch)) {
            Set<String> vals = dict.get(ch);
            vals.removeAll(vals);
            dict.put(ch, vals);
            System.out.println("Values if charachter removed successfully");
        }

        else {
            System.out.println("Charachter not in the map");
        }
    }

    // Search for pattern
    public void search(String pattern) {
        char firstChar = pattern.toLowerCase().charAt(0);
        Pattern p = Pattern.compile(".*\\Q" + pattern + "\\E.*");
        Set<String> vals = dict.get(firstChar);

        if (vals == null) {
            System.out.println("Empty");
        }

        for (String s : vals) {
            if (p.matcher(s).matches()) {
                System.out.println(s);
            }
        }
    }

}
