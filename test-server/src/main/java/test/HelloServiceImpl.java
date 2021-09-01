package test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import rpc.api.HelloObject;
import rpc.api.HelloService;

/**
 * @author zzzzy
 */
public class HelloServiceImpl implements HelloService {

    private static final Logger logger = LoggerFactory.getLogger(HelloServiceImpl.class);

    @Override
    public String hello(HelloObject object) {
        logger.info("接收到：{}", object.getMessage());
        return "这是掉用的返回值，id=" + object.getId();
    }

}
