package basic.day02;

// 문자열 저장 및 활용 : 자바에서 문자열은 String 클래스 타입임.
//                                  ㄴ 참조타입 변수 (그림 참고)
// int, long, double, boolean 등은 기본형(primitive) 데이터 타입.
public class A10StringTest {

    public static void main(String[] args) {
        // 문자열을 저장하기 위한 변수 선언
        String message = "Hello~ Java. 자바";

        System.out.println(message);
        // 문자열의 길이 : 문자 갯수
        // 메소드의 인자 없음. 리턴 있음
        System.out.println(message.length());
        System.out.println(message.toUpperCase());
        // 소문자로 변환하는 것은 toLowerCase()

        // 메소드의 인자 있음. 리턴 있음
        System.out.println(message.charAt(4));
        System.out.println(message.indexOf("Java"));
        
        // 2개의 문자열을 연결하기.
        String result = message.concat("👩🏻👨🏻");
        System.out.println(result);
        System.out.println(result.length());
        // 이모지는 3~4 바이트를 사용. 자바에서 2바이트까지 

        // 인덱스 3부터 끝까지
        message.substring(3);
        System.out.println(message.substring(3));

        // 7은 안들어감
        message.substring(3,7);
        System.out.println(message.substring(3,7));

        message.replace(" ", "**");
        System.out.println(message.replace(" ", "**"));

        // 대소문자 구분함.
        message.startsWith("Hello");
        System.out.println(message.startsWith("Hello"));

        message.endsWith("Hello");
        System.out.println(message.endsWith("Hello"));

        // 마지막 매칭되는 문자열의 위치
        message.lastIndexOf(" ");
        System.out.println(message.lastIndexOf(" "));

        System.out.println("-----------------------------");

       
    }
}
