package ribbon.consumer.rest.template.load.balance.config;

import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.context.annotation.Configuration;
import ribbon.consumer.rest.template.load.balance.config.ribbon.provider.RibbonProviderOneLoadBalanceConfiguration;

/**
 * @author want
 * @createTime 2020.10.28.21:30
 */
@Configuration
@RibbonClient(value = "ribbon-provider",configuration = {RibbonProviderOneLoadBalanceConfiguration.class})
public class RibbonClientConfiguration {
}
