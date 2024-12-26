package basic.day02;

public class A11StringEquals {

    // 문자열의 비교
    // 1) == 기호는 저장된 주소를 비교함.
    // 2) equals 메소드는 저장된 내용 비교.

    public static void main(String[] args) {
        
         // 문자열의 내용이 같은지 비교
        System.out.println(3>0);
        boolean test = (3==3);  // 경고 이유 : 리터럴끼리 비교
        System.out.println(test);
        test = (3!=3);
        System.out.println(test);

        // '문자열 내용 비교'에 == 사용 안함. == 는 주소 비교.
        System.out.println("문자열 주소 동등 비교 : "+("Hello"=="Hello"));
        String name = "Java";   // name 변수는 문자열의 주소를 저장
        String title = "Java";  // title 변수도 문자열의 주소를 저장
        System.out.println(name==title);    // name 과 title 의 주소가 같음

        // 결론 : 자바는 문자열 리터럴의 내용이 같으면 메모리에 두번 저장하지 않음. 

        // 새롭게 메모리를 할당 받아서 "Java" 문자열을 저장.
        String lesson = new String("Java");
        System.out.println(lesson==title);  // lesson 과 title 의 주소가 다름

        // 문자열의 내용 비교 메소드
        System.out.println(lesson.equals(title));

        // 문자열 비교는 대부분 내용비교임. equals 메소드 중요함.

        // 문자열의 길이가 0이면 참 길이가 있으면 거짓으로 리턴.
        System.out.println("isEmpty : " + "  ".isEmpty());  // false
        System.out.println("isEmpty : " + "".isEmpty());  // true

        // 문자열의 내용이 공백이면 참 내용이 있으면 false
        System.out.println("isBlank : " + "  ".isBlank());  // true
        System.out.println("isBlank : " + "".isBlank());  // true

    }
}
