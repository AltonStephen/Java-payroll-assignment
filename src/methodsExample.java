public class methodsExample {
//    Creating Methods
    void displaData()
    {
        System.out.println("I am a method that doesn't return anything");
    }
    String displaytext()
    {
        String txt = "I am a method that has an argument";
        return txt;
    }
    int addNums(int num1, int num2, int num3)
    {
        int sum = num1 + num2 + num3;
        return sum;
    }
    public static void main(String[] args) {
        methodsExample showResults = new methodsExample();
        showResults.displaData();
        System.out.println(showResults.displaytext());
        System.out.println("The sum is :" + showResults.addNums(23,17,15));

    }
}
