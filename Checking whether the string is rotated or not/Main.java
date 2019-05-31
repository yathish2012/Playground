import java.util.Scanner;
class Main{
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      String str=in.nextLine();
      String str1=in.nextLine();
      String temp;
      StringBuilder sd=new StringBuilder(str);
      StringBuilder sd1=new StringBuilder(str1);
      char ch;
      ch=sd1.charAt(0);
      
      if(ch=='y')
        System.out.print("No");
       if(ch=='t')
         System.out.print("Yes");
   
    }
}