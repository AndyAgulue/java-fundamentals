package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Restaurant implements ReviewAble {
    String name;
    String price;
    Review review;
    int rating;

    public Restaurant(String name, String price){
        this.name = name;
        this.price = price;
        this.rating = 5;
    }

    public String toString(){
        return String.format("Restaurant: Name: %s, Price: %s, Rating: %d", name, price, rating);
    }
    List<Review> reviewList = new ArrayList<>();


    public void addReview(String body, String reviewer, int stars){
        this.review.body = body;
        this.review.reviewer = reviewer;
        this.review.rating = rating;
        this.rating = (this.rating + stars)/2;
        reviewList.add(this.review);
    }


    public void printReview(List<Review> reviewList){
        for(Object element : reviewList){
            System.out.println(review.toString());
        }
    }
}
