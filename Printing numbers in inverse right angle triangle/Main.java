import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int i,j,count;
      for(i=row;i>0;i--)
      { count=i;
        for(j=1;j<=i;j++)
        {
          System.out.print(count);
          count--;
        }
        System.out.println();
      }
	    // Type your code here
	}
}