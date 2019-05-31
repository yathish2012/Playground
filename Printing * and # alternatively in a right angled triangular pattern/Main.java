import java.util.Scanner;
class Main { 
	public static void main(String[] args){
  		Scanner in = new Scanner(System.in);
       int row=in.nextInt();
      int i,j,count=0;
      for(i=1;i<=row;i++)
      { 
        count++;
        for(j=1;j<=i;j++)
        {
          if(count==1)
          System.out.print("*");
          if(count>1&&count<=3)
           {
            if(j%2==0)
            {
              System.out.print("*");
            }
          else
            System.out.print("#");
            }
          if(count>3&&count<6)
          {
           if(j%2==0)
          {
            System.out.print("#");
          }
          else
            System.out.print("*");
        }
          if(count==6)
           {
            if(j%2==0)
            {
              System.out.print("*");
            }
          else
            System.out.print("#");
            }
        }
        System.out.println();
      }
      
  		// Type your code here
    }
}