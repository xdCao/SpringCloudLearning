package xdcao.feignconsumer.web;

import com.netflix.discovery.converters.Auto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by xdCao on 2017/12/11
 */
@RestController
public class ConsumerController {

    @Autowired
    private HelloService helloService;


    @RequestMapping(value = "feign-consumer",method = RequestMethod.GET)
    public String helloConsumer(){
        return helloService.hello();
    }

    @RequestMapping(value = "/feign-consumer2",method = RequestMethod.GET)
    public String helloConsumer2(){
        StringBuilder stringBuilder=new StringBuilder();
        stringBuilder.append(helloService.hello()).append("\n");
        stringBuilder.append(helloService.hello("didi")).append("\n");
        stringBuilder.append(helloService.hello("didi",30)).append("\n");
        stringBuilder.append(helloService.hello(new User("caohao",23))).append("\n");
        return stringBuilder.toString();
    }


}
