/**
 * A generic class representing a small bag that can hold an item of type T.
 *
 * @param <T> The type of item that the small bag can hold.
 */
public class SmallBag<T> {

    private T e;

    /**
     * Constructs an empty SmallBag.
     */
    public SmallBag() {
        // Initialize an empty SmallBag
    }

    /**
     * Sets the item in the small bag to the specified value.
     *
     * @param e The item of type T to store in the small bag.
     */
    public void setSmallBag(T e) {
        this.e = e;
    }

    /**
     * Gets the item stored in the small bag.
     *
     * @return The item of type T stored in the small bag.
     */
    public T getSmallBag() {
        return e;
    }
}
