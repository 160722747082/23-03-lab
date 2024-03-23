import java.util.*;

public class fact{
    public static void main(String[] args) {
        int f=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to find the fact");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
        f=f*i;
       }
     System.out.println("fact of "+n+" is "+f);
   }
}