import java.util.Scanner;
class Main {
	public static void main (String[] args) {
      Scanner in=new Scanner(System.in);
      int n1,n2,n3,gr;
      n1=in.nextInt();
      n2=in.nextInt();
      n3=in.nextInt();
      if(n1>n2&&n1>n3)
        System.out.println(n1);
       else if(n2>n1&&n2>n3)
         System.out.println(n2);
      else
        System.out.println(n3);
      
    }
		// Type your code here
}