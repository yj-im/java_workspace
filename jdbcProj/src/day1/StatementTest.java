package day1;

import java.sql.Connection;
import java.sql.Statement;

// sql 테스트 : insert
// statement 인터페이스 : 구현클래스로 sql을 실행한다.
public class StatementTest {

    public static void main(String[] args) {
        
        // 1. db에 연결
        Connection connection=OracleConnectionUtil.getConnection();
        System.out.println("연결 확인 : "+connection);

        // 2. sql 실행
        // try resources 구문 :  close() 안해줘도됨.  stmt.close()를 처리함
        String sql="INSERT INTO TBL_CUSTOMER(custom_id, name, email, age, reg_date) " + 
                        "VALUES ('hongGS2', '홍길순', 'gilsoon2@korea.com', 29, sysdate)";
        try (Statement stmt=connection.createStatement()) {
            // createStatement() : Statement 타입의 객체를 생성
            System.out.println("Statement 구현 클래스는 ? "+stmt.getClass().getName());

            stmt.execute(sql);     // sql 쿼리 실행. 컴파일한 sql을 오라클이 실행함. (실행할때 컴파일한다.)
                                        // sql 을 인자로 받는 execute 메소드 사용도 가능함.
        } catch (Exception e) {
            System.out.println("SQL 실행 예외 : "+e.getMessage());
        }
       

        OracleConnectionUtil.close(connection);
    }
}
