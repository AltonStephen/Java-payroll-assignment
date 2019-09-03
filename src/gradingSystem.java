import java.util.Scanner;
public class gradingSystem {
    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        String fName, lName;
        double maths, eng, chem, hist, bio, sum, avg;
//        Variable Initialisation for User Input
        System.out.println("=====Grading System=====");
        System.out.print("Your First Name :");
        fName = inputData.next();
        System.out.print("Your Last Name :");
        lName = inputData.next();
        System.out.print("Mathematics :");
        maths = inputData.nextDouble();
        System.out.print("English :");
        eng = inputData.nextDouble();
        System.out.print("Chemistry :");
        chem = inputData.nextDouble();
        System.out.print("History :");
        hist = inputData.nextDouble();
        System.out.print("Biology :");
        bio = inputData.nextDouble();

//        Computations
        sum = maths + eng + chem + hist + bio;
        avg = sum / 5;

//        Results
        System.out.println("\n Full Names :" + fName + "" + lName);
        System.out.println("Mathematics   :" + maths);
        System.out.println("English       :" + eng);
        System.out.println("Chemistry     :" + chem);
        System.out.println("History       :" + hist);
        System.out.println("Biology       :" + bio);
        System.out.println("Total Marks   :" + sum);
        System.out.println("Average Marks :" + avg);
        if (avg >= 80 && avg <= 100) {
            System.out.println("Mean Grade : A");
        } else if (avg >= 65 && avg <= 79.9999) {
            System.out.println("Mean Grade : B");
        } else if (avg >= 50 && avg <= 64.9999) {
            System.out.println("Mean Grade : C");
        } else if (avg >= 35 && avg <= 49.9999) {
            System.out.println("Mean Grade : D");
        } else if (avg >= 0 && avg <= 34.9999) {
            System.out.println("Mean Grade : E");
        } else {
            System.out.println("Mean Grade : Invalid Grade");
        }
    }
}