public class lessonFive {
    public static void main(String[] args) {
        // Declaring and Initialising varables for computation
        float num1,num2,sum,prod,diff,divsn,remdr;

        // Initialising Variables

        num1 = 45.78f;
        num2 = 23.56f;

//        Computations/ Processing
        sum = num1+ num2;
        prod = num1 * num2;
        diff = num1 - num2;
        divsn = num1 / num2;
        remdr = num1 % num2;

//        Results
        System.out.println("First Number:" + num1);
        System.out.println("Second Number:" + num2 + "\n");
        System.out.println("Sum Is:" + sum);
        System.out.println("Product Is:" + prod);
        System.out.println("Difference Is:" + diff);
        System.out.println("Division Is:" + divsn);
        System.out.println("remainder Is:" + remdr);
    }
}
