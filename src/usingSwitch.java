public class usingSwitch {
    public static void main(String[] args) {
        char choice = 'B';
        switch (choice){
            case 'A':
                System.out.println("Apples");
                break;
            case 'B':
                    System.out.println("Berries");
                    break;
            case 'C':
                        System.out.println("Cantelopes");
                        break;
            case 'D':
                            System.out.println("Donuts");
                            break;
                            default:
                                System.out.println("Invalid Choice");
                                break;
        }
    }
}
