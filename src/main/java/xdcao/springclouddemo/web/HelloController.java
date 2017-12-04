package xdcao.springclouddemo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * created by xdCao on 2017/12/4
 */
@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String index(){
        return "Hello world";
    }

}
