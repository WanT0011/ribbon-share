package ribbon.consumer.rest.template.load.balance.config.ribbon.provider;

import com.netflix.client.config.IClientConfig;
import com.netflix.loadbalancer.*;
import org.springframework.context.annotation.Bean;
import ribbon.consumer.rest.template.load.balance.config.ribbon.provider.load.balancer.MyLoadBalancer;
import ribbon.consumer.rest.template.load.balance.config.ribbon.provider.load.balancer.rule.MyRuler;

/**
 * ribbon-provider 此服务专属的 负载均衡配置类
 *
 *
 * @author want
 * @createTime 2020.10.28.21:33
 */
public class RibbonProviderOneLoadBalanceConfiguration {

    @Bean
    public IRule rule(){
        return new MyRuler();
    }

    @Bean
    public ILoadBalancer iLoadBalancer(IClientConfig clientConfig, IRule rule, IPing ping, ServerList serverList, ServerListFilter filter, ServerListUpdater serverListUpdater){
        return new MyLoadBalancer(clientConfig,rule,ping,serverList,filter,serverListUpdater);
    }


}

