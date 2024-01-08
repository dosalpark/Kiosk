public class Product extends Menu{
    //필드설정
    private String category;
    private Double price;

    //메소드설정
    public Product (String name, String description, String category, Double price) {
        super.name=name;
        super.description=description;
        this.category=category;
        this.price=price;
    }

    public String getName(){
        return super.name;
    }
    public String getDescription(){
        return super.description;
    }
    public String getCategory(){
        return category;
    }
    public Double getPrice(){
        return price;
    }
}
