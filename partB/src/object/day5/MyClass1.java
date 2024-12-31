package object.day5;

// 클래스 정의 기본 : 변수
public class MyClass1 {

    // 인스턴스 속성(변수) : '객체를 생성'하여 접근하는 변수. MyClass1이 원본이고 원본을 바탕으로 복사본 하나 만든다
    //                     : '객체를 생성'할 때마다 다른 값을 저장.
    //  heap 영역.
    // 클래스는 퍼블릭이지만 접근 권한은 디폴트임.
   String field1;
   int field2;

   // static 속성(변수) 붙어있으면 클래스 이름으로 접근하는 변수. 정적 변수
   //                      : 객체를 생성하지 않고 사용하는 변수. 객체와 상관없이 같은 값을 저장. 
   // 메소드 영역.
   static double field3;
   static String field4;

   // final 키워드 : 값을 변경할 수 없는 변수. 초기값을 반드시 저장해야함.
   // static final이랑 같이 붙어있으면 : 상수라고 부름(보통 대문자로 표기) 자바스크립트의 const와 같은 성질.
   public static final int TEST_VALUE=1234;
}
// public 이 아닌 것은 default 접근 클래스
// -> 같은 패키지에서만 사용하는 클래스

class Myclass2{
    String name;
    int age;

    static int type;
}


