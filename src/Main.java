import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the width:");
        double width = scanner.nextDouble();

        System.out.print("Enter the height:");
        double height = scanner.nextDouble();

        Rectangle rect = new Rectangle(width, height);
        System.out.println(rect.display());
        System.out.println("Chu vi: " + rect.getPerimeter());
        System.out.println("Dien tich: " + rect.getArea());
    }
}