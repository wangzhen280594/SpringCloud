package cn.itcast.service;


import cn.itcast.mapper.OrderMapper;
import cn.itcast.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OrderServive {
    @Autowired
    private OrderMapper orderMapper;

    public Order queryById(int id) {
        return orderMapper.selectByPrimaryKey(id);
    }
}
