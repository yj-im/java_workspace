package object.day6;

public class MyClass8 {

    String field1;
    int field2;

    // 2. 커스텀 생성자 : 인자를 갖는 생성자
    //      인자의 개수는 제한없음.
    //      **인스턴스 필드값 초기화가 목적.**
    MyClass8(String field1, int field2){
        // this는 자신 객체를 나타내는 키워드
        this.field1=field1;
        this.field2=field2;
    }
    // *커스텀 생성자가 정의되면 기본 생성자는 사라져서 생략하고 쓸수없음.*
    // 필요하면 기본생성자 정의를 해야함. 
    
}
    // 기본 생성자와 커스텀 생성자를 모두 정의.
    class MyClass9{

        String field1;
        int field2;

        // 생성자 : 메소드 오버로딩 적용할수 있음.
        MyClass9(){
            
        }

        MyClass9(String field1){
            this.field1 =field1;
        }

        MyClass9(int field2){
            this.field2=field2;
        }

        MyClass9(String field1, int field2){
            this.field1=field1;
            this.field2=field2;
        }
    }

