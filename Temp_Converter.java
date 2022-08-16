import java.util.Scanner;
public class Temp_Converter {
    public static void main(String[] args)
    {
        //this ln will take input from keyboard...
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter current Temperature in Fahrenheit: ");
        double current_temp = scan.nextFloat(); // scan values are assigned to current_temp
        //convert now
     double celsius =(current_temp-32)*5/9;
        System.out.print("Current Temperature in Celsius is : "+celsius);

        }

    }