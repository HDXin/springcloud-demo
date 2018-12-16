package top.atstudy.springcloud.provider.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/5 15:19
 */
@Service
public class AccountServiceImpl implements AccountService {

    @Autowired
    private AccountRepository accountRepository;

    @Override
    public Account getOne(Long id) {
        return this.accountRepository.getOne(id);
    }

    @Override
    public List<Account> findAll() {
        return this.accountRepository.findAll();
    }

    @Override
    public List<Account> findAll(Sort sort) {
        return this.accountRepository.findAll(sort);
    }

    @Override
    public List<Account> findAll(List<Long> ids) {
        return this.accountRepository.findAll(ids);
    }

    @Override
    public List<Account> save(Iterable<Account> accounts) {
        return this.accountRepository.save(accounts);
    }

    @Override
    public void flush() {

    }

    @Override
    public Account saveAndFlush(Account account) {
        account.setCreateTime(new Date());
        account.setBirth(new Date());
        return this.accountRepository.saveAndFlush(account);
    }

    @Override
    public void deleteInBatch(Iterable<Account> accounts) {
        this.accountRepository.deleteInBatch(accounts);
    }

    @Override
    public void deleteAllInBatch() {
        this.accountRepository.deleteAllInBatch();
    }

    @Override
    public List<Account> findAll(Example<Account> example) {

        example.getMatcher()
                .withMatcher("t", match -> match.startsWith())
                .withMatcher("m", match -> match.endsWith());


        return this.accountRepository.findAll(example);
    }

    @Override
    public List<Account> findAll(Example<Account> example, Sort sort) {
        return this.accountRepository.findAll(example, sort);
    }

    @Override
    public long countByQuery(String name, String mobile) {
        return this.accountRepository.countByQuery(name, mobile);
    }
}
