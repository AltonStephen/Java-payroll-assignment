public class classTwo {
    public static void main(String[] args) {
        classOne myClassOne = new classOne();
        System.out.println(myClassOne.showData("I am a block of text stored in a public function "));
        System.out.println("The difference is : " + myClassOne.diffNums(56.78f,12.97f));
    }
}
