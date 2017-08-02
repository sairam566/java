class NumberToWords
{
  // No need to have these in the function. Unless you really care about hiding them... But reflection can still find these
  private static final String[] ONES = {
     "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight",
     "Nine", "Ten", "Eleven", "Twelve", "Thirteen", "Fourteen",
     "Fifteen", "Sixteen", "Seventeen", "Eighteen", "Nineteen",
  };

  private static final String[] TENS = {
      "Ten", "Twenty", "Thirty", "Forty", "Fifty", "Sixty",
      "Seventy", "Eighty", "Ninety", "Hundred"
  };

  public String convertLessThanThousand(int num) {

      String result = "";
      int single, tens, hundreds;

      if(num > 1000)
          return result;

      hundreds = num / 100;
      num %= 100;
      if( num < 20) {
          tens = 0;
      }
      else {
          tens = num / 10;
          num %= 10;
      }
      single = num; // Notice I moved this outside since it is duplicated in both cases

      if(hundreds > 0) {
         result += ones[hundreds-1] + " Hundred ";
      }
      if(tens > 0) {
         result += tens[tens - 1] + " ";
      }
      if(single > 0) {
         result += ones[single - 1] + " ";
      }
      return result;
  }

  public static String convertNumberToText(int num)
  {
      String tempString = "";
      int thousands;
      int temp;
      String result = "";
      if(num < 0 || num > 100000) {
          throw new IllegalArgumentException("" + num + " \tNot Supported");
      }

      if( num == 0) {
         return "" + num + " \tZero";
      }

      if(num < 1000) {  
          result += ConvertLessThanThousand(num);
      }
      else {
          thousands = num / 1000;
          temp = num % 1000;
          tempString = ConvertLessThanThousand(thousands);
          result += tempString + "Thousand ";            
          result += ConvertLessThanThousand(temp);
      }
      return result
  }

  public static void main(String[] args)
  {
      int  i, num;
      int[] arrNum =
      {
        -1, 0, 5, 10, 15, 19, 20, 21, 25, 33, 49, 50, 72,
        99, 100, 101, 117, 199, 200, 214, 517, 589, 999,
        1000, 1010, 1018, 1200, 9890, 10119, 13535, 57019,
        99999, 100000, 100001
      };

      for (i = 0; i < arrNum.length; i++)
      {
          num = arrNum[i];

          try {
             System.out.println(num + "\t" + ConvertNumberToText(num));
          } catch (IllegalArgumentException e) {
              System.out.println(e.message());
          }
      }
  }
}