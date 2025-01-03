package object.day7;

import java.util.Scanner;



public class B12ScoresApp {
public static void main(String[] args) {
    Score[] stuScores= new Score[10];

    stuScores[0] = new Score("사나",GradeType.GRD1,"객체지향프로그래밍",90);
    stuScores[1] = new Score("모모",GradeType.GRD1,"객체지향프로그래밍",84);
    stuScores[2] = new Score("나연",GradeType.GRD2,"알고리즘",72);
    stuScores[3] = new Score("정현",GradeType.GRD2,"알고리즘",91);
    stuScores[4] = new Score("지효",GradeType.GRD3,"파이썬",88);

    System.out.println("==== 새로운 성적 입력하기(키보드 CLI) ====");
    // 길동, GRD3, SQL, 78
    // 길순, GRD2, 파이썬, 88
    
    Scanner sc=new Scanner(System.in);
    boolean run=true;
    int index =5;
    while(run){
        System.out.println("이름 >>>");
        String name=sc.next();

        System.out.println("학년 >>>>");
        int grade=sc.nextInt();
        GradeType gradeType =switch (grade) {
            case 1 -> GradeType.GRD1;
            case 2 -> GradeType.GRD2;
            case 3 -> GradeType.GRD3;
            default->null;   
        };
            

        System.out.println("과목명 >>>>");
        String subject=sc.next();

        System.out.println("점수 >>>>");
        int jumsu=sc.nextInt();

        // 새로만든 객체출력 : toScore 메소드 사용
        stuScores[index]=new Score(name,gradeType,subject,jumsu);
        System.out.println("객체가 생성되었습니다 . "+stuScores[index].toScore());
        
       System.out.print("계속할까요?");
        if(sc.next().equals("n")) run=false;
            else
            index++;
    
    
    }

    System.out.println("========점수 통계(점수 합계와 평균) 구하기 ========");
    // for(int i=0; i<stuScores.length; i++){
    //     System.out.println(stuScores[i]);
    // }
    int sum=0;
    for(Score temp : stuScores){
        System.out.println(temp);
        if(temp!=null){     // 조건식 없이 누적 합계 식 실행하면 오류. null 일때 
            sum+=temp.getJumsu();
        }
        System.out.println("중간 합계" +sum);
    }
    System.out.println("총 점수 합계 : "+sum);
    System.out.println("점수 평균 : "+(double)sum/(index+1));
    sc.close();
}
}
