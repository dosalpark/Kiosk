import java.util.ArrayList;
import java.util.List;
//
public class Order {
    private List<Order> oderList = new ArrayList<>();
    private Double price;
    private String product;

    public Order() {

    }

    public Double setSumPrice(){
        return this.price + price;
    }
    public String setCartProduct(){
        return this.product + product;
    }
}