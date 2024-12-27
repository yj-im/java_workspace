package basic.day03;

// 문자열은 "" 기호 안에 작성. 문자열은 길이(length)에 제한이 없다.
// 문자(Character) 는 '' 기호 안에 작성. 꼭 1개의 문자를 표기. 
// char 키워드로 타입 지정. 
// 
public class A17CharTest {

    public static void main(String[] args) {
   
        char test_ch='a';
        // 서식문자 %c 또는 %s 사용 가능.
        System.out.println(String.format("테스트 문자 : %c, %s", test_ch, test_ch));
        
        System.out.println("char 타입 변수 증감 연산자 테스트");
        System.out.println(test_ch++);  // a 출력. test_ch = b
        System.out.println(test_ch++);  // b 출력. test_ch = c
        System.out.println(test_ch++);  // c 출력. test_ch = d

        System.out.println(--test_ch);  // c 출력. test_ch = c
        System.out.println(--test_ch);  // b 출력. test_ch = b
        System.out.println(--test_ch);  // a 출력. test_ch = a
        // char 타입으로 실행할 수 있는 산술연산은 ++ 또는 -- 
        // + 와 - 는 정수와 실수로만 할 수 있음.

        ///////////////////////////////////////////////////////////////
        // 문자는 이진수값을 만드는 체계에 따라 여러가지 인코딩 방식이 있음. 현재는 UTF-8 인코딩 방식 사용.
        // char를 int로 타입 변환하면 코드값을 저장.

        // int code = (int)test_ch;    강제캐스팅
        int code = test_ch;     // 자동 캐스팅도 가능 char값이 int값 안에 들어가니까
        System.out.println(code);  // 97('a')의 인코딩값, 98('b') 99('c')
       
        // char 타입으로 할수없는 연산 +=, -=, +, - . int 타입으로 바꿔준 후 연산 실행
        code +=2;   //99
        System.out.println(code);

        System.out.println(" - code 값 출력 - ");
        System.out.println(String.format("%d", code));  // 정수형 99로 출력
        System.out.println(String.format("%c", code));  // 문자 c로출력

        char ga = '가';
        char hit ='힣';
        int code_ga = ga;
        int code_hit = hit;
        //각각의 코드값을 구하시오. 가~힣 사이에 몇개의 문자가 있는지 뺼셈으로 구하시오
        System.out.println(code_ga);
        System.out.println(code_hit);
        System.out.println("한글 음절의 개수");
        System.out.println(code_hit-code_ga+1);
        
        System.out.println(String.format("가 = %d, %x", code_ga, code_ga));   //ac00
        System.out.println(String.format("힣 = %d, %x", code_hit, code_hit)); //d7a3
        
        // 정수 코드값 50000는 무슨글자?
        System.out.println(String.format("%c", 50000));
        int some =50000;
        char some_code=(char)some;  // 강제 캐스팅
        System.out.println(some_code);
    }
}
