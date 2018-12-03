package top.atstudy.springcloud.zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/2 22:36
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulBoot {

    public static void main(String[] args) {
        SpringApplication.run(ZuulBoot.class, args);
    }

}
