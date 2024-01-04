class Bonus 
{

   public static void main (String args[])
   {
      String s = args[0];
      int start = 0;
      int end = s.length()-1;
      int flag = 0;
      while(start < end)
      {
          if(s.charAt(start) != s.charAt(end))
	  {
		  System.out.println("Not palindrom");
		  flag=1;
		  break;
	  }
	  
	  start++;
	  end--;
	  
	 
      }

      if (flag==0)
      {
	      System.out.println("Palindrom");
      }

   }


}
