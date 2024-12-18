import java.util.StringTokenizer;


class Task3
{

    public static int countITI_2(String str, String target)
    {
     int count = 0 ;
        
      String regex = "[\\s]";
      String[] myArray = str.split(regex);
      for (String s : myArray) {
	 //   if(s == target)
        if(s.equals(target) )
        {
          count ++ ; 
        }
      }
        return count ;
    }

    public static int countReplace(String str, String target) {
        int originalLength = str.length();
        int replacedLength = str.replace(target, "").length();
        return (originalLength - replacedLength) / target.length();
    }

    public static int countIndex(String str, String target) {
        int count = 0;
        int index = 0;
    
        while ((index = str.indexOf(target, index)) != -1) {
            count++;
            index += target.length(); 
        }
    
        return count;
    }
    

    public static int tOccurrence(String s, String sub) {
        s = s.toLowerCase(); 
        sub = sub.toLowerCase();
        StringTokenizer T = new StringTokenizer(s, sub);
        return T.countTokens() ; 
    }

public static void main(String args[])
{
    String str = "ITI develops people and ITI house of developers and ITI for people";


  //////////////////////////////////////////////////////////////////////////  
    int count = countITI_2(str, "ITI");
    System.out.println(" using the split Repeating  of 'ITI': " + count);
 ///////////////////////////////////////////////////////////////////////////////////

 int count_2 = countReplace(str, "ITI");
 System.out.println("Using Replace repeating of 'ITI': " + count_2);
  ////////////////////////////////////////////////////////////////////////////////////
  
  int count_3 = countIndex(str, "ITI");
  System.out.println("Using of Index  of 'ITI': " + count_3);  

  //////////////////////////////////////////////////////////////
 // StringTokenizer str2 = "ITI develops people and ITI house of developers and ITI for people";
  int count_0 = tOccurrence(str,"ITI");
  System.out.println(" using the Tring Tokenizer of 'ITI': " + count_0);

   

}





}