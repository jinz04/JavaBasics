import java.util.Scanner;
public class swapVariables{
    public static void main(String args[])
    {
        int a,b,temp;
        @SuppressWarnings("resource")
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two values: ");
        a= sc.nextInt();
        b=sc.nextInt();
        temp=a;
        a=b;
        b=temp;
        System.out.println("Swapped values: "+a+" "+b);
    }
}
