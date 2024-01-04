public class Main {
    public static void main(String[] args) {
        try{
            // create object
            MyClass c = new MyClass();

            // divison 
            System.out.println(c.division(5,1));

            // Squareroot 
            System.out.println(c.squareRoot(4));

            // difference
            System.out.println(c.difference(1,5));

        }
        catch(MyException e)
        {
            // print exception message
           System.out.println(e.toString());
        }
        finally
        {
            System.out.println("Finally !!");
        }
    }
}
