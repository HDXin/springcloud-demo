package top.atstudy.springcloud.rabbitmq;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
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
public class RabbitClientBoot {
    public static void main(String[] args) {
        SpringApplication.run(RabbitClientBoot.class, args);
    }
}
