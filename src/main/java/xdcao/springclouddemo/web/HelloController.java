package xdcao.springclouddemo.web;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.ws.Service;
import java.util.logging.Logger;

/**
 * created by xdCao on 2017/12/4
 */
@RestController
public class HelloController {

    private final Logger logger=Logger.getLogger(String.valueOf(getClass()));

    @Autowired
    private DiscoveryClient client;


    @RequestMapping("/hello")
    public String index(){
        ServiceInstance instance=client.getLocalServiceInstance();
        logger.info("/hello,host:"+instance.getHost()+",service_id:"+instance.getServiceId());
        return "Hello world";
    }

}
