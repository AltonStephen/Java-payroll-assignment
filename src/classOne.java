public class classOne {
    private  void displayText (){
        System.out.println("I am a block of text stored in a private method.");
    }
    public String showData(String txt){
        return txt;
    }
    private int adddNums(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }
    public float diffNums(float firstNum, float secNum){
        float diff = firstNum - secNum;
        return diff;
    }
}
