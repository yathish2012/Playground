import java.util.Scanner;
class Main{
  public static int prime(int num)
  {
    int i,j,counter;
    for(i=1;i<=num;i++)
    { counter =0;
      for(j=1;j<=i;j++)
      if(i%j==0)
      { 
        counter++;
      }
      if (counter==2)
      System.out.println(i);
    
  }
    return 0;
  }
	public static void main (String[] args)
    {
    Scanner in=new Scanner(System.in);
      int number=in.nextInt();
      prime(number);
    }
	    // Type your code here
	}