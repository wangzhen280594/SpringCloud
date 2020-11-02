package cn.itcast.pojo;

import lombok.Data;
import tk.mybatis.mapper.annotation.KeySql;

import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Data
@Table(name = "oms_order")
public class Order {
    @Id
    @KeySql(useGeneratedKeys = true)
    private Integer id;
    private Integer member_id;
    private Integer coupon_id;
    private Date create_time;
    private String member_username;
    private Integer status;
    private String order_sn;

    public Order() {
    }
}
