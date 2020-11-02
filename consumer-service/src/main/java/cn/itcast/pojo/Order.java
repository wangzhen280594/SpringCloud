package cn.itcast.pojo;

import lombok.Data;

import java.util.Date;

@Data
public class Order {
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