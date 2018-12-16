package top.atstudy.springcloud.provider.account;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

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
    public List<Account> save(Iterable<Account> var1) {
        return null;
    }

    @Override
    public void flush() {

    }

    @Override
    public Account saveAndFlush(Account account) {
        return null;
    }

    @Override
    public void deleteInBatch(Iterable<Account> var1) {

    }

    @Override
    public void deleteAllInBatch() {

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
        return null;
    }
}
