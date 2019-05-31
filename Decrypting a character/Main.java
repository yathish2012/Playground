import java.util.Scanner;
public class Main{
    public static void main(String args[]) {
      Scanner in=new Scanner(System.in);
      char ch=in.next().charAt(0);
      int num=in.nextInt();
      
      if(ch>='a'&&ch<='z')
      for(int i=0;i<num;i++)
      {
        if(ch<='a')
        ch=(char)('z'-0);
        else 
          ch=(char)(ch-1);
      }
      if(ch>='A'&&ch<='Z')
      for(int i=0;i<num;i++)
      {
        if(ch<='A')
        ch=(char)('Z'-0);
        else 
          ch=(char)(ch-1);
      }
      System.out.print(ch);
      
        // Type your code here
    }
}