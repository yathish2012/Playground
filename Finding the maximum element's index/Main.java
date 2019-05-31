import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in=new Scanner(System.in);
    int num=in.nextInt();
    int arr[]=new int[num];
    int i,index=0,lar;
    for(i=0;i<num;i++)
      arr[i]=in.nextInt();
    lar=arr[0];
    for(i=0;i<num;i++)
    {
      if(lar<arr[i])
      {  lar=arr[i];
         index=i;
      }
  }
         System.out.print(index);   
  }
}