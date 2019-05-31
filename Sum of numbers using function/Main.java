import java.util.Scanner;
class Main{
  public static int sum(int num) 
  {
    int i,total=0;
    for(i=1;i<=num;i++)
      total=total+i;
    return total;
  }
	public static void main (String[] args)
    {
	Scanner in=new Scanner(System.in);
      int num1=in.nextInt();
      System.out.print(sum(num1));
   
      // Type your code here
      
	}
}