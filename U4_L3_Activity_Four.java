import java.util.Scanner;

public class U4_L3_Activity_Four
{
  public static void main(String[] args)
  {
    
    Scanner kb = new Scanner(System.in);
    System.out.println("Enter a positive integer");
    int input = kb.nextInt();
    
    if(input < 0) {
      System.out.println("error");
    }
    if(input != 0) {
    for(int increment = input; increment >= 0; increment--) {
      if (increment%3 == 0) {
        System.out.print(increment + " ");
      }
    }
    }
    
  }
}
