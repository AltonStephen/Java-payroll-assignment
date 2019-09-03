import java.util.Scanner;
public class lessonFour {
    public static void main(String[] args) {
        // Instantiating an object of scanner
        Scanner inputData = new Scanner(System.in);
        // Declaring Variables for User Input
        int num1;
        float num2;
        double num3;
        String first_name, last_name;
        // Initialising Variables via prompts
        System.out.print("Enter Integer Value :");
        num1 = inputData.nextInt();
        System.out.print("Enter Decimal Value :");
        num2 = inputData.nextFloat();
        System.out.print("Enter Double Value :");
        num3 = inputData.nextDouble();
        System.out.print("Enter First Name :");
        first_name = inputData.next();
        System.out.print("Enter Last Name :");
        last_name = inputData.next();
        // Results
        System.out.println("========The following is the information entered by th user");
        System.out.println("integer Value :" + num1);
        System.out.println("Decimal Value :" + num2);
        System.out.println("Double Value :" + num3);
        System.out.println("Full Names :" + first_name + " " +last_name);
    }
}
