package top.atstudy.springcloud.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/1 23:46
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaBoot {

    public static void main(String[] args) {
        SpringApplication.run(EurekaBoot.class, args);
    }

}
