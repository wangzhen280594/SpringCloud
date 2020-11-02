package cn.itcast.web;

import cn.itcast.pojo.Order;
import cn.itcast.service.OrderServive;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("user")
public class OrderController {
    @Autowired
    private OrderServive orderService;

    @GetMapping("{id}")
    public Order hello(@PathVariable("id") int id) {
        return orderService.queryById(id);
        //return "hello, Spring boot!";
    }

}
