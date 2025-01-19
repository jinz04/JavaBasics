import java.util.*;
public class PrimeNumber {
    public static void main(String args[])
    {
        int num,i,flag=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        num= sc.nextInt();
        if(num<=1)
        System.out.println("Not Prime");
        for(i=2;i<=num/2;i++)
        {
            if(num%i==0)
            {
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("Not Prime");
        else
        System.out.println("Prime number");
    }
}
