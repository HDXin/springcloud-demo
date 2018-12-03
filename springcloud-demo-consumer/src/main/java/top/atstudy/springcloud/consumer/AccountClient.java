package top.atstudy.springcloud.consumer;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/2 18:03
 */
@FeignClient(name = "springcloud-demo-provider", path = "/account")
public interface AccountClient {

    @GetMapping("")
    String get();

}
