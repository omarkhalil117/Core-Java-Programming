public class Main {
    public static void main(String[] args) {
        try{
            MyClass c = new MyClass();
            c.division();
        }
        catch(MyException e)
        {
           System.out.println(e.toString);
        }
        finally
        {
            System.out.println("Finally !!");
        }
    }
}
