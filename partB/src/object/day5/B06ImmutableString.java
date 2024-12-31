package object.day5;

// 3, 3.14, 'a', "hello" 값은 불변값 (자바스크립트 등 일반적 언어)
// 우리가 바꿀수 있는건 메모리의 변수에 저장된 값.
public class B06ImmutableString {

    // 자바에서는 문자열이 String 클래스 타입. => 불변성을 갖는 객체.

    public static void main(String[] args) {
        
        String message = "Hello";
        System.out.println("message 변수의 주소 참조값");
        System.out.println(Integer.toHexString(message.hashCode()));

        message += "java";
        System.out.println("message 변수의 주소 참조값");
        System.out.println(Integer.toHexString(message.hashCode()));

        // message 변수가 저장한 주소 참조값이 java를 추가함으로써 변경됨. => 저장된 메모리 위치 변경.
        // 한번 저장된 문자열이 연산으로 바뀌면 같은주소에서 변경안되고 다른데로 저장됨.
        // => 불변성
        
        System.out.println("이름 : "+"홍길동"+" , 나이 : "+23);

        // 1) + 연산 대체 다른 방법 첫번째.
        System.out.println(String.format("이름 : %s, 나이 : %d", "홍길동",23));

        // 2) + 연산 대체 다른 방법 두번째 - 문자열 추가를 반복할때
        System.out.println("===== 값이 변할수 있는 객체 사용 =====");
        StringBuilder sb=new StringBuilder();
        for(int i=0; i<4; i++){
            sb.append("Hello");     // 문자열 연결 + 연산과 동일.
            System.out.println(Integer.toHexString(sb.hashCode()));
        }
        System.out.println(sb);
        System.out.println(sb.toString());
    }
}
