public class Classwork
{
  public static void main(String[] args)
  {
    public static String firstLastN(String word, int n)
    {
      //word = dictionary
      //n = 3
      // dicary 
      String output = new String00(); //makes blank String
      String firstN = word.substring(0, n); //substring from 0 to n-1
      int indexOfNthToLast = word.length() - n;
      String lastN = word.substring(indexOfNthToLast); //strart at nth to last letter, and goes to the end

      output = firstN + lastN;
      return output;
    }


  }
}
