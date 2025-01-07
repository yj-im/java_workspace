package basic.day04;

// 자바의 메소드 오버로딩 (overloading)
// 다른 형식(인자의 개수와 타입)의 데이터를 인자로 받아 동일한 연산을 수행하는 메소드의 이름은 같아도 됨.
public class A27MethodOverloading {

    public static void main(String[] args) {
        
        print("연습입니다.");
        print();
        // print(3);  print(3)에 맞는게 없어서 오류.
        print(3,3);

        // div 메소드 : 정수 / 정수 = 정수 , 실수 / 실수 = 실수
       
        System.out.println(div(5,3));
        System.out.println(div(5.0,3.0));
    }

    public static void print(String test){
        System.out.println("문자열 : "+test);
    }
    public static void print(){
        System.out.println("인자가 없는 print");
    }
    public static void print(int test, double dtest){
        System.out.println("정수 : "+test+"실수 : "+test);
    }
    public static int div(int a, int b){
        return a/b;
        
    }
    public static double div(double a, double b){
        return a/b;
    }

    // 파라미터가 없는 (파라미터 갯수와 형식이 동일한) print는 2개 존재 할 수 없음.
    //  -> 오류
    // public static int print(){
    //     return 0;
    // }
}
