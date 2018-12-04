package top.atstudy.springcloud.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/4 10:10
 */
@SpringBootApplication
@EnableEurekaClient
public class ApiBoot {

    public static void main(String[] args) {
        SpringApplication.run(ApiBoot.class, args);
    }

}
