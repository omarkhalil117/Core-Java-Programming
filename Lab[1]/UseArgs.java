class UseArgs
{

public static void main(String args[])
{
     System.out.println("Hello World");
     try
     {
      if (Integer.parseInt(args[0]) > 0 )
     {
           System.out.println("Positive");
     }
	   
      else
     {
           System.out.println("Negative");
     }
     
     int iterations = Integer.parseInt(args[0]);

     for(int i=0 ; i< iterations ; i++)
     {
        System.out.println(args[1]);
     }
     
     }
     catch(Exception e)
     {
        System.out.println("Please enter valid number");
     }
     

}


}
