package object.day9;

public class B24AbstractTest {
     // Shape 와 AbstractShape 비교

    public static void main(String[] args) {
       
        // 1. 부모 객체 생성
        Shape sh=new Shape();
        System.out.println(sh+", 넓이 = "+sh.area());

        // 2. 부모 객체 생성 불가
        // 추상클래스는 부모객체를 못만든다. 추상메소드가 정의가 안되어있기 떄문에. 그래서 오류
        // AbstractShape absh=new AbstractShape();  오류 (인스턴트화를 못시킨다).
        

        // 업캐스팅 객체는 Atriangle로 만들엇는데 참조는 부모껄로 참조.
        System.out.println(" ///// 추상클래스 테스트 ///// " );
        AbstractShape tri=new ATriangle(45, 34);
        System.out.println(tri);

        AbstractShape rec=new ARectangle(45, 34);
        System.out.println(rec);


        // 3. 추상 클래스로 익명 클래스 정의/ 어디에도 circle이라는 이름이 없음. 임시로 만드는 클래스 개념 / 1회용임 . 이코드를 또 쓰고싶어도 못씀
        //    AbstractShape 클래스 기본 생성자 없으면 오류, 커스텀 생성자로 만들어야함
        //    익명클래스 : 이름이 없는 클래스. 추상클래스의 추상메소드를 new 연산에서 정의한다.
        //            -> 클래스 정의를 하면서 객체를 생성함       (원래 extend circle 어쩌고저쩌고 정의할텐데.)
        AbstractShape absh=new AbstractShape(230,450) {
            // 익명 클래스 정의 부분.
            int radius=20;     // 반지름.  익명 클래스에서 추가로 필드 정의 가능.
            @Override
            public long area() {    // 원의 넓이
               return (long)((this.radius*this.radius)*3.1419);
            }
            @Override
            public long length() {  // 원의 둘레
               return (long)(2*3.1419*this.radius);
            }

            // 익명 클래스 내용에 맞게 toString 재정의 하기.
            @Override
            public String toString() {
                return "AbstractShape [반지름 = " +radius+", 원의둘레 = "+length()+ ", area() = " + area() + ", getClass() = "
                        + getClass() + "]";
            }
        
        };  // 익명클래스 끝
        // AbstractShape [width=230, height=450, area()=1256, getClass()=class object.day9.B24AbstractTest$1]
        System.out.println(absh);
    }
}
