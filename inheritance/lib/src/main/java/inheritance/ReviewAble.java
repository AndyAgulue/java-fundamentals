package inheritance;
import java.util.List;

public interface ReviewAble {
    Review addReview(String body, String price, String author, int Stars);
    List<Review> addReview(String body, String reviewer, int rating);
    void printReview(List<Review> reviewList);

    void printReviews(List<Review> reviews);
}
