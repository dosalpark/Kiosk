import java.util.*;
import java.util.ArrayList;

public class Product{
    //필드설정
    private int idx;
    private String name;
    private String description;
    private Double price;
    //    메뉴별 클래스 생성해서 category 주석
//    private String category;



    List<Product> product = new ArrayList<>();
    static List<Pizza> pizzaList = new ArrayList<>();
    List<Drink> drinkList = new ArrayList<>();
    List<Side> sideList = new ArrayList<>();
    List<Source> sourceList = new ArrayList<>();




    //초기메뉴 함수
    public static void firstMenu(){
        //item생성
        pizzaList.add(new Pizza(1,"치즈피자","치즈피자입니다.",10.0));
        pizzaList.add(new Pizza(2,"옥수수피자","옥수수피자입니다.",11.0));
        pizzaList.add(new Pizza(3,"페퍼로니피자","페퍼로니피자입니다.",12.0));
        pizzaList.add(new Pizza(4,"콤비네이션피자","콤비네이션피자입니다.",12.0));




        System.out.println("============================================");
        System.out.println("pizza zip 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("============================================");
        System.out.println("1. Food              | 피자 입니다.");
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
        //시작하면 메뉴판 띄움
        Scanner scanner = new Scanner(System.in);
        String user = scanner.nextLine();
        //string -> int 변환용
        int i = 0;
        // 1. 1234메뉴 56담기 취소
        // 2. 1234눌렀을때 메뉴 보여주기
        // 3. 6번 눌를때 처음화면으로 이동하기
        // 4. 5번 눌를때 장바구니를 만들어서 담기
        switch(user) {
            case "1":
                // 메뉴 출력
                System.out.println("[1. Food ]");
                System.out.println("=====================================================");
                System.out.println("1. 치즈피자        치즈피자 입니다.           10000.0");
                System.out.println("2. 옥수수피자      옥수수피자 입니다.          11000.0");
                System.out.println("3. 페퍼로니피자     페퍼로니피자 입니다.        12000.0");
                System.out.println("4. 콤비네이션피자   콤비네이션피자 입니다.       12000.0");
                System.out.println("=====================================================");
                System.out.println("담으실 메뉴를 선택해주세요. 이전으로 돌아가실려면 9번을 입력해주세요.");
                //유저한테 값 입력받고 -1
                user = scanner.nextLine();
                i = Integer.parseInt(user)-1;
                //"0" 입력시 이전으로 돌아감. 아닐시 디테일메뉴판 입장
                while (!(user.equals("9"))) {

                    //유저가 0을 입력하지 않았을때는 장바구니에 추가
                    //위에서 고른 메뉴 장바구니에 추가하면서 메세지 출력
//                  //장바구니 담는 로직
                    getPizzaOrder(i);
                    System.out.println(pizzaList.get(i));
                    System.out.println("장바구니에 추가되었습니다.");
                    System.out.println("더 주문하시려면 상품번호를, 이전화면으로 돌아가실려면 9번을 눌러주세요.");

                    //유저 입력값을 다시 받음
                    user = scanner.nextLine();

                    if (user.equals("9")) {
                        System.out.println("이전 메뉴로 돌아갑니다.");
                        firstMenu();
                        start();
                        break;
                    } else if (!(user.equals("9"))) {
                        //장바구니 입력
                    }
                }
                break;
            case "2":
                System.out.println("[2. Source ]");
                System.out.println("=====================================================");
                System.out.println("1. 핫소스             핫소스입니다.                300.0");
                System.out.println("2. 파마산치즈        파마산치즈입니다.          200.0");
                System.out.println("3. 갈릭디핑소스     갈릭디핑소스입니다.        500.0");
                System.out.println("=====================================================");
                System.out.println("담으실 메뉴를 선택해주세요. 이전으로 돌아가실려면 9번을 입력해주세요.");
                user = scanner.nextLine();
                i = Integer.parseInt(user)-1;
                //"0" 입력시 이전으로 돌아감. 아닐시 디테일메뉴판 입장
                while (!(user.equals("9"))) {

                    //유저가 0을 입력하지 않았을때는 장바구니에 추가
                    //위에서 고른 메뉴 장바구니에 추가하면서 메세지 출력
//                  //장바구니 담는 로직
                    System.out.println("장바구니에 추가되었습니다.");
                    System.out.println("더 주문하시려면 상품번호를, 이전화면으로 돌아가실려면 9번을 눌러주세요.");

                    //유저 입력값을 다시 받음
                    user = scanner.nextLine();

                    if (user.equals("9")) {
                        System.out.println("이전 메뉴로 돌아갑니다.");
                        firstMenu();
                        start();
                        break;
                    } else if (!(user.equals("9"))) {
                        //장바구니 입력
                    }
                }
                break;
            case "3":
                System.out.println("[3. Side ]");
                System.out.println("=====================================================");
                System.out.println("1. 윙               윙입니다.             8000.0");
                System.out.println("2. 봉       	    봉입니다.             9000.0");
                System.out.println("3. 치즈스틱 	        치즈스틱입니다.        5000.0");
                System.out.println("3. 감자튀김	        감자튀김입니다.        4000.0");
                System.out.println("=====================================================");
                System.out.println("담으실 메뉴를 선택해주세요. 이전으로 돌아가실려면 9번을 입력해주세요.");
                user = scanner.nextLine();
                i = Integer.parseInt(user)-1;
                //"0" 입력시 이전으로 돌아감. 아닐시 디테일메뉴판 입장
                while (!(user.equals("9"))) {

                    //유저가 0을 입력하지 않았을때는 장바구니에 추가
                    //위에서 고른 메뉴 장바구니에 추가하면서 메세지 출력
    //                 //장바구니 담는 로직
                    System.out.println("장바구니에 추가되었습니다.");
                    System.out.println("더 주문하시려면 상품번호를, 이전화면으로 돌아가실려면 9번을 눌러주세요.");

                    //유저 입력값을 다시 받음
                    user = scanner.nextLine();

                    if (user.equals("9")) {
                        System.out.println("이전 메뉴로 돌아갑니다.");
                        firstMenu();
                        start();
                        break;
                    } else if (!(user.equals("9"))) {
                        //장바구니 입력
                    }
                }
                break;
            case "4":
                // 메뉴 출력
                System.out.println("[4. Drink ]");
                System.out.println("=====================================================");
                System.out.println("1. 콜라          콜라입니다.              1600.0");
                System.out.println("2. 제로콜라        제로콜라입니다.          1800.0");
                System.out.println("3. 사이다         사이다입니다.            1600.0");
                System.out.println("4. 제로사이다      제로사이다입니다.         1800.0");
                System.out.println("=====================================================");
                System.out.println("담으실 메뉴를 선택해주세요. 이전으로 돌아가실려면 9번을 입력해주세요.");
                //유저한테 값 입력받고 -1
                user = scanner.nextLine();
                i = Integer.parseInt(user)-1;
                //"0" 입력시 이전으로 돌아감. 아닐시 디테일메뉴판 입장
                while (!(user.equals("9"))) {

                    //유저가 0을 입력하지 않았을때는 장바구니에 추가
                    //위에서 고른 메뉴 장바구니에 추가하면서 메세지 출력
//                  //장바구니 담는 로직
                    System.out.println("장바구니에 추가되었습니다.");
                    System.out.println("더 주문하시려면 상품번호를, 이전화면으로 돌아가실려면 9번을 눌러주세요.");

                    //유저 입력값을 다시 받음
                    user = scanner.nextLine();

                    if (user.equals("9")) {
                        System.out.println("이전 메뉴로 돌아갑니다.");
                        firstMenu();
                        start();
                        break;
                    } else if (!(user.equals("9"))) {
                        //장바구니 입력
                    }
                }
                break;
            case "5" :
//                장바구니 확인 로직
//                for (int i = 0; i < order.size(); i++ ) {
//                    order.get(i);
//                }
                break;
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

    //장바구니 정산
    public static void ord() {
        //담을 리스트 생성
        System.out.println("ord 출력 테스트");
    }

//    public int getPizzaIdx(int idx){
//        return Food.getIdx();
//    }

    public static void getPizzaOrder(int i){
        System.out.println(pizzaList + "이 장바구니에 추가되었습니다.");
    }




    //메소드설정
    public Product (int idx,String name, String description, Double price) {
        this.idx=idx;
        this.name=name;
        this.description=description;
        this.price=price;
    }

}
