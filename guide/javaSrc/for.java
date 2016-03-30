public class ForExample
{
  public static void main(String[] args) {
    for(int number = 0; number < 10; number = number + 1)
    {
      if(number % 2 == 0) // % is the mod operator and returns the remainder of a division
        {
          System.out.println(number);
        }
        else
        {
          System.out.println(number * 2);
        }
    }
  }
}
