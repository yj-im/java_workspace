package object.day10;



public class B32LambdaTest {

    public static void main(String[] args) {
        
        // 원래이런식으로 인터페이스 익명클래스로 정의 하는데
        TestFunction test1=new TestFunction() {
            @Override
            public void execute() {
                System.out.println("테스트 중 ....");
            }
        };
        // 메소드 실행
        test1.execute();

        // 익명 클래스 정의를 람다식으로 바꿔 표현하는 방식
        TestFunction test2=() ->  System.out.println("테스트 중 ....22222");
        //                  ㄴ 이 괄호는 execute 메소드의 인자를 정의하는 부분
        test2.execute();

        // 인자가 있는 함수형 인터페이스 (Test2)
        Test2Function test3=new Test2Function() {
            @Override
            public void execute(String message) {
                System.out.println("메세지 = "+message);
            }
        };
        // 람다식으로 하면?
        Test2Function test4=(message) -> System.out.println("메시지 = "+message);

        // 실행
        test4.execute("hello");
        // test4.execute(99);   오류임 인터페이스에서 선언한 추상메소드 인자 타입과 일치해야함.

        Test3Function test5 = (a,b) -> {return a+b;};
        System.out.println(test5.execute(34,23));

        Test4Function test6 = () -> {return 108+157;};
        System.out.println(test6.execute());
    }
}
