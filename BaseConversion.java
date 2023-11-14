import java.util.Scanner;

public class BaseConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read input values
        ////The first line contains an integer, which is the base that the number 'base 1
        System.out.print("Enter base 1: ");
        int base1 = scanner.nextInt();
        
        //The second line contains another integer,
        System.out.print("Enter base 2: ");
        int base2 = scanner.nextInt();

        //The third line contains a value representing the number (N) in the specified base1. It's important to note that for bases higher than 10, digits are represented using lowercase alphabetic characters (e.g., 'a' for 11, 'b' for 12, and so on).
        System.out.print("Enter number in base1: ");

        String number = scanner.next();

        // Output Format: The program should print out the number N in the appropriate base (base#2).

        //Output Format: The program should print out the number N in the appropriate base (base#2).
        
        //Constraints:

/*The initial base (base#1) is between 2 and 32.
The target base (base#2) is between 2 and 32.
The absolute value of the number (N) in decimal (base 10) is less than or equal to 100,000,000,000,000.*/

        // Convert the number from base1 to base10 (decimal)
        //Conversion to Decimal5

        // Convert the number from base1 to base10 (decimal)
        long decimalNumber = convertToDecimal(number, base1);

//We call the convertFromDecimal function to convert the decimal number to the target base base2. We use the Long.toString method to perform this conversion
        // Convert the decimal number to the desired base (base2)
        String result = convertFromDecimal(decimalNumber, base2);

        // Print the result
        System.out.println("The result is: " + result);

        scanner.close();
    }
   // Function to convert a number from base1 to decimal
    //This function takes a String representation of a number in a specific base and converts it to a decimal (base 10) long integer It uses the Long.parseLong method with the specified base
    // Function to convert a number from base1 to decimal
    public static long convertToDecimal(String number, int base1) {
        // Initializes a boolean variable isNegative to false, assuming initially that the number is not negativ
        boolean isNegative = false;


        //if ture Sets the isNegative flag to true.
        if (number.startsWith("-")) {
            isNegative = true;

            //: Removes the negative sign from the number for further processing.
            number = number.substring(1);
        }
        

        // Converts the modified number to a decimal (base 10) long integer using Long.parseLong with the base base1.
        long decimalNumber = Long.parseLong(number, base1);
        return isNegative ? -decimalNumber : decimalNumber;
    }

    // Function to convert a decimal number to base2
    public static String convertFromDecimal(long decimalNumber, int base2) {

        //*if (decimalNumber < 0) {: Checks if the input decimalNumber is negative.
        //If true:return "-" + Long.toString(-decimalNumber, base2);: Returns the negative sign followed by the
        // value of decimalNumber converted to the target base base2.If false:
    // return Long.toString(decimalNumber, base2);: Returns the absolute value of decimalNumber converted to the target base base2 */



        if (decimalNumber < 0) {
            //Returns the absolute value of decimalNumber if isNegative is false,  if isNegative is true,  applying the correct sign to the decimal number.
            return "-" + Long.toString(-decimalNumber, base2);
        } else {
            return Long.toString(decimalNumber, base2);
        }
    }
}
//Example: For example, if the input is 5 for base#1, 6 for base#2, and "43" for N in base#1, the program should convert "43" from base 5 to base 6 and output 35