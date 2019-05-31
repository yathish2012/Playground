import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int row=in.nextInt();
      int i,j,space,count;
      count=1;
      for(i=1;i<=row;i++)
      { 
        for(space=1;space<=row-i;space++)
        {
          System.out.print(" ");
        }
        for(j=1;j<=i;j++)
        {
          
          System.out.print(count);
          System.out.print(" ");
          count=count+1;
        }
        System.out.println();
      }
    	// Type your code here
    }    
}