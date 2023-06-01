/*An online retailer sells two products: widgets and gizmos. Each widget     weighs 75 grams. Each gizmo weighs 112 grams. Write a program that reads the number of widgets and the number of gizmos in an order from the user. Then your program should compute and display the total weight of the order*/

import java.util.Scanner;

class OrderWeightCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of widgets: ");
        int numWidgets = scanner.nextInt();

        System.out.print("Enter the number of gizmos: ");
        int numGizmos = scanner.nextInt();

        int widgetWeight = 75;
        int gizmoWeight = 112;

        int totalWeight = (numWidgets * widgetWeight) + (numGizmos * gizmoWeight);

        System.out.println("The total weight of the order is: " + totalWeight + " grams");

        scanner.close();
    }
}

