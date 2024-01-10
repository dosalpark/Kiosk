package KioskNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Product {
    Scanner scanner = new Scanner(System.in);


    public void pickPizza(ArrayList<Food> orderList, Product product){
        int user = scanner.nextInt();
        if (user == 1){
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(1, "치즈피자","치즈피자입니다.", 10000.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
//            for (Food list : orderList) {
//                System.out.println(list.toString());
//            }
        } else if (user == 2) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(2, "옥수수피자","옥수수피자입니다.", 11000.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else if (user == 3) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(3, "페퍼로니피자","페퍼로니피자입니다.", 12000.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else if (user == 4) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(4, "콤비네이션피자","콤비네이션피자입니다.", 12000.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else  {
            System.out.println("잘못입력하셨습니다");
            menuFirst();
        }
    }
    public void pickSource(ArrayList<Food> orderList, Product product){
        int user = scanner.nextInt();
        if (user == 1){
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(1, "핫소스","핫소스입니다.", 300.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
//            for (Food list : orderList) {
//                System.out.println(list.toString());
//            }
        } else if (user == 2) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(2, "파마산치즈","파마산치즈입니다.", 200.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else if (user == 3) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(3, "갈락디핑소스","갈락디핑소스입니다.", 500.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else  {
            System.out.println("잘못입력하셨습니다");
            menuFirst();
        }
    }
    public void pickSide(ArrayList<Food> orderList, Product product){
        int user = scanner.nextInt();
        if (user == 1){
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(1, "윙","윙입니다.", 8000.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
//            for (Food list : orderList) {
//                System.out.println(list.toString());
//            }
        } else if (user == 2) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(2, "봉","봉입니다.", 9000.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else if (user == 3) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(3, "치즈스틱","치즈스틱입니다.", 5000.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else if (user == 4) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(4, "감자튀김","감자튀김입니다.", 4000.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else  {
            System.out.println("잘못입력하셨습니다");
            menuFirst();
        }
    }
    public void pickDrink(ArrayList<Food> orderList, Product product){
        int user = scanner.nextInt();
        if (user == 1){
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(1, "콜라","콜라입니다.", 1600.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
//            for (Food list : orderList) {
//                System.out.println(list.toString());
//            }
        } else if (user == 2) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(2, "제로콜라","제로콜라입니다.", 1800.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else if (user == 3) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(3, "사이다","사이다입니다.", 1600.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else if (user == 4) {
            product.insertCart(orderList, product);
            user = scanner.nextInt();
            switch (user) {
                case 1:
                    orderList.add(new Food(4, "제로사이다","제로사이다입니다.", 1800.0));
                    insertAd();
                    product.menuFirst();
                    break;
                case 2:
                    System.out.println("초기화면으로돌아갑니다.");
                    product.menuFirst();
                    break;
                default:
                    System.out.println("잘못입력하셨습니다.");
                    product.menuFirst();
                    break;
            }
        } else  {
            System.out.println("잘못입력하셨습니다");
            menuFirst();
        }
    }
    public void insertCart(ArrayList<Food> orderList, Product product) {
        String name = "";
        for (Food food1 : orderList) {
            name = food1.getName();
        }
        System.out.println(name + "를 장바구니에 추가하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
    }
    public void insertAd(){
        System.out.println("장바구니에 추가되었습니다.");
    }


    public void menuFirst() {
        System.out.println("============================================");
        System.out.println("pizza zip 에 오신걸 환영합니다.");
        System.out.println("아래 메뉴판을 보시고 메뉴를 골라 입력해주세요.");
        System.out.println("============================================");
        System.out.println("1. Pizza              | 피자 입니다.");
        System.out.println("2. Source             | 소스 입니다.");
        System.out.println("3. Side               | 사이드 입니다.");
        System.out.println("4. Drink              | 음료 입니다.");
        System.out.println("============================================");
        System.out.println("5. 주문");
        System.out.println("6. 취소");

    }
    public void menuPizza() {
        System.out.println("[1. Pizza ]");
        System.out.println("=====================================================");
        System.out.println("1. 치즈피자        치즈피자 입니다.           10000.0");
        System.out.println("2. 옥수수피자      옥수수피자 입니다.          11000.0");
        System.out.println("3. 페퍼로니피자     페퍼로니피자 입니다.        12000.0");
        System.out.println("4. 콤비네이션피자   콤비네이션피자 입니다.       12000.0");
        System.out.println("=====================================================");
        System.out.println("담으실 메뉴를 선택해주세요. ");
    }
    public void menuPizzaTest(ArrayList<Food> orderlist, Food food) {
        System.out.println("=====================================================");
        int idx = 0;
        String name = "";
        String description = "";
        double price =0.0;
        System.out.println("[1. Pizza ]");
        for (Food list : orderlist) {
            idx = list.getIdx();
            name = list.getName();
            description = list.getDescription();
            price = list.getPrice();
            food.selectFood(idx,name,description,price);
        }
        System.out.println("=====================================================");
        System.out.println("담으실 메뉴를 선택해주세요. ");
//        System.out.println("1. 치즈피자        치즈피자 입니다.           10000.0");
//        System.out.println("2. 옥수수피자      옥수수피자 입니다.          11000.0");
//        System.out.println("3. 페퍼로니피자     페퍼로니피자 입니다.        12000.0");
//        System.out.println("4. 콤비네이션피자   콤비네이션피자 입니다.       12000.0");

    }
    public void menuSource() {
        System.out.println("[2. Source ]");
        System.out.println("=====================================================");
        System.out.println("1. 핫소스             핫소스입니다.                300.0");
        System.out.println("2. 파마산치즈        파마산치즈입니다.          200.0");
        System.out.println("3. 갈릭디핑소스     갈릭디핑소스입니다.        500.0");
        System.out.println("=====================================================");
        System.out.println("담으실 메뉴를 선택해주세요.");
    }
    public void menuSide() {
        System.out.println("[3. Side ]");
        System.out.println("=====================================================");
        System.out.println("1. 윙               윙입니다.             8000.0");
        System.out.println("2. 봉       	    봉입니다.             9000.0");
        System.out.println("3. 치즈스틱 	        치즈스틱입니다.        5000.0");
        System.out.println("3. 감자튀김	        감자튀김입니다.        4000.0");
        System.out.println("=====================================================");
        System.out.println("담으실 메뉴를 선택해주세요.");
    }
    public void menuDrink() {
        System.out.println("[4. Drink ]");
        System.out.println("=====================================================");
        System.out.println("1. 콜라          콜라입니다.              1600.0");
        System.out.println("2. 제로콜라        제로콜라입니다.          1800.0");
        System.out.println("3. 사이다         사이다입니다.            1600.0");
        System.out.println("4. 제로사이다      제로사이다입니다.         1800.0");
        System.out.println("=====================================================");
        System.out.println("담으실 메뉴를 선택해주세요.");
    }
}
