package cn.itcast.web;


import cn.itcast.client.UserClient;
import cn.itcast.pojo.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("consumer")
public class ConsumerController {
//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private UserClient userClient;

    @GetMapping("{id}")
    public Order queryById(@PathVariable("id") int id) {
        //String url="http://localhost:8081/user/"+id;
        //String url="http://user-service/user/"+id;
        //Order order=restTemplate.getForObject(url,Order.class);
        return userClient.queryById(id);
    }

}
