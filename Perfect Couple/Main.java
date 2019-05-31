import java.util.Scanner;
class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int arr[]=new int[num];
      for(int i=0;i<num;i++)
        arr[i]=in.nextInt();
      int key=in.nextInt();
      int i,j,count=0;
      for(i=0;i<num;i++)
      {
        for(j=0;j<num;j++)
        {
          if(arr[i]+arr[j]==key)
          { count++;
            System.out.printf("%d, %d ",arr[i],arr[j]);
            System.out.println();
           if (count==2)
           { i=num;break;}
          }
        }
    }
}
}