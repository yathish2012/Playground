import java.util.Scanner;
class Main
{
  public static int square(int num)
  {
    int result=num*num;
    return result;
  }
	public static void main (String[] args)
    {
	 Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
       System.out.print(square(num1));
      
      // Type your code here   
	} 
}