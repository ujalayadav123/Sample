import java.util.Scanner;

public class AreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Choose a shape to calculate its area:");
        System.out.println("1. Square");
        System.out.println("2. Rectangle");
        System.out.println("3. Triangle");
        
        int choice = scanner.nextInt();
        
        switch (choice) {
            case 1:
                System.out.print("Enter the side length of the square: ");
                double side = scanner.nextDouble();
                double squareArea = calculateSquareArea(side);
                System.out.println("The area of the square is: " + squareArea);
                break;
            case 2:
                System.out.print("Enter the length of the rectangle: ");
                double length = scanner.nextDouble();
                System.out.print("Enter the width of the rectangle: ");
                double width = scanner.nextDouble();
                double rectangleArea = calculateRectangleArea(length, width);
                System.out.println("The area of the rectangle is: " + rectangleArea);
                break;
            case 3:
                System.out.print("Enter the base length of the triangle: ");
                double base = scanner.nextDouble();
                System.out.print("Enter the height of the triangle: ");
                double height = scanner.nextDouble();
                double triangleArea = calculateTriangleArea(base, height);
                System.out.println("The area of the triangle is: " + triangleArea);
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
        
        scanner.close();
    }
    
    public static double calculateSquareArea(double side) {
        return side * side;
    }
    
    public static double calculateRectangleArea(double length, double width) {
        return length * width;
    }
    
    public static double calculateTriangleArea(double base, double height) {
        return 0.5 * base * height;
    }
}
