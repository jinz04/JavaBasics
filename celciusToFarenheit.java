import java.util.Scanner;
public class celciusToFarenheit {
    public static void main(String args[])
    {
        float cel;
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        cel= sc.nextFloat();
        float far= (9*cel)/5+32;
        System.out.println("The temperature in farenheit is :"+far);

    }
}
