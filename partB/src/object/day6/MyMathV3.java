package object.day6;

// 연산 : + - *  추가연산 : 몫(/, DIV), 나머지(%, MOD) 
public class MyMathV3 {

    private int first;
    private int second;
    private OperationType opType;
    private char opChar;
    private long answer;

    // 1. 생성자
    public MyMathV3(int first, int second, OperationType opType){
        this.first=first;
        this.second=second;
        this.opType=opType;
        this.opChar=switch(this.opType){
            case ADD -> '+';
            case SUB -> '-';
            case MUL -> '×';
        };
        
    }

    // 2. getter
    public int getFirst() {
        return first;
    }
    public int getSecond() {
        return second;
    }
    public OperationType getOpType() {
        return opType;
    }
    public long getAnswer() {
        return answer;
    }

    // 3. setter : 필요한 속성만 정의함.
    public void setAnswer(long answer) {
        this.answer = answer;
    }
    // 4. 추가로 필요한 인스턴스 메소드 정의
    // 4. 자바 12 부터 switcg 문을 대입문에 사용.
    public long calculate(){
        long result=switch(this.opType){
            case ADD -> this.first+this.second;
            case SUB -> this.first-this.second;
            case MUL -> this.first*this.second;
        };
        return result;
    }
    // 정답을  출력할 문자열
    public String toString(){
        return String.format("%d %c %d = %d", this.first, this.opChar, this.second, calculate() );
    }
    // 문제를 출력하는 메소드
    public void printProblem(){
        System.out.print(String.format("%d %c %d = ? >>> ", this.first, this.opChar, this.second));
    }

    

}

enum OperationType{
    ADD,
    SUB,
    MUL
}
