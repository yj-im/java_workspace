package object.day8;

import java.util.ArrayList;

public class B21AnimalChildTest {

    public static void main(String[] args) {
        // 부모로는 객체로는 거의 만들지 않는다. 앞에서 parent나 animal로 객체만들지 않았음. 추상 class의 개념.
        
        // 다형성의 예시
        Eagle eagle=new Eagle();
        Frog frog1=new Frog();
        Frog frog2=new Frog();
        Dog dog=new Dog();

        ArrayList<Animal> farm=new ArrayList<>();
        // 리스트의 타입이 Animal 부모 클래스 타입이다.=> Animal의 자식 객체를 이 리스트에 저장할수 있다.(업캐스팅)
        // 리스트타입을 Animal 부모가아니라 Dog로 하면 eagle frog1,2 3개는 오류뜨고 dog만 담을수 있음.

        farm.add(eagle);
        farm.add(frog1);
        farm.add(frog2);
        farm.add(dog);
        System.out.println("우리 농장의 동물들 "+ farm.size()+ "마리");
        for(Animal ani:farm){
            System.out.println(ani);
            ani.sound();    // 얘가 핵심임. 동물소리 들어보기, 동물에따라 다른소리 2줄출력
            System.out.println("===========");
        }
        // 메소드 오버라이드는 상속받은 sound() 메소드를 각각 자식 객체가 다르게 실행되도록 한다. - 다형성 예시
        
    }
}
