import java.util.Scanner;
class Main
{
 
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int i;
    int list[]=new int[num];
    for(i=0;i<num;i++)
      list[i]=in.nextInt();
     int j,lop,sum=0,sum1=0,count=0,flag=1;
    lop=num/3;
    for(i=1;i<=1;i++)
    {
      for(j=1;j<=3;j++)
      {
        sum=sum+list[count];
        count++;
      }
    }
    for(i=1;i<lop;i++)
    {
      for(j=1;j<=3;j++)
      {
        sum1=sum1+list[count];
        count++;
      }
      if(sum==sum1)
      {
        flag=1;
      }
      else
        flag=0;
      sum1=0;
    }
    if(flag==1)
    {
      System.out.print("Perfect Batch");
    }
    else
      System.out.print("Not a Perfect Batch");
  
    //Try your code here
  }
}