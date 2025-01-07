package object.day9;


// abstract 부모 클래스
public abstract class AbstractShape {
    // 필드, 생성자, 인스턴스 메소드 동일하게 정의 가능하다.
    protected int width;
    protected int height;

    AbstractShape(int width, int height){
        this.width=width;
        this.height=height;
    }


    // ※ 형식만 선언한 추상메소드가 있는 클래스가 추상클래스 ※
    public abstract long area();
    public abstract long length();

    // 인스턴스 메소드(인스턴스 필드값을 사용하는 애) getter
    public int getWidth() {
        return width;
    }
    public int getHeight() {
        return height;
    }


    @Override
    public String toString() {
        return "AbstractShape [width=" + width + ", height=" + height + ", area()=" + area() + ", getClass()="
                + getClass() + "]";
    }


   
    
}

// 추상클래스 상속할때 반드시 추상메소드 재정의함.
// 자식들 니네들이 쓸것들 직접만들어.
class ARectangle extends AbstractShape{

    ARectangle(int width, int height){
        super(width, height);       // 부모의 기본 생성자가 없으므로 부모의 커스텀 생성자를 호출하기.
    }
    
    @Override
    public long area() {
        
        return this.width*this.height;
    }

    @Override
    public long length() {  
      
        return (this.width*this.height)*2;
    }

   
   
    
}


// ATriangle

class ATriangle extends AbstractShape{

    ATriangle(int width, int height){
        super(width, height);       // 부모의 커스텀 생성자를 호출하기.
    }
    
    @Override
    public long area() {
        
        return (this.width*this.height)/2;
    }

    @Override
    public long length() {
        long halfWidth = (long)(width / 2.0);
        long sideLength = (long)Math.sqrt(Math.pow(halfWidth, 2) + Math.pow(height, 2));
        return width + 2 * sideLength;
    }
    
}
