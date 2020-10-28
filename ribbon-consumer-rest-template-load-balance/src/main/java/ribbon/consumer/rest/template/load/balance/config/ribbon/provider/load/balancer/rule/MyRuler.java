package ribbon.consumer.rest.template.load.balance.config.ribbon.provider.load.balancer.rule;

import com.netflix.loadbalancer.ILoadBalancer;
import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.Server;

import javax.annotation.Resource;

/**
 * @author want
 * @createTime 2020.10.28.21:41
 */
public class MyRuler implements IRule {

    private RandomRule randomRule = new RandomRule();

    @Override
    public Server choose(Object o) {
        System.out.println(" ---------------MyRuler   choose-------------------- ");
        return randomRule.choose(o);
    }

    @Override
    public void setLoadBalancer(ILoadBalancer iLoadBalancer) {
        System.out.println(" ---------------MyRuler   setLoadBalancer-------------------- ");
        randomRule.setLoadBalancer(iLoadBalancer);
    }

    @Override
    public ILoadBalancer getLoadBalancer() {
        System.out.println(" ---------------MyRuler  getLoadBalancer-------------------- ");
        return randomRule.getLoadBalancer();
    }
}
