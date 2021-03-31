package inheritance;
import java.util.ArrayList;
import java.util.List;

public class Shop implements ReviewAble {
    String name;
    String cost;
    Review review;
    int rating;
    List<Review> reviewList = new ArrayList<>();


    public Shop(String name, String price, String description){
        this.name = name;
        this.price = price;
        this.rating = stars;
        this.description = description;
    }

    public String toString(){
        return String.format("Restaurant: Name: %s, Price: %s, Rating: %d, Description: %s", name, price, rating, description);
    }



    public Review addReview(String body, String reviewer, String price, int stars){
        this.review.body = body;
        this.review.reviewer = reviewer;
        this.review.rating = stars;
        this.rating = (this.rating + stars)/2;
        reviewList.add(this.review);
    }

    @Override
    public void addReview(String body, String price, String movie, String reviewer, int stars) {
        addReview(body, price, reviewer, stars );
    }


    public void printReviews(List<Review> reviewList){
        for(Review r:reviews){
            System.out.println(r.ToString());
        }
    }
}


