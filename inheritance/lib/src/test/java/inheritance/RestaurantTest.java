package inheritance;

import org.junit.Test;
import static org.junit.Assert.*;

public class RestaurantTest {
    @Test
    public void testRestaurant(){
        Restaurant test = new Restaurant("Voyager", "$");
        test.review = new Review("test string", "Joe Shmoe", 5);
        System.out.println(test.toString());
        String name = "Voyager";
        assertEquals("The name should be Voyager", name, test.name);
        String price = "$";
        assertEquals("The price should be one $", price, test.price);
        String testString = "Restaurant: Name: Voyager, Price: $, Rating: 5";
        assertEquals("Strings should match", testString, test.toString());
        test.addReview("Great Sandwiches", "Matt", 4);
        test.addReview("Great food, long wait though", "Patti", 3);
        test.printReview(test.reviewList);
        System.out.println(test.toString());

    }
}
