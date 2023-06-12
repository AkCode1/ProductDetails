 import java.util.Scanner;

public class ProductDetails {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Product ID:");
        String productId = scanner.nextLine();

        System.out.println("Enter Product Name:");
        String productName = scanner.nextLine();

        System.out.println("Enter Product Description:");
        String productDescription = scanner.nextLine();


        System.out.println("Enter Product Category:");
        String productCategory = scanner.nextLine();

        System.out.println("Enter Price:");
        double price = scanner.nextDouble();

        System.out.println("Enter Quantity:");
        int quantity = scanner.nextInt();

        System.out.println("Product Details:");
        System.out.println("Product ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Product Description: " + productDescription);
        System.out.println("Product Category: " + productCategory);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);

        scanner.close();
    }
}
