import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int i,j;
      for(i=1;i<=num;i++)
      {
        for(j=1;j<=num;j++)
        {
          if(i==1||i==num)
          {
            System.out.print("*");
          }
          else
          {
            if(j==1||j-num==0)
            System.out.print("*");
            else
              System.out.print(" ");
          }
        }
        System.out.println();
      }
      
	    // Type your code here
	}
}