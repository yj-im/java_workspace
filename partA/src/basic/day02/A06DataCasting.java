package basic.day02;

// 캐스팅 (casting) : 데이터의 형식이 변환
//       ㄴ 강제 캐스팅 : 변수 앞에 () 기호에 바꾸려는 데이터 타입 키워드
// 데이터의 범위를 순서대로 나열 : byte < short < int < long < float < double
//       ㄴ 자동 캐스팅 : 텀블러 용량 350ml, 구입한 커피 200ml  
public class A06DataCasting {

    public static void main(String[] args) {

        // 정수를 예시로 들면 정수는 기본타입이 int. 23은 둘다 int
        int a = 23;
        long b = 23;       // 자동 캐스팅 (int 가 long 으로)

        // 정수 int 의 가장 마지막 값 : 2147483647
        //                  2147483648 은 int에 저장 못함. (오버플로우)
        
        long lnum=2147483648L;
        // int 범위를 넘어가는 정수는 long 저장을 위해 리터럴 기호 L(l) 표기.

        // 실수를 예시로 들면 실수는 기본 타입이 double.
        double d1=3.1419;
        float f1=3.1419F;
        // 실수는 기본 타입이 double. float 으로 저장하려면 리터럴 기호 F(f) 표기. 

        // 정수와 실수의 관계
        float f2=23;
        double d2=23;
        double d3=2147483648L;

        // d1 을 a 라는 int 변수에 저장하고 출력하기 : 강제 캐스팅.
        a=(int)d1;  // 강제캐스팅
        System.out.println("d1 의 값 3.1419를 int로 하면 : "+ a );
        // 강제 캐스팅은 데이터의 손실이 발생할 수 있음

    }   // 이 소스파일은 실행하지 않은 것은 데이터 저장 대입문 오류 여부 확인함.

    // 대입문 : 오른쪽의 값 (수식,변수)을 왼쪽 메모리에 저장.

}
