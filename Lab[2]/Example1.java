import java.util.Arrays;
import java.util.Random;
class Example1 
{
    // search function 
    public static boolean binarySearch(int arr[] , int size , int target)
    {
        
        int start = 0;
        int end = size-1;
        

        while (start <= end ) 
        {  
           int mid = (start+end) / 2;
           if (arr[mid] == target)   
           {
              return true;
           }
             if (target > arr[mid])
             {
                start = mid+1;
             }
             else
             {
                end = mid-1;
             }
        }

       return false;
    }
 

    public static void main (String []args)
   {
     // Min , Max start
     double searchTime1 = System.currentTimeMillis();
     Random rand = new Random();
    
    
     int arr[] = new int[1000];
     
     // fill array with randInt numbers
     for (int i=0 ; i<1000 ; i++)
     {
        arr[i] = rand.nextInt(1000); 
     }
    
     // print filled array
    for (int i=0 ; i<1000 ; i++)
     {
        System.out.print(arr[i] + " "); 
     }

     System.out.println("");
     // initializa min , max with MAX , MIN value
     int min = Integer.MAX_VALUE;
     int max = Integer.MIN_VALUE;

     for (int i=0 ; i<100; i++)
     {
        if(arr[i] < min)
        {
            min = arr[i];
        }
        
        if(arr[i] > max)
        {
            max = arr[i];
        }
     }
     
     // Min,Max end time 
     double searchTime2 = System.currentTimeMillis();

     // print resulting min , max 
     System.out.println("Min ="+ min);
     System.out.println("Max ="+ max);
     
     // Time taken to get min and max number
     System.out.println("Time 1 =" + (double)(searchTime2 - searchTime1));

    // Search Start time 
     double searchTime3 = System.currentTimeMillis();

     //sort using quick sort
     Arrays.sort(arr);

     // Search inside the array
     boolean res = binarySearch(arr, 1000, max);
     
     if(res)
     {
        System.out.println("Found :D");
     }
     else
     {
        System.out.println("Not found :(");
     }
 
     // Search end time
     double searchTime4 = System.currentTimeMillis();
     
     // Total time for search
     System.out.println("Time 2 = "+(double)(searchTime4 - searchTime3));
     
     System.out.println("");

     for (int i=0 ; i<100 ; i++)
     {
        System.out.print(arr[i] + " "); 
     }
    }
}


