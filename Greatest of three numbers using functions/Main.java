import java.util.Scanner;
class Main{
public static int greatest(int num1,int num2)
{
  if(num1>num2)
    return num1;
  else
    return num2;
}  
  public static void main (String[] args)
  {
    Scanner in=new Scanner(System.in);
	int n1,n2,n3,great;
    n1=in.nextInt();
    n2=in.nextInt();
    n3=in.nextInt();
    great=greatest(n1,n2);
    great=greatest(great,n3);
    System.out.print(great);
	}
}