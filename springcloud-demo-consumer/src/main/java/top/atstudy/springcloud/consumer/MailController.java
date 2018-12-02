package top.atstudy.springcloud.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/1 22:33
 */
@RestController
@RequestMapping("/email")
public class MailController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("")
    public String get(){

        return restTemplate.getForObject("http://localhost:8581/account", String.class);
    }

}
