import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Product{
    //필드설정
    private static String name;
    private String description;
    private String category;
    private Double price;

    //초기메뉴 함수
    public static void firstMenu(){
        System.out.println("pizza zip 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.\n");
        System.out.println("1. Pizza              | 피자 입니다.");
        System.out.println("2. Source             | 소스 입니다.");
        System.out.println("3. Side               | 사이드 입니다.");
        System.out.println("4. Drink              | 음료 입니다.");
        System.out.println("============================================");
        System.out.println("5. 주문");
        System.out.println("6. 취소");
        System.out.println("이동하실 메뉴를 선택 해 주세요.");
    }

    //처음 시작할때 함수 작성
    public static boolean start() {
        //item입력
        List<Product> pizza = Arrays.asList(new Product("치즈피자", "치즈피자입니다.", "pizza",10000.0));
//        List<String> source = new ArrayList<>();
//        pizza.add("치즈피자/치즈피자입니다.10000.0");
//        pizza.add("옥수수피자/옥수수피자입니다.11000.0");
//        pizza.add("페퍼로니피자/페퍼로니피자입니다.12000.0");
//        pizza.add("콤비네이션피자/콤비네이션피자입니다.12000.0");
        List<Product> source = Arrays.asList(new Product("핫소스", "핫소스입니다.", "sourece",300.0));
//        List<String> source = new ArrayList<>();
//        source.add("핫소스/핫소스입니다.300.0");
//        source.add("파마산치즈/파마산치즈입니다.200.0");
//        source.add("갈릭디핑/갈릭디핑입니다.500.0");
        List<Product> side = Arrays.asList(new Product("윙", "윙입니다.", "side",300.0));
//        List<String> side = new ArrayList<>();
//        side.add("윙/윙입니다..8000.0");
//        side.add("봉/봉입니다..9000.0");
//        side.add("치즈스틱/치즈스틱입니다.5000.0");
//        side.add("감자튀김/감자튀김입니다.4000.0");
        List<Product> drink = Arrays.asList(new Product("콜라", "콜라입니다.", "drink",1600.0));
//        List<String> drink = new ArrayList<>();
//        drink.add("콜라/콜라입니다.1600.0");
//        drink.add("제로콜라/제로콜라입니다.1800.0");
//        drink.add("사이다/사이다입니다.1600.0");
//        drink.add("환타/환타입니다.1500.0");
        //시작하면 메뉴판 띄움
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        // 1. 1234메뉴 56담기 취소
        // 2. 1234눌렀을때 메뉴 보여주기
        // 3. 6번 눌를때 처음화면으로 이동하기
        // 4. 5번 눌를때 장바구니를 만들어서 담기
        switch(user) {
            case "1":
                System.out.println("[1. Pizza              | 피자 입니다.]");
                //메뉴를 나눠서 출력해야함. 그래야 장바구니를 담지.. "치즈피자","치즈피자입니다.","10000.0"
                for (int i = 0; i < pizza.size(); i++){
                    System.out.println(pizza.get(i));
                }
                System.out.println("담으실 메뉴를 선택해주세요.");
                user = scanner.nextLine();
                //장바구니 추가 로직 생성
                break;
//            case "2":
//                System.out.println("[2. Source             | 소스 입니다.]");
//                for (int i = 0; i < source.size(); i++){
//                    System.out.println(source.get(i));
//                }
//                System.out.println("담으실 메뉴를 선택해주세요.");
//                user = scanner.nextLine();
//                break;
//            case "3":
//                System.out.println("[3. Side               | 사이드 입니다.]");
//                for (int i = 0; i < side.size(); i++){
//                    System.out.println(side.get(i));
//                }
//                System.out.println("담으실 메뉴를 선택해주세요.");
//                user = scanner.nextLine();
//                break;
//            case "4":
//                System.out.println("[4. Drink              | 음료 입니다.]");
//                for (int i = 0; i < drink.size(); i++){
//                    System.out.println(drink.get(i));
//                }
//                System.out.println("담으실 메뉴를 선택해주세요.");
//                user = scanner.nextLine();
//                break;
            case "5" :
                //장바구니 확인 로직
            case "6" :
                //취소로직 취소 후 return값 ture로 줘서 종료
                System.out.println("장바구니를 초기화 합니다.");
                return true;
            default:
                //초기화면 출력
                System.out.println("1-6번중에 입력해주세요.");
                firstMenu();
        }
        return true;
    }



    //메소드설정
    public Product (String name, String description, String category, Double price) {
        this.name=name;
        this.description=description;
        this.category=category;
        this.price=price;
    }

    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public String getCategory(){
        return category;
    }
    public Double getPrice(){
        return price;
    }
}
