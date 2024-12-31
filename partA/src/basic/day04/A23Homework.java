package basic.day04;

import java.util.Scanner;

public class A23Homework {

    public static void main(String[] args) {
        String id;
        Scanner sc=new Scanner(System.in);
        boolean run=true;

        while(run){
            System.out.println("1 : 아이디 입력하세요>>>");
            id=sc.nextLine();
            //test.charAt(i) 으로 아이디에 입력한 글자 하나씩 가져와서 검토하는 식으로
          switch (id) {
            case 1 : 
                System.out.println();
                break;
          
            default:
                break;
          }
        }
    }
}
