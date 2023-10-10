import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Declare scanner variable
        Scanner s = new Scanner(System.in);
        Double num1;
        //Take the first argument to the calculator
        num1 = s.nextDouble();
        s.nextLine();
        //Prompt the user to select a calculator function
        System.out.println("Operation (+, -, /, x): ");
        String choice = s.nextLine();

        //Create an array list filled with user input and repeat until no more arguments are needed
        ArrayList<Double> num2 = new ArrayList<>();
        while (s.hasNextLine()) {
            String line = s.nextLine().trim();
            if (line.isEmpty()) {
                break; // Exit the loop when a blank line is entered
            }
            try {
                double i = Double.parseDouble(line);
                num2.add(i);
            } catch (NumberFormatException e) {
                //Throw an error if user doesn't enter a number
                System.out.println("Invalid input: " + line);
            }
        }

        //Convert the arraylist to a Double array for use with a Vararg argument
        Double[] num3 = num2.toArray(new Double[num2.size()]);

        //Switch statements that take user inputted function and prints results of calculation
        switch (choice) {
            case "-":
                Vararg.sub(num1, num3);
                break;
            // Handle other cases here if needed
            case "+":
                Vararg.add(num1, num3);
                break;
            case "/":
                Vararg.divide(num1, num3);
                break;
            case "x":
                Vararg.multi(num1, num3);
                break;
            default:
                System.out.println("Invalid choice");
                break;
        }
        //Prints out the arguments entered by the user
        System.out.println(num1);
        System.out.println(num2);

    }
}


