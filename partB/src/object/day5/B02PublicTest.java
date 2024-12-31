package object.day5;

public class B02PublicTest {

    public static void main(String[] args) {
        MyClass1 cls1=new MyClass1();
        Myclass2 cls2=new Myclass2();

        System.out.println("참조형 변수에 저장된 값 확인 ㅡㅡㅡㅡ");
        System.out.println(cls1);   // object.day5.MyClass1@28a418fc
        System.out.println(cls2);   // object.day5.Myclass2@5305068a

    }
}
