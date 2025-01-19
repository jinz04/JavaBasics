import java.util.Scanner;
class Palindrome
{
    public static void main(String args[])
    {
        int num,m,x,rev=0;
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");
        num=sc.nextInt();
        m=num;
        while(num>0)
        {
            x=num%10;
            rev=rev*10+x;
            num=num/10;
        }
        if(rev==m)
        System.out.println("Number is a palindrome");
        else
        System.out.println("Number is not a palindrome");
    }
}