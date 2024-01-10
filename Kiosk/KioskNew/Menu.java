package KioskNew;

public class Menu {
    private int idx;
    private String name;
    private String description;

    public Menu(int idx, String name, String description) {
        this.idx = idx;
        this.name = name;
        this.description = description;
    }

    public Menu() {
    }
    public int getIdx() {
        return idx;
    }
    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
