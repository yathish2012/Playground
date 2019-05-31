import java.util.Scanner;
class Main {
	public static void main (String[] args){
	    // Type your code here
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int first=0,rem,count=0,last,i;
      rem=num;
      while(rem!=0)
      {
       rem=rem/10;
        count++;
	  }
      for(i=0;i<count-1;i++)
      {
         first=num%10;
         num=num/10;
      }
      System.out.println(first);
    }
}