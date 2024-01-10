package KioskNew;

public class Food extends Menu {
    private double price;

    public Food() {
    }

    public Food(int idx, String name, String description, double price) {
        super(idx, name, description);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String toString() {
        return "   " + super.getName() + "  ||  " + this.getPrice() + "  ||  " + super.getDescription();
    }
}

