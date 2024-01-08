import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Dictionary myDict = new Dictionary();
        Set<String> myList = new LinkedHashSet<>(Arrays.asList("ali", "aya", "apple", "pinapple"));
        myDict.insert(myList);
        boolean flag = true;
        while (flag) {
            try {
                // print Menue
                System.out.println("Choose What you want to do :");
                System.out.println("1 - Print Map");
                System.out.println("2 - Insert Word");
                System.out.println("3 - Insert multiple words");
                System.out.println("4 - remove word");
                System.out.println("5 - remove all words for certain key");
                System.out.println("6 - search for word (regex)");
                System.out.println("7 - Exit");

                // Take choice
                int choice;
                Scanner Input = new Scanner(System.in);
                choice = Input.nextInt();

                switch (choice) {
                    case 1:
                        myDict.printDict();
                        break;
                    case 2:
                        App.addWord(myDict);
                        break;
                    case 3:
                        App.addLine(myDict);
                        break;
                    case 4:
                        App.deleteWord(myDict);
                        break;
                    case 5:
                        App.deleteAll(myDict);
                        break;
                    case 6:
                        App.searchWord(myDict);
                        break;
                    case 7:
                        flag = false;
                        Input.close();
                        App.sc.close();
                        break;

                    default:
                        System.out.println("Wrong Input");
                        break;

                }

            } catch (Exception e) {
                System.out.println("Exception Happened " + e.getStackTrace());
            }

        }
    }
}
