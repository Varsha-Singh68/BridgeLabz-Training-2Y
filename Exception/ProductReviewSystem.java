package exception_handling;

class InvalidRatingException extends Exception {
    public InvalidRatingException(String message) {
        super(message);
    }
}

class EmptyReviewException extends Exception {
    public EmptyReviewException(String message) {
        super(message);
    }
}

class ProductReviewSystem {
    public void submitReview(int rating, String comment)
            throws InvalidRatingException, EmptyReviewException {

        if (rating < 1 || rating > 5) {
            throw new InvalidRatingException("Rating must be between 1 and 5.");
        }

        if (comment == null || comment.trim().isEmpty()) {
            throw new EmptyReviewException("Review comment cannot be empty.");
        }

        System.out.println("Review submitted successfully!");
        System.out.println("Rating: " + rating);
        System.out.println("Comment: " + comment);
    }
}


