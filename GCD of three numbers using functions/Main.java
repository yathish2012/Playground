import java.util.Scanner;
public class Main{
  public static int gcd(int num1,int num2,int num3)
  {
    int flag=1;
    while(flag!=0)
    {
      if(num1%num3==0&&num2%num3==0)
      {
        flag=0;
        return num3;
      }
      num3--;
    }
     return 0;
  }
	public static void main (String[] args)
	{
     Scanner in=new Scanner(System.in);
       int n1,n2,n3,min,gcd1;
       n1=in.nextInt();
      n2=in.nextInt();
      n3=in.nextInt();
      if(n1<n2)
        min=n1;
      else
        min=n2;
      gcd1=gcd(n1,n2,min);
      if(gcd1<n3)
        min=gcd1;
      else
        min=n3;
      gcd1=gcd(gcd1,n3,min);
        System.out.print(gcd1);
    }
}