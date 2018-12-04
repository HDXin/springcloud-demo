package top.atstudy.springcloud.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/3 22:18
 */
@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class ConfigServerBoot {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerBoot.class, args);
    }

}
