package inheritance;
import java.util.List;

public interface ReviewAble {
    void addReview(String body, String reviewer, int rating);
    void printReview(List<Review> reviewList);
}
