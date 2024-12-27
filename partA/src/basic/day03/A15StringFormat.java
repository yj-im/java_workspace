package basic.day03;

public class A15StringFormat {

    public static void main(String[] args) {
        // 문자열 출력 지금까지의 방식
        String name="김땡땡";
        int age=28;
        boolean isAdult=true;

        System.out.println("회원 정보 : 이름 - "+name+", 나이 - "+age+", 성인 인증 - "+isAdult);

        // 형식문자를 활용하여 문자열의 서식(format)을 정하고 출력하기.
        String temp = String.format("회원 정보 : 이름 - %s , 나이 - %d , 성인 인증 - %s", 
        name,age,isAdult);

        System.out.println("Stirng.format() 테스트");
        System.out.println(temp);
       
        System.out.println("ㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡㅡ");
        double point = 510.9;
        temp = String.format("회원 정보 : 이름 - %s , 나이 - %d , 포인트 - %.3f , 성인 인증 - %s", 
        name,age,point,isAdult);
        // 실수 포맷 %f 는 기본이 소수점 아래 6자리 출력. 퍼센트 뒤에 .숫자 붙여서 자릿수 조정가능

        System.out.println(temp);

    }
}
