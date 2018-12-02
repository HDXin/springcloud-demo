package top.atstudy.springcloud.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/2 15:55
 */
@SpringBootApplication
@EnableEurekaClient
public class Provider02Boot {
    public static void main(String[] args) {
        SpringApplication.run(Provider02Boot.class, args);
    }
}
