package object.day5;

public class B05RectangleTest {

    public static void main(String[] args) {
        Rectangle shape = new Rectangle();
        shape.width=220;
        shape.height=300;
        shape.shapeName="🔳";
        System.out.println("넓이 = "+shape.getArea());
        System.out.println("둘레 = "+shape.getLength());
        System.out.println("사각형 " +shape.draw()+" 을 그립니다");

    }
}
