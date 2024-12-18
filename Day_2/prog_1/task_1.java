// import System.currentTimeMillis;
import java.util.Random; 
import java.lang.System; 

class Task1
{
	
  public static int[] populateArray() {
    int[] array = new int[100];
    Random random = new Random();
    
    for (int i = 0; i < array.length; i++) {
        array[i] = random.nextInt(100) + 1; // Random number between 1 and 100
    }
    array[70] = 7;
    return array;
}

 
  public static int LineraSearch(int arr[], int Target)
    {     
      for(int i = 0 ; i< arr.length ; i++)
      {
        if(arr[i] == Target )
        {
          return arr[i];
        }
      }
      return -1 ;      
    }
	
	
	
	public static void main(String [] args )
    {
      int[] arr = populateArray();

       long startTime = System.currentTimeMillis();

       System.out.println("startTime is "+startTime);
     
   	   int index = Task1.LineraSearch(arr, 7);
    
       

       // Task2 t = new Task2();
       // Task2.binarySearch(arr,7);

       long endTime = System.currentTimeMillis();

        System.out.println("endTime is "+endTime);
   
       long elapsedTime = endTime - startTime;

       if(index != -1 )
       {
        System.out.println("the time taken to compute the task is " + elapsedTime);
       }else
       {
        System.out.println(" no data Found  ");
       }


    }
	
	
	
}