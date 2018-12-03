package top.atstudy.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import top.atstudy.springcloud.MyRule;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/1 22:31
 */
@SpringBootApplication
@EnableEurekaClient
//@RibbonClient(name = "SPRINDCLOUD-DEMO-PROVIDER", configuration = MyRule.class)
@EnableFeignClients
public class ConsumerBoot {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBoot.class, args);
    }

}
