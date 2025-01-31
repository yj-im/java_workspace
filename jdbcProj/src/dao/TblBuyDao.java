package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import vo.BuyVo;
import vo.CustomerOrdervo;
import vo.Product;

public class TblBuyDao {

  // db연결 정보를 상수로 정의합니다.
  private static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
  private static final String USERNAME ="c##idev";
  private static final String PASSWORD ="1234";

  private Connection getConnection() throws SQLException{
       return DriverManager.getConnection(URL, USERNAME, PASSWORD);
  }

  public int insertMany(List<BuyVo> cart){  // 장바구니 목록을 인자로 받기
    int count = 0;
    String sql = "INSERT INTO tbl_buy VALUES(tbl_buy_seq.nextval, ?, ?, ?, sysdate)";
    Connection connection=null;
    PreparedStatement pstmt=null;
    try {
        connection= getConnection();
        pstmt = connection.prepareStatement(sql);
       
        // 수동 커밋으로 변경
        connection.setAutoCommit(false);

        // batch(일괄) 실행 
        for(BuyVo vo : cart){   // 장바구니 목록의 항목 갯수 만큼 반복
           pstmt.setString(1, vo.getCustom_id());
           pstmt.setString(2, vo.getPcode());
           pstmt.setInt(3, vo.getQuantity());
           pstmt.addBatch();    //  * 일괄처리할 파라미터 값을 추가. 모아두었다가 한번에 처리
           count++;
        }
           pstmt.executeBatch();    //* 모아둔 파라미터 값 목록으로 일괄 실행
           // 저장할 행 데이터는 n개, 오라클서버에 처리 요청은 한번만한다.
          
           //  result = pstmt.executeUpdate();  // 이 명령어 반복은 요청을 n번
          connection.commit();      // 데이터베이스에 영구 저장
          
    } catch (SQLException e) {
      // System.out.println("예외 : " + e.getMessage());
           try {
            connection.rollback();
          } catch (SQLException e1) {   }
    } finally {
          try {
            pstmt.close();
            connection.close();
          } catch (SQLException e1) {   }
    }
    return count;
  }

  public int insertOne(BuyVo vo){
      int result = 0;
      String sql = "INSERT INTO tbl_buy VALUES(tbl_buy_seq.nextval, ?, ?, ?, sysdate)";
      try (
              Connection connection= getConnection();
              PreparedStatement pstmt = connection.prepareStatement(sql);
         ) {
             pstmt.setString(1, vo.getCustom_id());
             pstmt.setString(2, vo.getPcode());
             pstmt.setInt(3, vo.getQuantity());
             result = pstmt.executeUpdate();
            
      } catch (SQLException e) {
        System.out.println("예외 : " + e.getMessage());
      }
      return result;
  }


  public List<BuyVo> selectByCustomerId(String customerId){
    List<BuyVo> list=null;
    String sql="SELECT * FROM tbl_buy WHERE custom_id=? ORDER BY BUY_DATE DESC";
  try (
        Connection connection=getConnection();
        PreparedStatement pstmt=connection.prepareStatement(sql);

      ) {
        list=new ArrayList<>();
        pstmt.setString(1,customerId);
        ResultSet rs=pstmt.executeQuery();
        BuyVo vo=null;
        while (rs.next()) {
          vo=new BuyVo(0,null,rs.getString(1),rs.getInt(2),rs.getDate(3));
          
          list.add(vo); 
        }
       } catch (SQLException e) {
        System.out.println("예외 : "+e.getMessage());
      }
      return list;  
    }

    public List<CustomerOrdervo> selectCustomerOrderList(String customerId){
      List<CustomerOrdervo> list=new ArrayList<>();
      String sql= "SELECT PNAME , PRICE , quantity,buy_date,CATEGORY \r\n" + //
                "FROM TBL_PRODUCT tp \r\n" + //
                "JOIN TBL_BUY tb \r\n" + //
                "ON tp.PCODE =tb.PCODE\r\n" + //
                "WHERE CUSTOM_ID ='wonder'\r\n" + //
                "ORDER BY BUY_DATE DESC"; 
                try (
                  Connection connection=getConnection();
                  PreparedStatement pstmt=connection.prepareStatement(sql);
          
                ) {
                  list=new ArrayList<>();
                  pstmt.setString(1,customerId);
                  ResultSet rs=pstmt.executeQuery();
                  CustomerOrdervo vo =null;
                  while (rs.next()) {
                    vo=new CustomerOrdervo(rs.getString(1),rs.getInt(2),rs.getInt(3),rs.getDate(4),rs.getString(5));
                    
                    list.add(vo); 
                  }
                 } catch (Exception e) {
                  System.out.println("예외 : "+e.getMessage());
                }
                return list;  
              
    }
}