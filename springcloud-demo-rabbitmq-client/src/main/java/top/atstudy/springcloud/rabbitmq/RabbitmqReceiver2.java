package top.atstudy.springcloud.rabbitmq;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/13 17:28
 */
@Component
@RabbitListener(queues = "mq")
public class RabbitmqReceiver2 {

    private static Integer index = 1;

    @RabbitHandler
    public void receiver2(String msq){


        System.out.println(" ===>>> receiver2: " + msq + "         " + index);
        index++;

    }
}
