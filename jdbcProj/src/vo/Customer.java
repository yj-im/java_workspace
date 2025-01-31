package vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 롬복 사용
@Getter
@Setter
@ToString
@AllArgsConstructor     // 커스텀 생성자 만든거라 customer 파일의 기본생성자는 오류뜸   // 모든 프로퍼티값 초기화하는 생성자 코드
@RequiredArgsConstructor     // final 변수만 초기화하는 커스텀 생성자 만듬
// @NoArgsConstructor  // final 변수가 있으면 기본 생성자 사용 못함.    // 다시 기본생성자 만들어주는명령어 써서 오류제거
                       // 기본 생성자 사용하려면 변수 선언시 값을 정해야 한다.
public class Customer {
    private final String customId;
    private final String name;
    private final String email;
    private final int age;
    private final Date regDate; // sql로 임포트
    private String postcode;

  
    
}

// ORM 프레임웍을 사용하면 기본생성자, setter 가 필요하다.