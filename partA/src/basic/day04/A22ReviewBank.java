package basic.day04;

import java.util.Scanner;

public class A22ReviewBank {

    public static void main(String[] args) {
        
        String menu;
        Scanner sc=new Scanner(System.in);
       
        boolean run=true;
        int money;
        int balance=0;
     
       

        
        while(run){
            System.out.println("1: 예금 | 2: 출금 3: 잔액 4: 종료 ");
      
            System.out.print("메뉴 선택 >>>> ");
            menu=sc.nextLine();
          
            
           switch (menu) {    
               case "1" :   
                    System.out.print("예금액 > ");
                    money=sc.nextInt();
                    balance+=money;
                    System.out.println("현재 잔고 : "+balance);
                    break;

                case "2" :
                    System.out.print("출금액 >");
                    money=sc.nextInt();
                    if(money<=balance)
                    balance-=money;
                    else
                    System.out.println("고객님의 잔액이 부족합니다.");

                    System.out.println("현재 잔고 : "+balance);
                    break;

                case "3" :
                 System.out.println("잔액 > "+balance);
                    break;
                    
                 case "4" :
                 System.out.println("종료합니다");
                 run=false;
                 break;
                   
                }
                }
                sc.close();  
 
    }}
