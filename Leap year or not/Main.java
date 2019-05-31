import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int year,flag=0;
      year=in.nextInt();
      if(year%4==0)
        flag++;
        if(year%100==0)
          flag++;
          if(year%400==0)
            flag++;
      
          if(flag==3)
            System.out.println("Leap year");
      else
        System.out.println("Non Leap year");
      
		// Type your code here
    }
}