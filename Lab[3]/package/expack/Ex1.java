package expack;
import java.util.function.*;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class Ex1 {

        
        // Fehrinhait to Clesius
     public   Function<Double,Double> fehToCel =  (Double temp) -> {
            return (double)((temp-32.0)/1.8);
        };
        
        // Clesius to Fehrinhait 
      public  Function<Double,Double> celToFeh =  (Double temp) -> {
            return (double)((temp*1.8)+32);
        };
        

        // solve Quadratic function
      public  Function<List<Integer>,List<Double>> solveQuad =  (List<Integer> params) -> {

            // create List result with its iterator
            List<Double> res = new ArrayList<Double>();
            ListIterator<Integer> paramsIterator = params.listIterator();
             
            int arr[] = {0,0,0};
            int i = 0;
            while(paramsIterator.hasNext())
            {
                arr[i]= paramsIterator.next();
                i++;
            }
             
           
            // if a equla 0
            if (arr[0] == 0)
            {
                System.out.println("Error division by zero");
                return res ;
            }

            // Check if there is negative under square root 
            if ( Math.pow(arr[1],2) - (4*arr[0]*arr[2] ) < 0)
            {
                System.out.println("Error Negative under square root");
                return res ;
            }

            // calculate x1 , x2
            double x1 = (double) ( -arr[1] + (Math.sqrt( Math.pow(arr[1],2) - (4*arr[0]*arr[2] ))) )/(2*arr[0]);
            double x2 = (double) ( -arr[1] - (Math.sqrt( Math.pow(arr[1],2) - (4*arr[0]*arr[2] ) )) )/(2*arr[0]);
            // add x1 , x2 to list
            res.add(x1);
            res.add(x2);
            // return result
            return res;
        };


    }


    
    
