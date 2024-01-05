import java.util.function.BiPredicate;

public class App {

    // Ex 1
    public static String betterStr(String s1, String s2, BiPredicate<String, String> b) {
        // apply test method of the BiPredicate functional interface
        // with the incoming argument that is passed as third parametar
        if (b.test(s1, s2)) {

            // if true return string s1
            return s1;
        }

        // else return string s2
        return s2;
    }

    // Ex 2
    public static boolean allCh(String s) throws TypeNotPresentException {

        if (!(s instanceof String)) {
            throw new TypeNotPresentException("Type Error", null);
        }
        // check if the string is empty
        if (s.length() == 0) {
            return false;
        }
        // store the char array in arr
        char arr[] = s.toCharArray();

        // loop and check isLetter on every charachter
        for (int i = 0; i < arr.length; i++) {

            // if charachter is not letter
            if (!Character.isLetter(arr[i])) {
                return false;
            }

        }

        // if all chars are letters
        return true;
    }

    public static void main(String[] args) throws Exception {
        try {

            // set string s1 , s2 with values
            String s1 = "Ahmed";
            String s2 = "Ali";

            // get the output of betterStr method
            String result = App.betterStr(s1, s2, (x, y) -> x.length() > y.length());

            // print Result
            System.out.println(result);

            // Test allCh mehtod
            if (allCh("Hello @ My Page")) {
                System.out.println("True");
            }

            else {
                System.out.println("False");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
