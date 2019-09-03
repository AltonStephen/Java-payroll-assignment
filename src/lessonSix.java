public class lessonSix {
    public static void main(String[] args) {
//        Declaring and Initialising Variables for Computations
        int num1 = 35;
        int num2 = 24;
        int num3 = 12;

//        Compound Assignment Operators
        /*
        They Initialise and perform variables and computations at
        the same time.
        They include : +=, -=, *=, /=, &=.
        e.g. a+=b; is the same as a=a+=b;
        Given a=2 and b = 3,find a.
         */
//        Computations/ Processing
        num1 += num2;
        num2 -= num1;
        num3 *= num2;

//        Results
        System.out.println("Result One :" + num1);
        System.out.println("Result Two :" + num2);
        System.out.println("Result Three :" + num3);
    }
}
