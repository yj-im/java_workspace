package object.day5;

public class B01ObjectFieldTest {

    public static void main(String[] args) {
        // MyClass1 으로 객체를 생성함. : new 연산 사용. 인스턴스 변수임.
        // MyClass1() 객체를 만드는 메소드 (메모리 할당 받기) => 생성자
        MyClass1 cls1=new MyClass1();

        cls1.field1="hi";
        cls1.field2=23;

        System.out.println("cls1 필드(속성,프로퍼티)값 : "+cls1.field1);
        System.out.println("cls1 필드(속성,프로퍼티)값 : "+cls1.field2);

        MyClass1 cls2=new MyClass1();
        cls2.field1="안녕";
        cls2.field2=100;

        System.out.println("\ncls2 필드값 : "+cls2.field1);
        System.out.println("cls2 필드값 : "+cls2.field2);

        // static 변수기 떄문에 위의 인스턴스 변수와 다르게 객체 생성하지않고 바로 쓰기 가능.
        System.out.println("\nstatic 정적 변수 테스트");
        MyClass1.field3=3.1419;
        MyClass1.field4="static";
        System.out.println("static 필드 변수 값 : "+MyClass1.field3);   // 3.1419
        System.out.println("static 필드 변수 값 : "+MyClass1.field4);   // static

        // 결론 : static 변수의 값은 객체랑 상관이없음.
        System.out.println("\nstatic 필드 변수 값 : "+cls1.field3);     // 3.1419
        System.out.println("\nstatic 필드 변수 값 : "+cls2.field3);     // 3.1419

        System.out.println("static 필드 변수 값 : "+cls1.field4);       // static
        System.out.println("static 필드 변수 값 : "+cls2.field4);       // static

    }


    // 자바에서 데이터를 저장하는 메모리 영역 구분
    // 1. static 저장 영역 (method 영역) - 공유 영역
    // 2. 객체 저장 영역 (heap 영역)    >> cls1 가 가리키는 객체는 heap 영역    
    //                                  >> 배열자체는 heap영역에 저장
    // 3. 기본형 변수값, 참조형 변수의 주소값 영역(stack)  >> cls1의 주소값은 stack영역 
    //                                                     >> 배열의 주소값은 stack에 저장
}
