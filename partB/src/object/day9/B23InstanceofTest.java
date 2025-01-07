package object.day9;

// '부모 타입으로 업캐스팅' 된 자식 타입의 객체를 검사 => 다운캐스팅 클래스타입을 결정
public class B23InstanceofTest {

    public static void main(String[] args) {
        // 부모타입 참조
        Shape sh1=new Circle(26);
        Shape sh2=new Rectangle(25, 25);
        Shape sh3=new Rectangle(40, 20);
        Shape sh4=new Triangle(40, 40);

        // 업캐스팅 변수 sh1,sh2,sh3,sh4 의 객체타입 검사하기.
        // sh1이 트라이앵글 객체니? 라고 물음.
        boolean result=sh1 instanceof Triangle;
        System.out.println("// 각 도형 객체가 삼각형인지 검사하기 //");
        System.out.println("sh1 instanceof Triangle : "+result);    
        System.out.println("sh2 instanceof Triangle : "+(sh2 instanceof Triangle));
        System.out.println("sh3 instanceof Triangle : "+(sh3 instanceof Triangle));
        System.out.println("sh4 instanceof Triangle : "+(sh4 instanceof Triangle));

        // 연습 메소드 활용
        System.out.println("// 각 도형 객체가 원 인지 검사하기 //");
        System.out.println("isCircle(sh1) : "+isCircle(sh1));
        System.out.println("isCircle(sh2) : "+isCircle(sh2));
        System.out.println("isCircle(sh3) : "+isCircle(sh3));
        System.out.println("isCircle(sh4) : "+isCircle(sh4));

        // 다운 캐스팅 : 업캐스팅 한 참조변수를 자식 타입으로 변환
        // java.lang.ClassCastException: class object.day9.Circle cannot be cast to class object.day9.Triangle (object.day9.Circle and object.day9.Triangle
        // 서클을 트라이앵글로 변환할수없다. 캐스팅오류. 자식 타입 불일치 instanceof로 체크하고 참일때만 다운캐스팅으로 변환.
        // Triangle tri=(Triangle)sh1;          오류
      
        Triangle tri=null;      // if 조건이 거짓이면 출력문에서 tri 오류뜨는데 이는 tri가 초기화 안돼있어서 null로 초기화 해줌.
        if(sh4 instanceof Triangle)
        tri=(Triangle)sh4;
        System.out.println(tri);
    }


    // 인자로 전달된 도형이 Circle 객체인지 검사하는 메소드
    public static boolean isCircle(Shape shape){   // 퀴즈 괄호안 인자 선언은?

        if(shape instanceof Circle)
            return true;
        return false;
    } 
    public static boolean isRectangle(Shape shape){
        return shape instanceof Rectangle? true:false;
    }
}
