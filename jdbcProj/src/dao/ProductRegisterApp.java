package dao;

import java.util.List;

import vo.Customer;
import vo.Product;

public class ProductRegisterApp {
public static void main(String[] args) {
    print_search_info();
}

public static void register(){
   
    TblProductDao productDao=TblProductDao.getInstance();
      System.out.println("===== 상품 등록 메뉴 입니다. ======");
      boolean run=true;
      String pcode=null;
      while (run) {
        System.out.println("상품 정보 입력 >>>");
        pcode=System.console().readLine();
        if(productDao.selectByPk(pcode)!=null){
          System.out.println("중복된 상품이 있습니다");
        }else{
          System.out.println("등록 가능합니다. 해당 상품을 등록 하시겠습니까? (Y/N)");
          if(System.console().readLine().toUpperCase().equals("Y"))break;
        }
      }
        
      System.out.print(" 상품이름 입력 >>> ");
      String pname = System.console().readLine();
      System.out.print(" 카테고리 입력 >>> ");
      String category = System.console().readLine();
      System.out.print(" 가격 입력 >>> ");
      int price = Integer.parseInt(System.console().readLine());   
  
      Product product = new Product(pcode, category, pname, price);
    
      int result = productDao.insert(product);
  
      if(result==0){
        System.out.println("상품 등록 실패!!");
      } else {
        System.out.println("상품 등록 성공!!");
      }
    }

    public static void modify() {

    TblProductDao productDao=TblProductDao.getInstance();
    System.out.println("===== 상품 정보 수정 메뉴 입니다. ======");
    System.out.print(" 상품코드 입력 >>> ");
    String pcode = System.console().readLine();     

    System.out.println("~~ 상품 현재 정보 ~~");
    Product product=productDao.selectByPk(pcode);
    System.out.println(product);

    System.out.println("~~~ 상품명, 상품가격 수정해 주세요");
    System.out.print(" 상품명 입력 >>> ");
    String pname = System.console().readLine();
    System.out.print(" 상품가격 입력 >>> ");
    String price = System.console().readLine();

    product = new Product(pcode, price, pname, 0);

    int result = productDao.update(product);

    if(result==0){
      System.out.println("상품 정보 변경 실패!!");
    } else {
      System.out.println("상품 정보 변경 성공!!");
    }
  }

  public static void remove(){
    System.out.println("===== 상품 제거 메뉴 입니다. ======");
      System.out.print(" 상품코드 입력 >>> ");
      String pcode = System.console().readLine();     
  
  
   TblProductDao productDao=TblProductDao.getInstance();
      int result=productDao.delete(pcode);
  
      if(result==0){
        System.out.println("상품 제거 실패 !!");
      }else{
        System.out.println("상품 제거 성공 !!");
      }
  }
  
public static void print_product_info(){

  System.out.println("상품 조회임다");
  System.out.println("상품코드 입력 >>> ");
  String pcode=System.console().readLine(); 
  
  TblProductDao productDao=TblProductDao.getInstance();
  Product product=productDao.selectByPk(pcode);
  System.out.println("[상품코드] "+product.getPcode());
  System.out.println("[카테고리] "+product.getCategory());
  System.out.println("[상품이름] "+product.getPname());
  System.out.println("[가격] "+product.getPrice());
 }

public static void print_search_info(){
    System.out.println("상품 키워드 조회임다");
  System.out.println("상품 키워드 입력 >>> ");
  String pname=System.console().readLine(); 
  TblProductDao productDao=TblProductDao.getInstance();
  List<Product> list=productDao.selectByKeyword(pname);

  System.out.println("=== 가격의 상품 ===");
            for(Product p : list){
                System.out.println(String.format(" %-20s   %-20s   %4s   %9d" , p.getPcode(),p.getPname(),p.getCategory(),p.getPrice()));
            }
 }
 
}
