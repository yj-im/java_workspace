package object.day5;

public class B03MyMathTest {

    public static void main(String[] args) {
        
        MyMath myMath = new MyMath();
        myMath.first=234;
        myMath.second=456;
        System.out.println("더하기 = "+myMath.add());
        System.out.println("빼기 = "+myMath.substract());

        System.out.println("======== print 메소드 : type 값에 따라 +,-,* 중에서 연산 선택하고 출력======= ");
        myMath.print(1);    // 234+456=690
        myMath.print(2);    // 234-456=-222
        myMath.print(3);    // 234*456 = 106704 이런식으로 바로출력

        System.out.println("========메소드 호출할때 연산 선택하면 문자열 리턴====");
        System.out.println(myMath.mathToString(MyMath.ADD));
        System.out.println(myMath.mathToString(MyMath.SUB));
        System.out.println(myMath.mathToString(MyMath.MUL));

        System.out.println("==== 새로운 객체 생성 ====");
        MyMath myMath2=new MyMath();
        myMath2.first=9999;
        myMath2.second=23;
        System.out.println(myMath2.mathToString(MyMath.ADD));
        System.out.println(myMath2.mathToString(MyMath.SUB));
        System.out.println(myMath2.mathToString(MyMath.MUL));

        MyMath temp=new MyMath();   // first, second 필드값이 처음부터 0으로 저장.
        System.out.println("temp 더하기 = "+temp.add());    // 0
        System.out.println("temp 뺴기 = "+temp.substract());    // 0
    }
}
