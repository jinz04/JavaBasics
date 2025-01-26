import java.util.Scanner;
public class ArmstrongNo
{
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        int num,digit=0,x,sum=0,temp;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        num= sc.nextInt();
        //count no of digits
        temp=num;
        while(temp!=0)
        {
            digit++;
            temp=temp/10;
        }
        temp=num;
        while(temp>0)
        {
            x=temp%10;
            sum= sum+(int)Math.pow(x,digit);
            temp=temp/10;
        }
        if(sum==num)
        {
            System.out.println("Armstrong No");
        }
        else
        System.out.println("Not Armstrong No");
    }
}