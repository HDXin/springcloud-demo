package top.atstudy.springcloud.rabbitmq;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/13 16:42
 */
@RestController
@RequestMapping("/mq")
public class RabbitmqSendController {

    @Autowired
    private AmqpTemplate amqpTemplate;

    @GetMapping("/send")
    public List<String> send(@RequestParam("str") String str){

        List<String> contents = new ArrayList<String>();
        for(int i=0; i<20; i++){
            String content = "<" + i + "> hello：" + str + ", date: " + new Date();
            amqpTemplate.convertAndSend("mq", content);

            contents.add(content);
        }
        return contents;
    }

}
