package exception_handling;

import java.util.Scanner;

public class ProductReviewApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ProductReviewSystem reviewSystem = new ProductReviewSystem();

        try {
            System.out.print("Enter your rating (1-5): ");
            int rating = sc.nextInt();
            sc.nextLine(); // consume newline

            System.out.print("Enter your review comment: ");
            String comment = sc.nextLine();

            reviewSystem.submitReview(rating, comment);

        } catch (InvalidRatingException e) {
            System.out.println("⚠️ Invalid Rating: " + e.getMessage());
        } catch (EmptyReviewException e) {
            System.out.println("❌ Empty Review: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            sc.close();
        }
    }
}


