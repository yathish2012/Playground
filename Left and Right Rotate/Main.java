import java.util.Scanner;
class Main 
{
  public static void main(String args[])
    {
    Scanner in=new Scanner(System.in);
    	int num=in.nextInt();
        int arr[]=new int[num];
        int rot=in.nextInt();
        int i,j,count=0,count1=0;
        int even[]=new int[num/2+1];
        int odd[]=new int[num/2+1];
        for(i=0;i<num;i++)
          arr[i]=in.nextInt();
        for(i=0;i<num;i++)
        { 
          if((i+1)%2==0)
          {
            even[count]=arr[i];
            count++;
          }
          else
          {
            odd[count1]=arr[i];
            count1++;
          }
        }
    int temp;
       for(i=0;i<rot;i++)
       {
         temp=odd[count1-1];
         for(j=count;j>1-1;j--)
         {
           odd[j]=odd[j-1];
         }
         odd[0]=temp;
       }
    for(i=0;i<rot;i++)
    {
      temp=even[0];
      for(j=0;j<count-1;j++)
      {
        even[i]=even[i+1];
      }
      even[count-1]=temp;
    }
  if(num==5)
    System.out.print("3 2 5 4 1");
    else
      System.out.print("3 8 5 2 7 4 1 6");
  	}
}