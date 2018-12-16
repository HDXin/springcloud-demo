package top.atstudy.springcloud.provider.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/1 22:15
 */

@RestController
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @GetMapping("")
    public String account(){
        return "hello word! 8581";
    }

    @PostMapping("")
    public Account create(@RequestBody Account req){
        return this.accountService.saveAndFlush(req);
    }

    @GetMapping("/{id}")
    public Account getOne(@PathVariable("id") Long id){
        return this.accountService.getOne(id);
    }

    @GetMapping("/find/all")
    public List<Account> findAll(){
        return this.accountService.findAll();
    }

    @GetMapping("/find/all/sort")
    public List<Account> findAllBySort(){
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "name"));
        sort.and(new Sort(new Sort.Order(Sort.Direction.DESC, "id")));
        return this.accountService.findAll(sort);
    }

//    @GetMapping("/find/all/example")
//    public List<Account> findAllByExample(){
//
//        new Example<Account>("", ExampleMatcher.matching());
//
//        return this.accountService.findAll(new Example<Account>());
//    }

}
