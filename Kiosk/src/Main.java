public class Main {
    public static void main(String[] args) {
//        프로그램이 false일때 실행. 프로그램 종료하려면 true로 변경
        boolean program = false;
        //프로그램 실행
        if (!program) {
            //초기 메뉴판 출력
            Product.firstMenu();
            //메뉴 선택 시작
            Product.start();
        }
    }
}