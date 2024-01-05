import java.util.function.Supplier;

public class TestSupplier {

    // called with Method [3]
    public static String[] body() {
        String[] names = { "Ali", "Mohamed" };
        return names;
    }

    public static void main(String args[]) {

        // Method [1]
        // Supplier<String[]> s = new Supplier<String[]>() {
        // public String[] get() {
        // String[] names = { "Ali", "Mohamed" };
        // return names;
        // }
        // };

        // Method [2]
        // Supplier<String[]> s = () -> {
        // String[] names = { "Ali", "Mohamed" };
        // return names;
        // };

        // Method [3]
        Supplier<String[]> s = TestSupplier::body;

        String[] lis = s.get();
        System.out.println(lis[0] + " " + lis[1]);
    }
}
