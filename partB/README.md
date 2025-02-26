
### 변수의 Scope (스콥. 사용범위)

- 지역(local) 변수 : main 메소드 등 메소드 범위. for,while,if 등 { } 범위
    + 지역 변수 선언은 초기화 값 없이 선언하면 int age; age 의 값이 없음. 

- 전역 변수(global) : 클래스 범위에서 선언되는 변수. 클래스의 필드, 속성, 특성 임.
    +    : 자바에서는 전역 변수 용어는 거의 사용안함.
    +    : 인스턴스 변수냐, static 변수냐만 잘 인지하면 된다.
    + 전역 변수 선언은 초기화  값 없이 선언하면 int, double 등의 값은 0 또는 0.0 기본값으로 저장. 

### 클래스 정의는 어떻게 하나?

- 데이터를 그룹으로 묶어서 다루어야 한다. 클래스를 정의하여 객체를 만듬.
 -> (어떤 특성이 있는지, 어떤 동작이 있는지로 정의한다.)
  + (ex) 사람의 특성을 가지고 클래스를 정의함.
    + 이름, 나이, 키, 몸무게 등은 사람에 따라 값이 다름 => 인스턴스 변수로 선언
    + 눈의 갯수 등은 모든사람이 공통적으로 갖는 값이 있음. => static 변수로 선언

  + (ex) 사람의 기능(동작) 으로 클래스를 정의함.
    + 인스턴스 메소드
    + static 메소드


### 인스턴스와 static을 비교.

- 객체는 인스턴스 속성과 인스턴스 메소드로 만들어진다.
    + 연산자는 new 클래스이름(); 로 객체를 생성하고 메모리를 할당 받는다.
    + 객체의 메소드와 속성은 객체를 참조하는 변수로 사용함.

- static은 인스턴스 요소에 접근할 수 없음. static 메소드는 인자로 필요한 값을 전달 받는다.
    + static 요소는 클래스 이름으로 사용함.
    + 자바 클래스에서 제공하는 static 메소드 : Math, String, ....


### 접근 권한
- 클래스, 변수, 메소드에 설정되는 것.

- 1. public     : 모든 클래스에게 사용되는 접근 권한.

- 2. default    : 패키지가 같은 이름을 갖는 클래스에게 사용되는 접근 권한.
    + 접근 권한 키워드가 없으면 default(기본) 이다.

- 3. private    : 현재 클래스에서만 사용되는 접근 권한. 
    + 클래스의 접근 권한으로 사용하지 않음.

- 4. protected  : 클래스의 상속관계에서 사용됨. (상속에서 설명함.)
    + 클래스의 접근 권한으로 사용하지 않음.

### 생성자

- 객체가 만들어질때 실행되는 메소드. 인자값은 필요시 전달할수 있으나
리턴은 없는 특별한 메소드임.

- 객체 생성 형식 : new 클래스이름() 입니다. 여기서 '클래스이름()' 생성자 메소드 실행함.

- 목적 : 인스턴스 값의 초기화

### 객체 생성 대입문

MyMath mm1=new MyMath();

대입연산 = 의 오른쪽은 new MyMath() : 객체를 생성하고 메모리를 할당받는다.
                            MyMath 클래스로 객체를 생성하고 생성자도 실행
              왼쪽은 MyMath mm1 : 오른쪽에 생성된 객체를 변수이름 mm1에 참조시킨다(객체의 주소저장)
              mm1의 타입은 클래스 타입을 일치해야 함.

* 참고 : 참조값 저장하는 변수는 어떤타입? 클래스타입과 배열.

### 객체의 배열

 MyMathV3[] probs = new MyMathV3[5];

 new MyMathV3[5]; 는 MyMathV3 클래스의 객체를 5개 참조할수 있는 메모리를 만든다 => 주소값 5개 저장. 