package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ReviewAble {
    public String name;
    public String price;
    private int stars;
    private Place establishment;
    int stars;
    public List<Review> reviews = new ArrayList<>();


    public Restaurant(String name, String price, int stars){
        this.name = name;
        this.price = price;
        this.stars = stars;
    }

    public String toString(){
        return String.format("Restaurant: Name: %s, Price: %s, Rating: %d", name, price, rating);
    }


    @Override
    public Review addReview(String body, String price, String author, int Stars) {
        return null;
    }

    public List<Review> addReview(String body, String reviewer, int stars){
        this.reviews.body = body;
        this.reviews.reviewer = reviewer;
        this.reviews.stars = stars;
        updateRating();
        reviews.add((Review) this.reviews);
        return reviews;
    }


    public void printReview(List<Review> reviewList){
        for(Object element : reviewList){
            System.out.println(reviews.toString());
        }
    }

    @Override
    public void printReviews(List<Review> reviews) {

    }

    public void updateRating(){
        int total = 0;
        for (Review r : reviews){
            total += r.stars;
        }
       stars = total / reviews.size();
    }

    public Review getRating(){
        updateRating();
        return stars;
    }
}
