package basic.day03;

public class A19MyCharMethod {

    public static void main(String[] args) {
        
        // Hello World~!! Hi, Java~!!
        // 문자열 검사 : 대문자 ? 개, 소문자 ? 개, 숫자 ? 개, 그 외 문자 ? 개
        String message = "Hello World~!! 9to6 Hi, Java~!!";
        int upper_count=0;
        int lower_count=0;
        int number_count=0;
        int symbol_count=0;

        // 문자를 순서대로 1개씩 가져와서 검사.
        for(int i=0; i<message.length(); i++){
            char temp = message.charAt(i);
            System.out.println(String.format("문자: %c 대문자 : %5s    소문자 : %5s    숫자 : %5s",
            temp,isUpperCase(temp),isLowerCase(temp),isNumberCase(temp)));
               
            if(isUpperCase(temp)){
                upper_count++;
            }else if(isLowerCase(temp)){
                lower_count++;
            }else if (isNumberCase(temp)){
                number_count++;
            }else {
                symbol_count++;
            }
        }   // for end
        System.out.println("대문자의 갯수 : "+upper_count);
        System.out.println("소문자의 갯수 : "+lower_count);
        System.out.println("숫자의 갯수 : "+number_count);
        System.out.println("그외 문자의 갯수 : "+symbol_count);
        System.out.println("문자열 총 길이 : "+message.length());


    } // main end

// 문자를 검사하는 코드가 자주 필요해 다음과같이 메소드를 정의 하여 사용.

    // 대문자 검사 메소드
    public static boolean isUpperCase(char c){
// public : 다른클래스에서 쓸려고 공개.,  static : 이클래스에서 불러와서 바로 쓸려고, boolean : 참거짓으로 받을려고
        return (c>='A'&&c<='Z');
    }
    // 소문자 검사 메소드
    public static boolean isLowerCase(char c){
        return (c>='a'&&c<='z');
    }
    // 영문자 검사 메소드
    public static boolean isAlphabetCase(char c){
        return (c>='A'&&c<='Z')||(c>='a'&& c<='z');
    }
    // 숫자 검사 메소드
    public static boolean isNumberCase(char c){
        return (c>='0'&&c<='9');
    }

    public static boolean isSymbol(char c){
        return !isAlphabetCase(c)&& !isNumberCase(c) && (int)c <= 126;
    }
}
