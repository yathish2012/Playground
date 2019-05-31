import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int arr[]=new int[num];
      int i,j;
      for(i=0;i<num;i++)
        arr[i]=in.nextInt();
      int count=0;
      for(i=0;i<num-1;i++)
      { 
        for(j=i+1;j<num;j++)
        {
          for(int k=j+1;k<num;k++)
           System.out.printf("(%d, %d, %d) ",arr[i],arr[j],arr[k]);
        }
        System.out.println();
      }
       // Type your code here
    }
}