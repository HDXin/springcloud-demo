package top.atstudy.springcloud.rabbitmq;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/13 16:40
 */
@Configuration
public class RabbitMqConfig {

    @Bean
    public Queue queue(){
        return new Queue("mq");
    }

}
