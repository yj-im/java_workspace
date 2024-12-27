package basic.day03;


// %d, %f
public class A16StringFormatEx {
    public static void main(String[] args) {
     int i=23;
     System.out.println("=== 정수 형식 %d (int, long) 테스트 ===");
     System.out.println("12345678901234567890");
     System.out.println(String.format("%d", i));   
     // 출력 자리수 5자리. 기본 정렬위치 오른쪽. 남는자리 공백표시
     System.out.println(String.format("%5d", i));  
     System.out.println(String.format("%-5d", i));   // 정렬위치 왼쪽으로 변경.
     System.out.println(String.format("%05d", i));   // 남는자리 0으로 표시

     double n =123.56789;
     System.out.println("=== 실수 형식 %f (float, double) 테스트 ===");
     System.out.println(3.4);
     System.out.println(n);
     System.out.println("서식 문자 %f 는 소수 아래 6자리");
     System.out.println("12345678901234567890");
     System.out.println(String.format("%f",3.4)); // 3.400000
     System.out.println(String.format("%.4f",n)); // 123.5679. (8이 반올림됨)
     System.out.println(String.format("%15f",n)); // 전체 자릿수가 15, 소수점 포함
     System.out.println(String.format("%15.2f",n)); // 전체 자릿수 15, 소수점 아래 2자리
     System.out.println(String.format("%015.2f",n)); // 전체 자릿수 15, 소수점 아래 2자리인데 공백 0붙임

     System.out.println(" === 큰 정수값 long 테스트 ===");
     long now = System.currentTimeMillis();
     System.out.println("12345678901234567890");
     System.out.println(now);
     System.out.println(String.format("%,20d", now)); // 3자리 구분 , 출력. 자릿수20에 , 갯수 포함됨.
    }
}
