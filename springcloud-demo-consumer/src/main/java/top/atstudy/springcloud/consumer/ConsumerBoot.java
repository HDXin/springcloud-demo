package top.atstudy.springcloud.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/1 22:31
 */
@SpringBootApplication
@EnableEurekaClient
public class ConsumerBoot {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerBoot.class, args);
    }

}
