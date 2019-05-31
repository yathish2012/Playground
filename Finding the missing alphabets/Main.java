import java.util.Scanner;
class Main{
    public static void main(String args[]){
	    Scanner in=new Scanner(System.in);
        String MyString =in.nextLine();
        String s = MyString.replaceAll("\\s+", "");
        s=s.toLowerCase();
        StringBuilder sd=new StringBuilder(s);
        int offset=0,i;
        int arr[]=new int[26];
        char ch;
        for(i=0;i<s.length();i++)
         {
             ch=sd.charAt(i);
             offset=ch-'a';
             arr[offset]++;
         }
         for(i=0;i<26;i++)
          {
              if(arr[i]==0)
              System.out.print((char)(i+'a')+" ");
          }
        
    }
}