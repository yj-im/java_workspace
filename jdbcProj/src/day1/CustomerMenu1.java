package day1;

import java.sql.Connection;
import java.sql.PreparedStatement;

// 예시 : 고객 정보(이메일) 를 수정하는 메뉴를 구현하기
public class CustomerMenu1 {

    public static void main(String[] args) {
        
        System.out.println("========고객 정보(이메일) 를 수정하는 메뉴 입니다. ===========");
        System.out.println("아이디 입력 >>> ");
        String customid=System.console().readLine();
        System.out.println("수정할 이메일 주소 입력 >>> ");
        String email=System.console().readLine();

        String sql="UPDATE tbl_customer SET email = ? WHERE custom_id = ? " ;      // 1) update sql 작성

        // db 연결하여 update 실행하기(길순 이메일 촌스러워서 gs~~~로 바꾸려함)
        Connection connection=OracleConnectionUtil.getConnection();

        // 앞에서는 sql에 쭉 나열해서 값을 전달했는데 preparedStateMent는 값을 매개변수로 전달한다고 이해해야함
        try (PreparedStatement pstmt=connection.prepareStatement(sql)) {
            
            // 2) 실행하기. 매개변수값 전달 매개변수 인덱스는 sql 문의 ? 의 순서
            pstmt.setString(1, email);
            pstmt.setString(2, customid);

            // 리턴값은 insert, update, delete sql 실행이 반영된 행의 갯수
            //
            int result=pstmt.executeUpdate();
            System.out.println("result : "+result);

            if(result==1)
            System.out.println("고객님 정보를 업데이트 했습니다.");
            else
            System.out.println("고객님 정보가 없습니다.");

        } catch (Exception e) {
            System.out.println("update 예외 : "+e.getMessage());
        }
        OracleConnectionUtil.close(connection);

    }

}
