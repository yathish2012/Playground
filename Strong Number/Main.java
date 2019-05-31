import java.util.Scanner;
class Main{
	public static void main (String[] args){
      Scanner in=new Scanner(System.in);
      int num=in.nextInt();
      int rem,res,sum=0,i,rep,count=0,rep1,j;
	   rep=num;
       while(rep>0)
       {
         rep=rep/10;
         count++;
       }
      rep1=num;
      for(i=0;i<count;i++)
      { 
        rem=rep1%10;
        int fact=1;
        for(j=1;j<=rem;j++)
          fact=fact*j;
        sum=sum+fact;
        rep1=rep1/10;
      }
      if(sum==num)
        System.out.println("Yes");
      else
        System.out.println("No");
      
	}
}