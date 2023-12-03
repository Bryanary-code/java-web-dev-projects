
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;

public class ListPractice {

    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(5);
        integers.add(7);
        integers.add(3);
        integers.add(12);
        integers.add(58);
        integers.add(17);
        integers.add(9);
        integers.add(22);
        integers.add(91);
        integers.add(31);

       /* ArrayList<String> words = new ArrayList<>();
        words.add("fiver");
        words.add("house");
        words.add("yes");
        words.add("flop");
        words.add("punter");
        words.add("pluck"); */
        String quote = "I would not, could not, in a box. I would not, could not with a fox. I will not eat them in a house. I will not eat them with a mouse.";

        ArrayList<String> words = new ArrayList<>(Arrays.asList(quote.split(" ")));


        System.out.println(sumEven(integers));
        printFive(words);
    }

    public static int sumEven(ArrayList<Integer> arr) {
        int total = 0;
        for (int integer : arr) {
            if (integer % 2 == 0) {
                total += integer;
            }

        }

        return total;
    }

    public static void printFive(ArrayList<String> arr) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter word length: ");
        int wordLength = input.nextInt();
        for (String word : arr) {
            if (word.length() == wordLength ) {
                System.out.println(word);
            }
        }

    }
}






