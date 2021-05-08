import java.util.ArrayList;

// Cart Class
public class Cart {

    // Cart Attributes
    public ArrayList<Pizza> cart = new ArrayList<>();

    // Cart Default Constructor
    public Cart() {

    }

    // Cart Methods and Getters/Setters
    public ArrayList<Pizza> getCart() {
        return cart;
    }

    public void setCart(ArrayList<Pizza> cart) {
        this.cart = cart;
    }

    public int sizeCart() {
        return cart.size();
    }

    public String getItems(int i) {
        return cart.get(i).toString();
    }

    public void addPizza(Pizza pizza) {
        cart.add(pizza);
    }

}
