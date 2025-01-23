package vo.day1;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

// 롬복 사용
@Getter
@Setter
@ToString
@AllArgsConstructor     // 커스텀 생성자 만든거라 customer 파일의 기본생성자는 오류뜸
@NoArgsConstructor      // 다시 기본생성자 만들어주는명령어 써서 오류제거
public class Customer {
    private String customId;
    private String name;
    private String email;
    private int age;
    private Date regDate; // sql로 임포트
}

// ORM 프레임웍을 사용하면 기본생성자, setter 가 필요하다.