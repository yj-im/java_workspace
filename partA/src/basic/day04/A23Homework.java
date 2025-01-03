package basic.day04;
import java.util.Scanner;

public class A23Homework {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("아이디 입력하세요");
            String gmail_id = sc.nextLine();

            if (isValid(gmail_id)) {
                System.out.println("아이디 입력확인");
                break;
            } else {
                System.out.println("다시입력하세요");
            }
        }
        sc.close();
    }

    public static boolean isValid(String gmail_id) {
        if (gmail_id == null || gmail_id.isEmpty()) { // null 또는 빈 문자열 검사 추가
            return false;
        }

        char firstChar = gmail_id.charAt(0);
        if (!((firstChar >= 'A' && firstChar <= 'Z') || (firstChar >= 'a' && firstChar <= 'z') || (firstChar >= '0' && firstChar <= '9'))) {
            return false; // 첫 글자가 영문자 또는 숫자가 아니면 false
        }

        if (gmail_id.endsWith(".")) { // 마지막 글자가 "."인지 확인
            return false;
        }

        if (gmail_id.contains("..")) { // ".."이 포함되어 있는지 확인
            return false;
        }


        for(int i=0; i<gmail_id.length(); i++){
            char c = gmail_id.charAt(i);
            if(!Character.isLetterOrDigit(c) && c!='.'){
                return false;
            }
        }


        return true; // 모든 조건을 만족하면 true
    }
}
