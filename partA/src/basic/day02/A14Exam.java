package basic.day02;

import java.util.Scanner;

public class A14Exam {

    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);

        System.out.println("사용자 아이디를 입력하세요.↓↓↓↓↓↓");
        String userid=sc.nextLine();    

        boolean run=true;
        
        if(userid !=""){
            System.out.println("아이디는 : "+userid);
            run=false;
        }
        while (run) {
            System.out.println("아이디 입력안함");
        }
        // if(userid.isBlank() || userid.length()<5){
        //     System.out.println("유효한 아이디 입력이 아닙니다.");
       
        // }else{
        // System.out.println("입력한 아이디 확인 : "+userid);

        // }
        sc.close();     
    }
}
