import java.util.StringTokenizer;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

class Example2 {
    public static void main (String []args)
    {
        // using string tokenizer
       String sentence = "Hello there the name of the first man who ever landed on the moon is neil" ;
       String target = "the" ;
       StringTokenizer st = new StringTokenizer(sentence);
       int counter1=0;
       int counter2=0;
       int counter3=0;
       int counter4=0;

       int index= sentence.indexOf(target) ;

       while (st.hasMoreTokens()) 
       {
            if (st.nextToken().equals(target))
            {
                counter1++;
            }
       }

       // using split 
       String []words = sentence.split(" ");
       for (int i = 0 ; i < words.length ;  i++ )
       {
         if (words[i].equals(target))
         {
            counter2++;
         }
       }
       
       //using indexOf
       while (index != -1) 
       {
           
           index = sentence.indexOf(target, index +1 + target.length());
           if(index != -1) counter4++;
        }
    
       // using Matcher
       Pattern pattern = Pattern.compile("\\b" + target + "\\b");
       Matcher matcher = pattern.matcher(sentence);
       
       while (matcher.find()) 
       {
           counter3++;
       }

       System.out.println("Using StringTokenizer Counter = " + counter1);
       System.out.println("Using String split method Counter = " + counter2);
       System.out.println("Using Matcher Counter = " + counter3);
       System.out.println("Using IndexOf = " + (counter4));
    }
}

