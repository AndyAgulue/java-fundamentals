package inheritance;

import java.util.ArrayList;
import java.util.List;

public class Theater implements ReviewAble {
    String name;
    List<String> movies = new ArrayList<>();
    List<Review> reviews = new ArrayList<>();

    public Theater(String name){
        this.name = name;
    }
    public void addMovies(String movie){
        movies.add(movie);
    }
    public void reviewMovie(String movie){
        int idx = movies.indexOf(movie);
        movies.remove(idx);
    }
    public String toString(){
        String message = String.format("Nmae: %s", name);
        String currentMovies = "";
        for(String m:movies){
            if(movies.indexOf(m) != movies.size()-1){
                currentMovies += m +"\n";
            }else{
                currentMovies += m;
            }
        }
        return message + "\n" + currentMovies;
    }
    @Override
    public void addReview(String body, String reviewer, String price, int rating) {
        return null;
    }
    @Override
    public void addReview(String body, String price, String reviewer, String movie, int stars){
        Place establishment = Place.Theater;
        Review r = new Review(body,reviewer,stars,establishment);
        r.name = name;
        r.movie = movie;
        reviews.add(r);
        System.out.println(r.ToString());
    }

    @Override
    public void printReviews(List<Review> reviews) {
        System.out.println(this.toString());
        for(Review r:reviews){
            System.out.println(r.ToString());
        }

    }


}
