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

//    private static final String REST_URL_PREFIX = "http://localhost:8581";
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-DEMO-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("")
    public String get(){
        return restTemplate.getForObject(REST_URL_PREFIX + "/account", String.class);
    }

}
