package vo;

import java.sql.Date;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor





public class CustomerOrdervo {

    private String pname;
    private int price;
    private int quantity;
    private Date buy_date;
    private String category;
}
