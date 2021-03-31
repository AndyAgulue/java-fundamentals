    package inheritance;

    import org.junit.Test;
    import static org.junit.Assert.*;

    public class inheritanceTest {
        @Test public void testCreateRestaurant(){
            Restaurant restaurant = new Restaurant("Voyager","$$",5);
            String expected = "Name: Voyager\nStars: 5 \nPrice: $$";
            String actual = restaurant.toString();
            assertEquals("New restaurant",expected,actual);
        }
        @Test public void testCreateReview(){
            User user = new User("Andy");
            Restaurant r = new Restaurant("Madrono","$$$",2);
            r.addReview("The food was disappointing","$$$",user.name,
                    2);
            String expected = "Name: Madrono\n" +
                    "Review: This Food was disappointing\n" +
                    "Author: Andy\n" +
                    "Rating:1";
            String actual = r.reviews.get(0).ToString();
            assertEquals("New review:",expected,actual);
        }
        @Test public void testAddReview(){
            Restaurant r = new Restaurant("Portofinos","$$$",2);
            r.addReview("great Food","$$$","Ted",3);
            r.addReview("Tis is not Pizza","$$","Jim",2);
            r.addReview("Terrible food","$$$","Lance",1);
            r.toString();
            Restaurant s = new Restaurant("Tuckers", "$",5);
            s.addReview("Nice service","$$","Sam",5);
            s.toString();
        }
        @Test public void testAddUserReview(){
            Restaurant hooters = new Restaurant("Hooters","$$",2);
            User me = new User("Sammy");
            me.conductReview(hooters,"Don't go for the food",1);
            me.conductReview(hooters,"Wings are great",4);
        }
        @Test public void testCreateShop(){
            Shop shop = new Shop("FernBlue","Well curated Boutique","$$");
            String expected = "FernBlue";
            String actual = shop.name;
            assertEquals("Should create a shop and display its name",expected,actual);
        }
        @Test public void testShopToString(){
            Shop shop = new Shop("Olga's","Good quality, Great service","$$$");
            String expected = "Name: Olga's\n" +
                    "Cost: Good quality, Great service\n" +
                    "Description: $$$";
            String actual = shop.toString();
            assertEquals("Should display shop info ",expected,actual);
        }
        @Test public void testTheater(){
            Theater AMC = new Theater("AMC");
            AMC.addMovie("The Dark Knight");
            AMC.addMovie("Wonder Woman");
            AMC.addMovie("Tom and Jerry");
            int expected = 3;
            int actual = AMC.movies.size();
            assertEquals("Should include 3 movies",expected,actual);
            String expected2 = "Name: AMC\n" +
                    "The Dark Knight\n" +
                    "Wonder Woman\n" +
                    "Tom and Jerry";
            String actual2 =AMC.toString();
            assertEquals("Should display Theater and list of movies",expected2,actual2);

            AMC.removeMovie("Call me by your name");
            String expected3 = "Name: IFC\n" +
                    "Hot Fuzz\n" +
                    "The Void";
            String actual3 =AMC.toString();
            assertEquals("Should remove a movie on removeMovie",expected3,actual3);
        }
        @Test public void reviewTests(){
            Theater Angelica = new Theater("Angelica");
            Angelica.addReview("Comfortable chairs","$$$$","Dustin",3);
            Angelica.printReviews(Angelica.reviews);
            Angelica.addReview("This places was great","$$$$","Daniel",5,"The Hobbit");
            Angelica.printReviews(Angelica.reviews);

            Restaurant Matia = new Restaurant("Matia","$",3);
            Matia.addReview("Excellent food","$","Me",4,"Shouldn't work");
            Matia.printReviews(Matia.reviews);
            String expected = "Name: Matia\n" +
                    "Stars: 4 \n" +
                    "Price: $\n" +
                    "Name: Matia\n" +
                    "Review: Excellent food\n" +
                    "Author: Me\n" +
                    "Rating:4";
            String actual = Matia.toString();
            assertEquals("Should not print a movie title",expected,actual);
        }
    }