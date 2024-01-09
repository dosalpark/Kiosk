package KioskNew;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Kiosk {

    public static void main(String[] args) {
        ArrayList<Food> orderList = new ArrayList<>();
        Product product = new Product();
        Food food = new Food();
        Order order = new Order();
        Scanner scanner = new Scanner(System.in);

//        int user = scanner.nextInt();
//        if (user == 1) {
//            orderList.add(new Food(1, "치즈피자", "치즈피자입니다.", 10000.0));
//            product.insertCart(orderList, product, scanner);
//            user = scanner.nextInt();
//            while (user != 9){
//                orderList.add(new Food(1, "치즈피자","치즈피자입니다.", 10000.0));
//                product.insertCart(orderList, product, scanner);
//                user = scanner.nextInt();
//            }
//            product.menuFirst();
//            for (Food list : orderList) {
//                System.out.println(list.toString());
//            }


        //시작버튼
        product.menuFirst();
        while (true) {
            int user = scanner.nextInt();
            switch (user) {
                case 1:
                    product.menuPizza();
                    product.pickPizza(orderList, product);
                    break;
                case 2:
                    product.menuSource();
                    product.pickSource(orderList, product);
                    break;
                case 3:
                    product.menuSide();
                    product.pickSide(orderList, product);
                    break;
                case 4:
                    product.menuDrink();
                    product.pickDrink(orderList, product);
                    break;
                case 5:
                    order.showOrder(orderList, scanner);
                    break;
                case 6:
                    order.removeCart(orderList, scanner, product); //완료
                    break;
                default:
                    System.out.println("다시 입력해주세요.");
            }
        }
    }
}


