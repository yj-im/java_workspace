package exception.day12;

import java.io.File;
import java.io.IOException;

// 체크 예외 : 컴파일러가 처리를 강제하는 예외.
//      ㄴ 사용하는 클래스 안에서 예외를 발생시켰기 때문에
//      ㄴ Unhandled exception type IOException 는 반드시 예외처리 필요하다는 메세지임.
public class C10CheckedException {

    // java.io.File 클래스 : 운영체제의 파일 시스템을 다룰 수 있다.
    public static void main(String[] args) throws IOException {
        
        File file=new File("예외.txt");
        // File file=new File("README.md");
        System.out.println(file.exists());
        file.delete();  // 파일 삭제
        file.renameTo(new File("exception.txt"));  // 파일명 변경

        try {
            if(file.exists()){
                System.out.println("파일이 존재합니다.");
                System.out.println("파일의 크기 : "+file.length());     // 바이트
            }else {
                System.out.println("file not found!");
                file.createNewFile();
        }
    } catch (IOException e) {
        //  filee.createNewFile() 메소드가 체크 익셉션을 발생시켰다.
        //          ㄴ 반드시 예외처리가 필요하다.
            System.out.println(e.getMessage());

        }
        new C10CheckedException().createFile(file);

        System.out.println("프로그램을 종료합니다");
    }

    // throws : createFile 메소드를 호출하는 곳에서 예외를 처리하도록 떠넘김
    public void createFile(File file) throws IOException{
        file.createNewFile();
    }
}
