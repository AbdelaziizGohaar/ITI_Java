//import System.currentTimeMillis;

class Task2
{
	
	
     public static int binarySearch(int arr[], int Target)
    {
     int low = 0, high = arr.length - 1;
     while (low <= high)
    {
        int mid = low + (high - low) / 2;  
      if (arr[mid] == Target)
      {
        return mid;
      }
     if (arr[mid] < Target)
      {    low = mid + 1;
      }else
      {
        high = mid - 1;
      }
     }
        return -1;
    }
	
	
	
	public static void main(String args[] )
    {
     int arr[]={11,21,34,48,52,66,71,88,94,118};
      int targetNum ;  


     long startTime = System.currentTimeMillis() ;
    
     targetNum = binarySearch(arr, 52);

     long endTime = System.currentTimeMillis() ;


     long elapsedTime =  startTime - endTime ;

     if(targetNum == -1)
     {
        System.out.println("Never find the Target Number");
     }else
     {
        System.out.println("time taken to find the target elemt using binary Search is " + elapsedTime);
     }


    
    }
	
	
	
}