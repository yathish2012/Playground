import java.util.Scanner;
class Main {
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int num,count=0,i;
      num=in.nextInt();
      for(i=0;count<num;i++)
      {
        if(i%2==1)
        {
          System.out.println(i);
          count++;
        }
      }
	     // Type your code here
	}
}