package basic.day03;

public class A18CharCondition {

    public static void main(String[] args) {
        
        char test='c';
        boolean result; 

        // test에 저장된 문자가 대문자? 
        result=(test>='A'&&test<='Z');  // && 그리고
        //      코드값 >= 65 && <= 90
        System.out.println(result);

        // test에 저장된 문자가 소문자?
        result=(test>='a'&&test<='z');
        //      코드값 >= 97 && <= 122
        System.out.println(result);

        // test에 저장된 문자가 영문자?
        result=(test>='A'&&test<='Z')||(test>='a'&&test<='z');  // || 또는
        System.out.println(result);

        // test 에 저장된 문자가 숫자인가 검사.
        System.out.println("숫자 문자인가 검사");
        test = '4';
        result=(test>='0'&&test<='9');  
        System.out.println(result);

        
        
    }
}
