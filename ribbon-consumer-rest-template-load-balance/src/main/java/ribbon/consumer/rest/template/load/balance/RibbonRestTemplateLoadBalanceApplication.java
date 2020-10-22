package ribbon.consumer.rest.template.load.balance;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.ResponseEntity;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author want
 * @createTime 2020.10.22.23:20
 */
@EnableScheduling
@SpringBootApplication
public class RibbonRestTemplateLoadBalanceApplication {
    public static void main(String[] args) {
        SpringApplication.run(RibbonRestTemplateLoadBalanceApplication.class,args);
    }

    @Resource
    private RestTemplate restTemplate;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }

    @Scheduled(fixedDelay = 1 * 1000L)
    public void whoAreU(){
        System.out.println(restTemplate.getForEntity("http://ribbon-provider/provider/whoAreU", String.class).getBody());
    }
}
