package object.day10;

import object.day9_interface.InterfaceA;

// 익명 클래스 ? class 를 별도로 정의하지 않은 이름이 없는 클래스
//        사용할 때 메소드 재정의하여 객체 생성
public class B31AnonymousTest {

    public static void main(String[] args) {
        
        // 일반 클래스의 메소드 재정의 (거의 사용안함)
        //   ㄴ 익명 클래스에서 필요시 메소드 재정의 
        Shape shape=new Shape(){

            @Override
            public long area() {
                return 100;
            }
            @Override
            public long length() {
                return 999;
            }
        };

        // 요약 : 익명 클래스는 추상클래스 또는 인터페이스로 만든다. Shape과 같이 일반클래스로 만드는 경우는 거의없음
        // public class AscendingNameComparator implements Comparator<Member> 이거나
        // class DecendingNameComparator implements Comparator<Member> 이것처럼
        // 힘들게 어센딩네임 디센딩네임 붙이고 하지않음. 한번만쓸껀데 뭐하러 힘들게 만들어 느낌

        // 추상 클래스의 메소드 재정의
        //      ㄴ 익명 클래스의 모든 추상 메소드 재정의 필수.
        //         (sound, isFly, todo 세개를 다 재정의하니까 오류가 없음)
        AbstractAnimal animal=new AbstractAnimal(null,null) {
            @Override
            public void sound() {
                
                
            }
            @Override
            public boolean isFly() {
             return false;
            }
            @Override
            public String todo(String task) {
                return null;
            }
        };

    }

    // 인터페이스로 만드는 익명 클래스
    //      ㄴ 익명 클래스의 모든 추상 메소드 재정의 필수.
    // 오류뜨는데 testA 추상메소드 재정의하면 쓸수있음.
    InterfaceA ifa=new InterfaceA() {
        @Override
        public void testA(String message) {
           
            
        }
    };
}
