package top.atstudy.springcloud.provider;

import javafx.concurrent.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/2 11:28
 */
@RestController
@RequestMapping("/service")
public class ServicesController {
    private static final Logger logger = LoggerFactory.getLogger(ServicesController.class);

    @Autowired
    private DiscoveryClient discoveryClient;

    @GetMapping("/list")
    public void discovery(){

        List<String> list = discoveryClient.getServices();
        logger.info(" ===>> {}", list.toArray().toString());

        List<ServiceInstance> instances = discoveryClient.getInstances("SPRINGCLOUD-DEMO-PROVIDER");
        for(ServiceInstance instance:instances){
            logger.info(" ===>> serviceId:{}, host:{}, port:{}, uri:{}", instance.getServiceId(), instance.getHost(),instance.getPort(), instance.getUri());
        }
    }

}
