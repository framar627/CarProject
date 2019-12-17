package Week14;

import java.util.*;

public class Main {
    // write your code
    public static Scanner menu = new Scanner(System.in);

    public static void main(String[] args) {

        // write your code here
        while (true) {
            System.out.println("Enter 1 for displaying car");
            System.out.println("Enter 2 for buying car");
            System.out.println("Enter 3 for displaying nameholder");
            System.out.println("Enter 4 for displaying models" + "\n");

            int i = menu.nextInt();
            switch (i) {
                case 1:
                    displaycar();
                    break;
                case 2:
                    buycar();
                    break;
            }

        }
    }

    private static void buycar() {
        System.out.println("you press buy car" + "\n");
    }

    private static void displaycar() {
        System.out.println("you press display car" + "\n");
    }
}



