import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int i,j,k;
      for(i=1;i<=row;i++)
      { 
        for(k=1;k<=row-i;k++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=(2*i)-1;j++)
        {
          System.out.print("*");
        }
        System.out.println();
      }
      
	    // Type your code here
	}
}