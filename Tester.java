import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Scanner a= new Scanner(System.in);
        boolean active = true;

        System.out.println("put a number between 1 and 10");
        while (true){
            int number= a.nextInt();
            switch (number) {
                case 1:
                    System.out.println("one");
                    break;
                case 2:
                    System.out.println("two");
                    break;
                case 3:
                    System.out.println("three");
                    break;
                case 4:
                    System.out.println("four");
                    break;
                case 5:
                    System.out.println("five");
                    break;
                case 6:
                    System.out.println("six");
                    break;
                case 7:
                    System.out.println("seven");
                    break;
                case 8:
                    System.out.println("eight");
                    break;
                case 9:
                    System.out.println("nine");
                    break;
                case 10:
                    System.out.println("one");
                    break;
                default:
                    System.out.println("Cannot give you the name");
            }
        }

    }

}
