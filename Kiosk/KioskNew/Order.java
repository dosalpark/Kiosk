package KioskNew;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Order {
    Product product = new Product();
    int wait = 0;

    public void showOrder(ArrayList<Food> orderList, Scanner scanner) {
//        int user = scanner.nextInt();
        if (orderList.isEmpty()) {
            System.out.println("장바구니가 비어있습니다.");
            product.menuFirst();
        } else {
            double sumPrice = 0.0;
            for (Food list : orderList) {
                System.out.println(list.toString());
            }
            for (Food list : orderList) {
                sumPrice += list.getPrice();
            }
            System.out.println("[TOTAL]");
            System.out.println(sumPrice + "원");
            buyOrder(scanner, orderList);
        }
    }
    public void buyOrder(Scanner scanner, ArrayList<Food> orderList){
        System.out.println("장바구니에 담긴 제품을 모두 구매하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
        int user = scanner.nextInt();
        if (user == 1){
            realEndSign(orderList);
        } else if(user == 2) {
            product.menuFirst();
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
    }

    public void end(ArrayList<Food> orderList){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e){
            System.out.println("error");
        }
        orderList.clear();
        product.menuFirst();
    }
    public void realEndSign(ArrayList<Food> orderList){
        wait ++;
            System.out.println("주문이 완료되었습니다!");
            System.out.println();
            System.out.println("대기번호는 [" + wait + "]번 입니다.");
            System.out.println("3초 후 메뉴판으로 돌아갑니다.");

        end(orderList);
    }
    public void removeCart(ArrayList<Food> orderList, Scanner scanner, Product product){
        System.out.println("진행하던 주문을 취소하시겠습니까?");
        System.out.println("1. 확인          2. 취소");
        int user = scanner.nextInt();
        if (user==1){
            System.out.println("장바구니를 초기화 합니다.");
            orderList.clear();
            System.out.println("감사합니다 안녕히가세요");
            product.menuFirst();
        } else if(user==2) {
            product.menuFirst();
        }
    }
}

