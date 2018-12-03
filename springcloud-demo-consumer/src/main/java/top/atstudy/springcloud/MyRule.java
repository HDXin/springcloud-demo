package top.atstudy.springcloud;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/2 16:55
 */
@Configuration
public class MyRule {

    @Bean
    public IRule mySelfRule(){
        //轮询
        return new RoundRobinRule();
    }

}
