package object.day5;

public class B04MyStaticMathTest {

    public static void main(String[] args) {
        // static 메소드 테스트
        
        int a = 456;
        int b = 234;
        int result;

        result=MyStaticMath.addValue(a, b);
        System.out.println("더하기 = "+result);

        result=MyStaticMath.substractValue(a, b);
        System.out.println("빼기 = "+result);

        result=MyStaticMath.max(a, b);
        System.out.println("최대값 = "+result);

        result=MyStaticMath.min(a, b);
        System.out.println("최소값 = "+result);


    }
}
