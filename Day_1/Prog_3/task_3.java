

class Task3 
{

  public static boolean check_Is_Integer(String checkedInt )
    {
	  try
	  {
         Integer.parseInt(checkedInt) ;
         return true ;		 
	  }catch(Exception e )
	  {
		 System.out.println("Error where first element in array must be an Integer "); 
	     return false ;
	  }	  
    }


  public static boolean check_negative(String checkedInt )
    {
     int newInt = Integer.parseInt(checkedInt); 
	  
     if (newInt < 0)
	 {
		 return false ;
	 }else
	{
		 return true ;
	}	  
	  
    }



public static void main(String args[]) 
{
		
if (args.length == 0)
{
	System.out.println("No Data In array ");
	return ;
} 
 if ( args.length >2)
	{
	  	System.out.println(" exceded length");	  
	return;	
	} if (   !check_Is_Integer(args[0] ) )
	{
	  	System.out.println("Datatype of first element must be integer ");	   
	} else if (args.length < 2)
	{
		  	System.out.println("Array must have only 2 data number and String  to print  ");	  	
	} else if ( !check_negative(args[0] ))
	{
				  	System.out.println("Array must have be postive ");	  
	} 	

	
   else
   {
	   int loopRounds = Integer.parseInt(args[0]);
       String nameLooped = args[1];
 
     for(int i = 0 ; i < loopRounds ; i++)
     {
	   System.out.println(nameLooped);	   
     }
	   
	   
   }
   


}


};













