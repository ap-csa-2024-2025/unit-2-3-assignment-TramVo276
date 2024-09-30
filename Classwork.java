public class Classwork
{
  public static void main(String[] args)
{
  System.out.print(firstLastN("dictionary", 1));
}
    public static String firstLastN(String word, int n)
    {
      //word = dictionary
      //n = 3
      // dicary 
      String output = new String(); //makes blank String
      String firstN = word.substring(0, n); //substring from 0 to n-1
      int indexOfNthToLast = word.length() - n;
      String lastN = word.substring(indexOfNthToLast); //strart at nth to last letter, and goes to the end

      output = firstN + lastN;
      return output;
    }

  }

  

  public static void main(String[]args)
  {
    System.out.println("library");
  }
  public static String delEnd(String s, int n)
  {
    int stoppingIndex = s.length() - n;
    String output = s.substring(0, stoppingIndex);   //substring(start);
    return output;
  }


    
public static String compareLower(String s, int n)
{
  String first = "Sterling";
  System.out.println(frist.compareTo("material"));
}