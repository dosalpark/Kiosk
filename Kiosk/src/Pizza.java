public class Pizza extends Product {
    private int idx;
    private String name;
    private String description;
    private Double price;
    //    메뉴별 클래스 생성해서 category 주석
//    private String category;

    public Pizza(int idx, String name, String description, Double price){
        super(idx, name, description, price);
        this.idx = idx;
        this.name = name;
        this.description = description;
        this.price = price;

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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public void getMenuToString() {
        System.out.println(getIdx() + ". " + getPrice() + " | " + getDescription() + " | " + getName());
    }
    }
