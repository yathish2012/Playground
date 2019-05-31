import java.lang.Math;
import java.util.Scanner;
class Main
{
  public static double power(int num1,int num2)
  {
    double result;
    result=Math.pow(num1,num2);
    return result;
  }
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int base=in.nextInt();
    int exponent=in.nextInt();
    System.out.print(power(base,exponent));
  }
  }