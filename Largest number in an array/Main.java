import java.util.Scanner;
class Main{
  public static int large(int arr[],int num)
  {
    int lar,i;
    lar=arr[0];
    for(i=0;i<num;i++)
      if(lar<arr[i])
        lar=arr[i];
    return lar;
  }
    public static void main(String args[])
    {
       Scanner in=new Scanner(System.in);
      int idx,i;
      idx=in.nextInt();
      int arr[]=new int[idx];
      for(i=0;i<idx;i++)
        arr[i]=in.nextInt();
      System.out.print(large(arr,idx));
      
    }
}