import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num,count=0,i;
    num=in.nextInt();
    for(i=1;i<=num;i++)
    {
      count++;
      System.out.print(i);
      if(count==3)
      {
        count=0;
        System.out.print(",");
      }
    }
    
   //Type your code here
  }
}