import java.util.Scanner;
class Main{
  public static int search(int num,int arr[],int num2)
  {
    int ele=-1,i;
    for(i=0;i<num2;i++)
    {
      if(num==arr[i])
      {
        ele=i;
        return i;
      }
    }
           if(ele==-1)
             return -1;
    return 0;
  }   
    public static void main(String args[])
    {
      Scanner in=new Scanner(System.in);
      int idx,ele1,ele2,i;
      idx=in.nextInt();
      int arr[];
      arr=new int[idx];
     for(i=0;i<idx;i++)
       arr[i]=in.nextInt();
      ele1=in.nextInt();
      ele2=in.nextInt();
      System.out.println(search(ele1,arr,idx));
      System.out.println(search(ele2,arr,idx));
    }
}