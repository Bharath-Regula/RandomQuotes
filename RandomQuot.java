import java.util.Random;

public class RandomQuot {

    public static void main(String[] args) {
        String[] quotes = {
            "Honesty is the best policy",
            "Failures are the stepping stone to sucess",
            "Education is the key  to sucess",
            "Life is Simple-Lets Simplify",
        };

        Random random = new Random();
        int index = random.nextInt(quotes.length);
        System.out.println("Random Quote: ");
        System.out.println(quotes[index]);
    }

}
