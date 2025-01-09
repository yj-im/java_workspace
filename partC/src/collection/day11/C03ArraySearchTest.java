package collection.day11;

// main의 static인 특징 때문에 전역변수, 메소드를 모두 static 으로 만드는 것 대신에
//        클래스 객체를 생성하여 메소드를 작성하고 실행한다.
public class C03ArraySearchTest {

    private String[] names={"모모","나나","다현","사나"};

    public  static void main(String[] args) {
        
        int index= new C03ArraySearchTest().indexOf("나나");
        System.out.println(index);
      
    }
    public int indexOf(String text){     // 인스턴스 메소드
        int index=-1;
        for(int i=0;i<names.length;i++){
            if(names[i].equals(text)){
                index=i;    // 찾는 문자열과 일치하는 i를 결과변수  index에 저장
                break;      // 찾았으니까 for문 빠져나감.
            }
        }
        return index;
    }
}

