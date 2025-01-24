package dao.day2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import vo.day1.Product;



public class TblProductDao {


     private static TblProductDao dao=new TblProductDao();
    private TblProductDao(){}

    public static TblProductDao getInstance(){
        return dao;
    }

    private static final String URL = "jdbc:oracle:thin:@//localhost:1521/xe";
    private static final String USERNAME ="c##idev";
    private static final String PASSWORD ="1234";

  
    private Connection getConnection() throws SQLException {
      return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    
    public int insert(Product vo ){
      int result=0;
      String sql="INSERT INTO tbl_product(pcode, category, pname, price) " +
                 "VALUES (?, ?, ?, ? , sysdate) ";
      try (Connection connection = getConnection();
           PreparedStatement pstmt = connection.prepareStatement(sql);
          ) {
            pstmt.setString(1, vo.getPcode());
            pstmt.setString(2, vo.getCategory());
            pstmt.setString(3, vo.getPname());
            pstmt.setInt(4, vo.getPrice());

            result = pstmt.executeUpdate();
      } catch (Exception e) {
            System.out.println("예외 : " + e.getMessage());
      }
      return result;
    }

    public int update(Product vo) {
      int result =0;
      
      String sql="UPDATE tbl_product SET pname = ?, price = ? WHERE pcode = ?";
      try (Connection connection = getConnection();
           PreparedStatement pstmt = connection.prepareStatement(sql);
          ) {
            pstmt.setString(1, vo.getPname());
            pstmt.setInt(2, vo.getPrice());
            pstmt.setString(3,vo.getPcode());
            result=pstmt.executeUpdate();
        
      } catch (Exception e) {
        System.out.println("예외 : " + e.getMessage());
      }
      return result;
    }

    public int delete(String pcode) {
        int result=0;
      String sql="DELETE FROM tbl_product WHERE pcode = ? ";
      try (Connection connection = getConnection();
           PreparedStatement pstmt = connection.prepareStatement(sql);
          ) {
            pstmt.setString(1,pcode);
            result=pstmt.executeUpdate();
        } catch (Exception e) {
        System.out.println("예외 : " + e.getMessage());
      }
      return result;
    }


    public Product selectByPk(String pcode){
      String sql="SELECT * FROM tbl_product WHERE pcode = ?";
      Product product=null;
      try (Connection connection = getConnection();
           PreparedStatement pstmt = connection.prepareStatement(sql);
          ) {
            pstmt.setString(1, pcode);
            ResultSet rs=pstmt.executeQuery();

            if(rs.next()){
                product=new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4));
            }

      } catch (Exception e) {
        System.out.println("예외 : " + e.getMessage());
      }
      return product;
    } 

    public Product selectByKeyword(String pname){
        String sql="SELECT * FROM tbl_product WHERE PNAME LIKE '%' || ? || '%' ";
        Product product=null;
         List<Product> list=new ArrayList<>();

        try (Connection connection = getConnection()) {    
            PreparedStatement pstmt = connection.prepareStatement(sql);
            pstmt.setString(1, pname);

         ResultSet rs=pstmt.executeQuery();  
            while (rs.next()) { 
                product=new Product(rs.getString(1),rs.getString(2),rs.getString(3),rs.getInt(4)); 
                list.add(product);    
            }

            System.out.println("=== 가격의 상품 ===");
            for(Product p : list){
                System.out.println(String.format(" %-20s   %-20s   %4s   %9d" , p.getPcode(),p.getPname(),p.getCategory(),p.getPrice()));
            }

        } catch (Exception e) {
            System.out.println("검색 SELECT 실행 예외 : "+e.getMessage());
        }
        return product;
    }

}
