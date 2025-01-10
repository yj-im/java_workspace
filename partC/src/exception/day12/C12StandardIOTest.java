package exception.day12;

import java.io.IOException;

public class C12StandardIOTest {

    // 표준 입력 스트림 : 콘솔(키보드) -> 입력버퍼 -> 메모리(프로그램)
    // 표준 출력 스트림 : 메모리(프로그램) -> 출력버퍼 -> 콘솔(화면장치)
    // System.in 은 InputStream , System.out 은 PrintStream 타입

    // 주의 : 아스키코드 문자는 1바이트로 처리, utf-8 한글은 2바이트로 처리됨. 그래서 가나다라 하면 가,나 밖에 안나오는것
    public static void main(String[] args) {
        
        // 표준 입력과 출력

    try {
   
        stdioTest1();

 
    // 실행 방법 : 1) abcd 라고 입력하기   2) 가나다라
    
   


  }catch(IOException e){
    System.out.println("예외 : " + e.getMessage());
  }

}  // main end

// 반복문 없이 4 바이트만 입력하는 테스트
public static void stdioTest1() throws IOException{
    int c=System.in.read();         // 바이트 단위 입력
    // System.out.println(c);       // 1. 읽어온 값은 정수형 저장. 그대로 출력
    // System.out.println((char)c); // 2. 아스키 코드값은 그대로 출력. utf-8 한글은 2바이트
    System.out.write(c);            // 3. 바이트 단위 출력 
    //System.out.flush();           // 필요한 이유 : print, println 자동 flush (출력버퍼에 출력장치로)
                                    //          write 메소드는 자동 flush 아니다.
    c=System.in.read();
    // System.out.println(c);
    // System.out.println((char)c);
    System.out.write(c);
    //System.out.flush();

    c=System.in.read();
    // System.out.println(c);
    // System.out.println((char)c);
    System.out.write(c);
    //System.out.flush();

    c=System.in.read();
    // System.out.println(c);
    // System.out.println((char)c);
    System.out.write(c);
    //System.out.flush();
}
public static void stdioTest2() throws IOException{

    System.out.println(" // 위의 코드를 반복문으로 실행하기 // ");
    System.out.println("입력하세요. ↓↓↓↓↓↓↓↓↓↓↓↓ ");
    int c;
    int count=0;
    while((c=System.in.read()) != -1) {  // 입력종료는 -1. 키보드 ctrl+z
        System.out.write(c);    // 엔터 입력되면 버퍼를 자동으로 비운다.
        count++;
    }
    System.out.println("총 입력바이트 수 : " + count);
    // 엔터 : 운영체제 윈도우 일때, 아스키코드 CRLF (2바이트)
    //                 macOS 또는 리눅스 일때, 아스키코드 LF (1바이트)
}
}

