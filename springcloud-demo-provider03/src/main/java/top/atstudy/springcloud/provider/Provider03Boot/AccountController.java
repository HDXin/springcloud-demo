package top.atstudy.springcloud.provider.Provider03Boot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/1 22:15
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("")
    public String account(){
        return "hello word! 8583";
    }


}
