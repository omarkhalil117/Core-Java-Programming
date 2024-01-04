public class MyClass  {

    public double division(int a , int b) throws MyException
    {   
        // throw exception on division by zero
        if(b == 0)
        {
            throw new MyException("Division by zero");
        }

        return a/b ;

    }

    public double squareRoot(double num) throws MyException
    {
        // throw exception on negative number
        if (num < 0)
        {
            throw new MyException("Square root Exception");
        }

        return Math.sqrt(num);
    }


    public double difference(double x , double y ) throws MyException
    {
        // throw exception on negative result
        if ( (x-y) < 0)
        {
            throw new MyException("Difference Exception");
        }

        return x-y ;
    }
}
