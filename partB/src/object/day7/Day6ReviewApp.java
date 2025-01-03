package object.day7;

public class Day6ReviewApp {
public static void main(String[] args) {
    // 새로운 클래스 score로 데이터 저장과 관련 기능을 활용하는 예시.
    //   -> 성적데이터 최대 10개로 성적관리 프로그램을 개발  => 배열을 선언해야함

    Score[] stuScores= new Score[10];

    stuScores[0] = new Score("사나",GradeType.GRD1,"객체지향프로그래밍",90);
    stuScores[1] = new Score("모모",GradeType.GRD1,"객체지향프로그래밍",84);
    stuScores[2] = new Score("나연",GradeType.GRD2,"알고리즘",72);
    stuScores[3] = new Score("정현",GradeType.GRD2,"알고리즘",91);
    stuScores[4] = new Score("지효",GradeType.GRD3,"파이썬",88);

    // toScore 메소드를 이용하여 각 객체의 필드값을 출력하기
    System.out.println("성적 데이터 출력");
    for(int i=0; i<5; i++){
        String temp=stuScores[0].toScore();
        System.out.println(temp);
    }
    System.out.println("====================");
    for(int i=0; i<5; i++){
        String temp=stuScores[i].toScore();
        System.out.println(temp);
    }

    System.out.println("======저장된 객체들중 '점수'만 출력하기 =====" );
    for(int i=0;i<5; i++){
        // System.out.println(i+stuScores[i].jumsu);   // jumsu는 private 필드라 못가져옴 오류.
        System.out.println(i+stuScores[i].getJumsu());
    }

    System.out.println("======저장된 객체들 중 '점수' 가 85 이상인 과목명,점수 출력하기" );

    for(int i=0; i<5; i++){
        if(stuScores[i].getJumsu()>=85){
            System.out.println(stuScores[i].getSubject()+" : "+stuScores[i].getJumsu());
        }
    }
    System.out.println("=========GradeType 값에따라 각각 개수 구하기 ===========");
    int cnt1=0, cnt2=0, cnt3=0;

    for (int i=0; i<5; i++){
        if(stuScores[i].getGrade()==GradeType.GRD1){
        cnt1++;
        }
        else if(stuScores[i].getGrade()==GradeType.GRD2){
        cnt2++;
        }else if(stuScores[i].getGrade()==GradeType.GRD3)
        cnt3++;
    }
    System.out.println("GRD 1 = " + cnt1 + "명 GRD 2 = " + cnt2 + "명 GRD 3 = " + cnt3+"명 ");
    // 출력예시
    // GRD1 : 2명  ,  GRD2 : 2명  ,  GRD3 : 1명
    

}

}



// 요구사항 : 성적데이터에 이름, 학년(열거형), 과목명1개, 점수1개 저장
//            -> 성적데이터 최대 10개로 성적관리 프로그램을 개발. (main 메소드에서 한다.)
//      => 클래스 설계는 개발자가 함.

class Score{
    // 규칙을 우리가 정한다 : private한 필드선언으로 해야지.
    private String name;
    private GradeType grade;
    private String subject;
    private int jumsu;

    // 커스텀한 생성자 : private 필드의 초기값을 저장하게하는 커스텀한 생성자
    public Score(String name, GradeType grade, String subject, int jumsu){
        this.name=name;
        // 객체의 name= 인자의 name
        // 객체의 필드name을 정확하게 인지하기위해서 this 를 적어주기도함 = 인자name => 인자와 필드 변수명이 같을때 필드는 this.필드 필수임.
        this.grade=grade;
        this.subject=subject;
        this.jumsu=jumsu;
    } 
    public int getJumsu(){
        return this.jumsu;
    }
    public String getSubject(){
        return this.subject;
    }
    public GradeType getGrade(){
        return this.grade;
    }


    // private 필드에 접근하는 메소드 : getter, setter .

    // 기능과 관련된 인스턴스 메소드
    //      1. 모든 값을 출력할때 사용할 문자열 만들기.
    public String toScore(){
        return grade+" : 이름 = "+ name +", 과목명 = "+ subject + ", 점수 = " + jumsu;
        // grade, name subject, jumsu 앞에 this.이 생략돼있는것임. 인스턴스필드 네임이구나 하고 가져옴

        
    }


}
