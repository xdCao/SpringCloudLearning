package xdcao.feignconsumer.web;

/**
 * created by xdCao on 2017/12/11
 */

public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "error";
    }

    @Override
    public String hello(String name) {
        return "error";
    }

    @Override
    public User hello(String name, Integer age) {
        return new User("unknown",0);
    }

    @Override
    public String hello(User user) {
        return "error";
    }
}
