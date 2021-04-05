import java.util.Scanner;

public class DrawingMenu {
    public static void main(String[] args){
        int choice = -1;
        while(choice != 0) {
            Scanner input = new Scanner(System.in);
            System.out.println("Menu: ");
            System.out.println("1. Print the rectangle");
            System.out.println("2. Print the square triangle");
            System.out.println("3. Print the isosceles triangle");
            System.out.println("4. Exit");
            System.out.println("Enter your choice: ");
            choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Print the rectangle");
                    for (int i =0; i < 3; i++){
                        for (int j = 0; j < 7; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 2:
                    System.out.println("Print the square triangle");
                    for (int i = 0; i <= 5; i++){
                        for (int j = 0; j < i; j++){
                            System.out.print(" * ");
                        }
                        System.out.println();
                    }
                    break;
                case 3:
                    System.out.println("Print the isosceles triangle");
                    System.out.println("    *    ");
                    System.out.println("   * *   ");
                    System.out.println("  * * *  ");
                    System.out.println(" * * * * ");
                    System.out.println("* * * * *");
                    break;
                case 4:
                    System.exit(4);
                default:
                    System.out.println("No choice!");
            }
        }
    }
}

