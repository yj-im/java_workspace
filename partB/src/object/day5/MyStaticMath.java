package object.day5;

// 자바의 Math 클래스처럼 static 한 구성을 갖도록 정의
public class MyStaticMath {

    String message;     // 인스턴스 변수
    public static int addValue(int a, int b){
        // message="hello";       static 메소드에서 인스턴스 변수는 접근 못해서 오류뜸.
        // static 메소드는 실행에 필요한 값을 실행(호출)할 때 전달 받음.
        return a+b;
    }
    
    public static int substractValue(int a, int b){
        return a-b;
    }

    public static int max(int a, int b){

        return substractValue(a, b) >0 ? a:b;       // a가 b보다크면 a 리턴
    }

    public static int min(int a, int b){
        return substractValue(a, b) > 0 ? b: a;     // a가 b보다크면 b 리턴
    }

}
