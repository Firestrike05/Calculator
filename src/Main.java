import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Double num1;
        num1 = s.nextDouble();
        s.nextLine();
        System.out.println("Operation (+, -, /, x): ");
        String choice = s.nextLine();

        //Create an array list to take user input
        ArrayList<Double> num2 = new ArrayList<Double>();
        while (s.hasNextLine()) {
            String line = s.nextLine().trim();
            if (line.isEmpty()) {
                break; // Exit the loop when a blank line is entered
            }
            try {
                double i = Double.parseDouble(line);
                num2.add(i);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input: " + line);
            }
        }

        Double[] num3 = num2.toArray(new Double[num2.size()]);
        double result;

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

        System.out.println(num1);
        System.out.println(num2);

    }
}


