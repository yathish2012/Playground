import java.util.Scanner;
class Main{
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int n,k,sum;
      n=num/100;
      k=num%10;
      sum=n+k;
      System.out.println(sum);
		// Type your code here
	}
}