public class overloadingExample {
    int addNums(int num1,int num2, int num3){
        int sum = num1+num2+ num3;
        return sum;
    }
    float addNums(float num1,float num2, float num3) {
        float sum = num1 + num2 + num3;
        return sum;
    }
    double addNums(double num1,double num2, double num3) {
        double sum = num1 + num2 + num3;
        return sum;
    }
    public static void main(String[] args) {
        overloadingExample overloads = new overloadingExample();
        System.out.println("Sum of Integers : "+ overloads.addNums(23,13,17));
        System.out.println("Sum of Floats : "+ overloads.addNums(23.98f,19.34f,12.67f));
        System.out.println("Sum of Doubles : "+ overloads.addNums(1234123,2244564,882654));
    }
}
