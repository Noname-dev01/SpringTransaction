package hello.springtx.order;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * 원래 같으면 Enum 같은걸 쓰겠지만 예제니까 이렇게 했다.
 */

@Entity
@Table(name = "orders") //테이블 매핑
@Getter
@Setter
public class Order {

    @Id
    @GeneratedValue
    private Long id;

    private String username; //정상, 예외, 잔고부족
    private String payStatus; //대기, 완료
}
