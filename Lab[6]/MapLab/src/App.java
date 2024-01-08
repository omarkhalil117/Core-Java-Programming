import java.util.*;

public class App {

    // define static scanner
    public static Scanner sc = new Scanner(System.in);

    // add line implementation
    public static void addLine(Dictionary d) {

        System.out.println("Enter Line (separated with spaces)");

        // create carrier set
        Set<String> list = new TreeSet<>();

        // read entered Line
        String s = sc.nextLine();

        // split line to get array of separated words
        String[] arr = s.split(" ");

        //
        for (String st : arr) {
            list.add(st);
        }

        // use insert of dictionary
        d.insert(list);
    }

    // add word implementation
    public static void addWord(Dictionary d) {

        System.out.println("Enter Word to add");

        String word = sc.next();

        // use insert word of dictionary
        d.insertWord(word);

        System.out.println("Word added successfully");
    }

    // delete word implementation
    public static void deleteWord(Dictionary d) {

        System.out.println("Enter Word to Delete");

        String word = sc.next();

        // use remove word of dictionary
        d.removeWord(word);

    }

    // delete all words implementation
    public static void deleteAll(Dictionary d) {

        System.out.println("Enter Key to delete all strings");

        char key = sc.nextLine().charAt(0);

        // use remove all words of dictionary
        d.removeAll(key);

    }

    // search implementation
    public static void searchWord(Dictionary d) {

        System.out.println("Enter Word to search for (or pattern)");

        String word = sc.next();

        // use search word of dictionary
        d.search(word);

    }

}
