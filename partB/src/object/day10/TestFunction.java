package object.day10;


// 아래 테스트하려고 인터페이스를 인자 유무에 따라 4개나 만들었는데 
//      -> 자바 JDK는 아래 4개 유형의 인터페이스가 이미 만들어 져있음. 사용만하면됨 굳이 안만들어도 되는거임
//  1. Runnable - 실행할 수 있는  .run()
//  2. Consumer - 소비자 (인자만 가져가 사용한다.)  accept()
//  3. Supplier - 공급자 (인자 없이 리턴을 준다.)   get()
//  4. Function - 인자값을 가지고 처리결과를 리턴하는 함수다.   apply()
//  -> 4개 유형 함수 인터페이스의 추상 메소드 알아내기
@FunctionalInterface
public interface TestFunction {
    // 리턴과 인자 유무에 따라 4가지 조합
    // 리턴과 인자 모두 없는 형식의 함수
    void execute();
}

@FunctionalInterface
 interface Test2Function {

    void execute(String message);
    
}

interface Test3Function {

    int execute(int a,int b);
}

@FunctionalInterface
 interface Test4Function {
    int execute();
    
}