
import Genericbag.Item;
import Genericbag.SmallBag;

/**
 * This class demonstrates the usage of generic items and a small bag to store them.
 */
public class Application {

    /**
     * The main method of the application.
     *
     * @param args The command-line arguments (not used in this application).
     */
    public static void main(String[] args) {
        // Create a string item
        Item<String> sb1 = new Item<String>("Niall Grimley");

        // Create an integer item
        Item<Integer> sb2 = new Item<Integer>(17);

        // Create a small bag to store generic items
        SmallBag<Item> sb3 = new SmallBag<Item>();

        // Set the string item in the small bag and print it
        sb3.setSmallBag(sb1);
        System.out.println(sb3.getSmallBag().getItem());

        // Set the integer item in the small bag and print it
        sb3.setSmallBag(sb2);
        System.out.println(sb3.getSmallBag().getItem());
    }
}
