public class Drink extends Product {
    private int idx;
    private String name;
    private String description;
    private Double price;

    public Drink(int idx, String name, String description, Double price) {
        super(idx, name, description, price);
    }
    //    메뉴별 클래스 생성해서 category 주석
//    private String category;
}
