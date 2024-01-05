import java.lang.reflect.Method;

public class App {

    @Author(str = "Hello", val = 5)
    public static void AnnotatedMethod() {
        App a = new App();
        Class<?> c = a.getClass();
        Method m;
        try {
            m = c.getMethod("AnnotatedMethod");
            Author anno = m.getAnnotation(Author.class);
            System.out.println(anno.str() + " " + anno.val());

        } catch (NoSuchMethodException e) {

            e.printStackTrace();
        } catch (SecurityException e) {

            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws Exception {
        AnnotatedMethod();
    }
}
