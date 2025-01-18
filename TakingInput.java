import java.util.Scanner;
class getInput
{
    @SuppressWarnings("resource")
    public static void main(String args[])
    {
        int a; float f; String s;
        Scanner sc= new Scanner(System.in);
        
        System.out.println("Enter a string: ");
        s=sc.nextLine();
        System.out.println("String entered: "+s);
        System.out.println("Enter an integer: ");
        a=sc.nextInt();
        System.out.println("Integer entered: "+a);
        System.out.println("Enter a float value: ");
        f=sc.nextFloat();
        System.out.println("Float entered: "+f);
    }
}
