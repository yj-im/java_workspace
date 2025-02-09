package object.day8;

import java.util.ArrayList;

public class ShapeTest {

    public static void main(String[] args) {
        
        Triangle tri=new Triangle(300, 400);
        System.out.println(tri);    // toString 재정의된 문자열 리턴하여 출력.
        System.out.println("tri 넓이 = "+tri.area()+", 둘레길이 = "+tri.length());

        Rectangle rec=new Rectangle(100, 50);
        System.out.println(rec);
        System.out.println("rec 넓이 = "+rec.area()+", 둘레길이 = "+rec.length());

        Circle cir=new Circle(30);
        System.out.println(cir);
        System.out.println("cir 넓이"+cir.area()+ ", 원의 둘레 = "+cir.length());

        // 위의 3개의 객체를 모두 하나의 자료구조(배열 또는 리스트)에 저장하려면
        // => UpCasting 으로 자료를 저장한다.
        ArrayList<Shape> list=new ArrayList<>();
        list.add(tri);
        list.add(rec);
        list.add(cir);

        System.out.println("//// 인덱스 지정해서 가져오기 ////");
        System.out.println(list.get(0).toString()+"넓이 = "+list.get(0).area());     // 삼각형
        System.out.println(list.get(1).toString()+"넓이 = "+list.get(1).area());     // 사각형
        System.out.println(list.get(2).toString()+"넓이 = "+list.get(2).area());     // 원

        System.out.println("/// for 반복 /// ");
        for(Shape temp : list){
            System.out.println(temp.toString() + " 둘레 길이 = "+temp.length());
        }

    }
}
