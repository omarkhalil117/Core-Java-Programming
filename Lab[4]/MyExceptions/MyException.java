public class MyException extends Exception {

    public MyException(String s)
    {
        super(s);
        System.out.println("My custom exception of Arthimetic Exception");
    }
}
