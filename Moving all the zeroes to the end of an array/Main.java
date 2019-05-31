import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
        int num=in.nextInt();
      int arr[]=new int[num];
      int i,j,a,b,count=0;
      int count1=0;
      int arr1[]=new int[num];
      for(i=0;i<num;i++)
        arr[i]=in.nextInt();
        for(j=0;j<num;j++)
        {
          if(arr[j]==0)
          { 
            count1++;
          }
          else
           {  arr1[count]=arr[j];
             count++;
           }
        }
      for(i=count;i<num;i++)
        arr1[i]=0;
      for(i=0;i<num;i++)
        System.out.print(arr1[i]+" ");
      
       // Type your code here
    }
}