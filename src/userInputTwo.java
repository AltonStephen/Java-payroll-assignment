import java.util.Scanner;
public class userInputTwo {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        userInputOne varsInput = new userInputOne();

        System.out.print("Enter Integer Value : ");
        varsInput.num1 = inputData.nextInt();
        System.out.print("Enter Decimal Value : ");
        varsInput.num2 = inputData.nextFloat();
        System.out.print("Enter Double Value : ");
        varsInput.num3 = inputData.nextDouble();
        System.out.print("Enter First Name  : ");
        varsInput.fName = inputData.next();
        System.out.print("Enter Last Name : ");
        varsInput.lName = inputData.next();
        System.out.println("\n The following is the data entered by you: \n");
        System.out.println("========================================\n");
        System.out.println("Integer Value : "+varsInput.num1);
        System.out.println("Decimal Value : "+varsInput.num2);
        System.out.println("Double Value : "+varsInput.num3);
        System.out.println("First Name : "+varsInput.fName +""+varsInput.lName);
    }

}
