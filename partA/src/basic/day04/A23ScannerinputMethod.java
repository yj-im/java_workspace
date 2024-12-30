package basic.day04;

import java.util.Scanner;

public class A23ScannerinputMethod {

    // Scanner sc = new Scanner(System.in)
    //         sc 로 사용할수 있는 메소드 : next(), nextLine(), nextInt()
    
    // 전역변수
   static Scanner sc = new Scanner(System.in); 
    public static void main(String[] args) {

        nextLineTest2();

       sc.close();
}

public static void nextTest(){
    // nextLine()은 엔터전까지 문장으로 가져가는데 (공백허용) next()는 엔터+공백 까지를 문장으로 가져감 (공백=엔터) 
    String str1 =sc.next();
    String str2 =sc.next();

    System.out.println("str1 = "+str1+"str2 = "+str2);
}
public static void nextLineTest(){
         // newxLine() 메소드 : 줄 단위로 엔터를 포함해서 입력버퍼의 내용을 문자열로 저장.
         String str3=sc.nextLine();
         String str4=sc.next();     // 엔터를 안가져감.

         System.out.println("str3 = "+str3+"str4 = "+str4);
}
public static void nextIntText(){
    
        // nextInt() 도 next() 와 같이 엔터 + 공백을 문장으로 가져감, 숫자아니라 문자쓰면 오류발생.
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        System.out.println("num1 = "+num1+"num2 = "+num2);
}

public static void nextLineTest2(){
    // nextLine()은 엔터전까지 문장으로 가져가는데 next()는 엔터+공백 까지를 문장으로 가져감 
    String str1 =sc.next();
    String str2 =sc.nextLine();     // next()가 두고간 엔터를 nextLine()이 가져감.

    System.out.println("str1 = "+str1+"str2 = "+str2);
}
}
