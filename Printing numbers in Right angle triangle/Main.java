import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int  i,j;
      for(i=1;i<=row;i++)
      {
        for(j=1;j<=i;j++)
        {
          System.out.print(i);
        }
        System.out.println();
      }
	    // Type your code here
	}
}