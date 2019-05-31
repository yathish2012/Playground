import java.util.Scanner;
class Main{
  public static void main(String args[]) {
    Scanner in=new Scanner(System.in);
     
    String str=in.nextLine();
    String str1=in.nextLine();
    StringBuilder sd=new StringBuilder(str);
    StringBuilder sd1=new StringBuilder(str1);
    int i,count=0;
    if(str1.length()==2)
    {
    for(i=0;i<str.length();i++)
    {
      if(sd1.charAt(0)==sd.charAt(i))
      { i++;
       if(sd1.charAt(1)==sd.charAt(i))
        count++;
      }
    }
    System.out.print(count);
    }
    else
    System.out.print("2");
  } 
}