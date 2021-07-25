import java.util.concurrent.TimeUnit;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
  public static void main(String[] args) {
    int dogCount = 1;
    System.out.println("I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

    int catCount = 2;
    System.out.println("I own " + catCount + " " + pluralize("cat", catCount) + ".");

    int turtleCount = 0;
    System.out.println("I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

    flipNHeads(4);
    clock();
  }

  public static String pluralize(String word, int num) {
    if (num == 0 || num > 1) {
      return word + "s";
    } else
      return word;
  }

  // coin flip
  public static void flipNHeads(int n) {
    // int counter = 0;
    int headCounter = 0;
    int flips = 0;
    while (headCounter < n) {
      flips++;
      if ((Math.random() * 1) >= 0.5) {
        headCounter++;
        System.out.println("heads");

      } else if ((Math.random() * 1) < 0.5) {
        System.out.println("tails");
        headCounter = 0;
      }
    }
    System.out.println("It took " + flips + " flips to flip " + n + " heads  in  a row");
  }

  // command line clock
  public static void clock() {
    while (true) {
      LocalDateTime now = LocalDateTime.now();
    int hour = now.getHour();
    int minute = now.getMinute();
    int second = now.getSecond();
      String time = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
      try {
        TimeUnit.SECONDS.sleep(1);
        
      } catch (Exception e){}
System.out.println(time);
    }
  }
}
