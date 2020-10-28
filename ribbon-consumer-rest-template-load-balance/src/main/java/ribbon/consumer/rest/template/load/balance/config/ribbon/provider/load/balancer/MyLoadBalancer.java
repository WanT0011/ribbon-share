package ribbon.consumer.rest.template.load.balance.config.ribbon.provider.load.balancer;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;

/**
 * @author want
 * @createTime 2020.10.28.21:36
 */
public class MyLoadBalancer extends DynamicServerListLoadBalancer {

    public MyLoadBalancer(IClientConfig clientConfig, IRule rule, IPing ping, ServerList serverList, ServerListFilter filter, ServerListUpdater serverListUpdater) {
        super(clientConfig, rule, ping, serverList, filter, serverListUpdater);
    }

    public Server chooseServer(Object hint){
        System.out.println(" MyLoadBalancer 。。。。");
        return super.chooseServer(hint);
    }

}
