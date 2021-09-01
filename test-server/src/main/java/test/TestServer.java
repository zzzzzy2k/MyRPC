package test;

import rpc.api.HelloService;
import rpc.server.RpcServer;

/**
 * 测试用服务提供方（服务端）
 * @author zzzzy
 */
public class TestServer {

    public static void main(String[] args) {
        HelloService helloService = new HelloServiceImpl();
        RpcServer rpcServer = new RpcServer();
        rpcServer.register(helloService, 9000);
    }

}
