import java.util.Scanner;
class Main{
    public static void main(String args[]) {
   	  Scanner in=new Scanner(System.in);
     String str=in.nextLine();
      StringBuilder sd=new StringBuilder(str);
      int i,j,flag=0;
      StringBuilder temp=new StringBuilder(str);
      
      temp.reverse();
      
      
      for(i=0;i<str.length();i++)
      {
        if(temp.charAt(i)==sd.charAt(i))
        {
          flag=0;
        }
        else{
          flag=1;
        break;
      }
      }
   
      if(flag==0) 
         System.out.print("Yes");
      else 
        System.out.print("No");
	}
}