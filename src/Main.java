import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("숫자를 입력 해주세요");

        int choice = scanner.nextInt();


        switch (choice) {
            case 1 : System.out.println("월요일");
                break;

            case 2 : System.out.println("화요일");
                break;

            case 3 :System.out.println("수요일");
                break;

            case 4 : System.out.println("목요일");
                break;

            case 5 : System.out.println("금요일");
                break;

            case 6 : System.out.println("토요일");
                break;

            case 7 : System.out.println("일요일");
                break;

                default : System.out.println("다시 입력 해주세요");


        }
    }
}