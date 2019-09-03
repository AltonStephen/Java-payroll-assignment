public class arraysLoops {
    public static void main(String[] args) {
        String[] cars = {
                "Lamborgini", // Index 0
                "Aston Martin", // Index 1
                "Bugatti", // Index 2
                "Maserati", // Index 3
                "Ferari", // Index 4
                "Ford Ranger" // Index 5
        };
        System.out.println("The following is a list of cars :");
//        Results
        for (int count = 0; count <= 5; count++)
        {
            System.out.println(cars[count]);
        }
    }
}
