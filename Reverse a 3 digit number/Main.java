import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int n1=in.nextInt();
    int i,rev=0,rem;
    for(i=1;i<4;i++)
    {
      rem=n1%10;
      rev=rev*10+rem;
      n1=n1/10;
    }
      System.out.println(rev);
    
    //Type your code here
  }
}