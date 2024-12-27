package basic.day03;

import java.util.Scanner;

public class A20MethodExample {

        // 3개의 정수값을 키보드 입력 받아 저장함.

        // 입력받은 3개의 값을 maxOfNumbers(n1,n2,n3) 메소드 실행하여 최대값을 리턴받음.
    public static void main(String[] args) {

        int n1,n2,n3;   // 초기값 없이 변수 선언.(타입과 이름)
        Scanner sc=new Scanner(System.in);  // 입력 데이터 처리에 대해 다양한 기능을 갖는 Scanner

        System.out.println("n1 입력 >>> ");
        n1=sc.nextInt();    // 입력 문자열을 정수값으로 변환하여 저장함.

        System.out.println("n2 입력 >>> ");
        n2=sc.nextInt();

        System.out.println("n3 입력 >>> ");
        n3=sc.nextInt();

        // max = 메인의 지역변수
        int max=maxOfNumbers(n1,n2,n3);
        System.out.println("n1,n2,n3 중 최대값은 " + max);

        int min = minOfNumber(n1,n2,n3);
        System.out.println("n1,n2,n3 중 최솟값은 "+min);

    }   // main end

    // 최대값 구하는 메소드
    public static  int maxOfNumbers(int n1, int n2, int n3){
        // max = maxofnumber안의 max 지역변수
        int max; 
        if (n1>n2){
            max=n1;
        }else{
            max=n2;
         }
        if(max<n3){
            max=n3;
         }
          return max;
            
    }

    public static  int minOfNumber(int n1, int n2, int n3){
        
        int min; 
        if (n1>n2){
            min=n2;
        }else{
            min=n1;
         }
        if(min>n3){
            min=n3;
         }
          return min;
            
    }
    


}   // class end
