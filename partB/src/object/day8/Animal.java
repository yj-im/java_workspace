package object.day8;

public class Animal {

    protected String aniName;
    protected int age;
    protected String color;

    // 메인에서는 이름 나이 컬러 못건드리니 getter setter 가져와야함.
    public void sound(){
        System.out.println("동물 소리 들어보기.");
    }

    // 부모 클래스에서 정의한 toString은 자식 클래스에 상속 
    @Override
    public String toString() {
        return "Animal [aniName=" + aniName + ", age=" + age + ", color=" + color + "]";
    }

   

    
}


class Eagle extends Animal {
    
    // 물려받은 인스턴스 필드의 초기값 저장.
    Eagle(){
        this.aniName="독수리";  // this, super 모두 가능함. this가 범위가 더넓음. 재정의할때는 super는 super를 필히 써줘야한다.
        this.age=15;
        this.color="brown";
    }

    // 1. 자식 클래스의 인스턴스 메소드
    public void fly(){  // fly 자식이만든메소드 sound 부모가 만든 메소드
        System.out.println("시속 100km 로 날수 있다.");
    }

    // 2. 부모 클래스의 인스턴스 메소드 재정의
    @Override
    //      ㄴ 애노테이션으로 재정의 메소드 문법(형식) 체크.
    // 예를들어 sound()괄호안에 int a 같은게 들어가면 오류가뜸. 왜냐면 오버라이드 sound 재정의 메소드는 부모가 물려준거 그대로 써야해서 void 이고, 인자가없어야해.라는걸 물려받음.
    // 클래스상속md 메모에서 오버라이드 메모해놓은부분 참고
    public void sound() {
        super.sound();
        System.out.println("🦅 휘이잉 ");
    }
}

class Frog extends Animal{
    // 초기화함
    Frog(){
        this.aniName="청개구리";
        this.age=1;
        this.color="초록점박이";
    }

    // 1. 자식 클래스의 인스턴스 메소드
    public void jump(){     // jump 자식이만든메소드 sound 부모가 만든 메소드
        System.out.println("높이 1m 까지 점프할수 있다.");
    }
    @Override
    public void sound() {
       
        super.sound();
        System.out.println("🐸 개굴개굴 ");
    }
}


class Dog extends Animal{
    // 초기화함
    Dog(){
        this.aniName="푸들";
        this.age=5;
        this.color="밀키브라운";
    }

    // 1. 자식 클래스의 인스턴스 메소드
    public void home(){     // home 자식이만든메소드 sound 부모가 만든 메소드
        System.out.println("집을 잘 지킨다.");
    }
    @Override
    public void sound() {
       
        super.sound();
        System.out.println("🐶 멍멍 ");
    }
}
