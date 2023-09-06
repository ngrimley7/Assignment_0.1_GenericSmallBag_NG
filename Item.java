/**
 * A generic class representing an item of type T.
 *
 * @param <T> The type of the item.
 */
public class Item<T> {

    private T e;

    /**
     * Constructs an Item with the specified value of type T.
     *
     * @param t The value of type T to initialize the item.
     */
    public Item(T t) {
        e = t;
    }

    /**
     * Sets the value of the item to the specified value.
     *
     * @param e The new value to set for the item.
     */
    public void setItem(T e) {
        this.e = e;
    }

    /**
     * Gets the value of the item.
     *
     * @return The value of the item of type T.
     */
    public T getItem() {
        return e;
    }
}
