import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int i,j,count=1;
      for(i=1;i<=num;i++)
      {
        for(j=1;j<=num;j++)
        {
          if(i%2==1)
          {
            if(j-num==0)
             System.out.print(count+1);
            else
            System.out.print(count);
          }
          else if(i%2==0)
          {
            if(j==1)
            {
              System.out.print(count+1);
            }
            else
              System.out.print(count);
          }
        }
        System.out.println();
        count++;
        }
	   // Type your code here
	}
}