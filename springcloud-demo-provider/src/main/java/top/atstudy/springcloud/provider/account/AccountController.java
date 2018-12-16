package top.atstudy.springcloud.provider.account;

import jdk.nashorn.internal.runtime.arrays.ArrayLikeIterator;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Date;
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

    @GetMapping("/find/all")
    public List<Account> findAll(){
        return this.accountService.findAll();
    }

    @PutMapping("/find/all/byIds")
    public List<Account> findAllByIds(@RequestBody ArrayList<Long> ids){
        if(CollectionUtils.isEmpty(ids))
            return new ArrayList<>();
        return this.accountService.findAll(ids);
    }

    @GetMapping("/find/all/sort")
    public List<Account> findAllBySort(){
        Sort sort = new Sort(new Sort.Order(Sort.Direction.ASC, "name"));
        sort.and(new Sort(new Sort.Order(Sort.Direction.DESC, "id")));
        return this.accountService.findAll(sort);
    }

    @PostMapping("/save")
    public List<Account> save(@RequestBody ArrayList<Account> accounts){

        for(Account account:accounts){
            try { Thread.sleep(2000); } catch (InterruptedException e) { }
            account.setBirth(new Date());
            account.setCreateTime(new Date());
        }

        return this.accountService.save(accounts);
    }

    @DeleteMapping("/deleteInBatch")
    public void deleteInBathch(@RequestBody ArrayList<Account> accounts){
        this.accountService.deleteInBatch(accounts);
    }

    @DeleteMapping("/deleteAllInBatch")
    public void deleteAllInBatch(){
        this.accountService.deleteAllInBatch();
    }

    @PostMapping("/saveAndFlush")
    public Account saveAndFlush(@RequestBody Account req){
        return this.accountService.saveAndFlush(req);
    }


    @GetMapping("/getOne/{id}")
    public Account getOne(@PathVariable("id") Long id){
        return this.accountService.getOne(id);
    }

    @GetMapping("/find/total")
    public long findTotal(@RequestParam(value = "name", required = false) String name,
                          @RequestParam(value = "mobile", required = false) String mobile){
        return this.accountService.countByQuery(name, mobile);
    }

//    @GetMapping("/find/all/example")
//    public List<Account> findAllByExample(){
//
//        new Example<Account>("", ExampleMatcher.matching());
//        return this.accountService.findAll(new Example<Account>());
//    }

}
