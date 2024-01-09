package KioskNew;

public class Menu {
     private int idx;
     private String name;
     private String description;

    public Menu(int idx, String name, String description){
        this.idx = idx;
        this.name = name;
        this.description = description;
    }

    public Menu() {
    }


    public int getIdx() {
        return idx;
    }

    public void setIdx(int idx) {
        this.idx = idx;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
