package basic.day04;

import java.util.Scanner;

public class A23Homework {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        
        while(true){
          System.out.println("아이디 입력하세요");
          String gmail_id = sc.nextLine();
          

          if(isValid(gmail_id)){
            System.out.println("아이디 입력확인");
            break;
          }else {
            System.out.println("다시입력하세요");
          }
        
        
       
      }
      sc.close();
    }

        public static boolean isValid(String gmail_id){
    return (gmail_id.charAt(0)>='A'&&gmail_id.charAt(0)<='Z')||
    (gmail_id.charAt(0)>='a'&& gmail_id.charAt(0)<='z')||
    (gmail_id.charAt(0)>='0'&& gmail_id.charAt(0)<='9')||
    (gmail_id.contains(".")==true)&&(gmail_id.contains("~!@#$%^&*()_+|;:'<>?,/")==false);
}

}
