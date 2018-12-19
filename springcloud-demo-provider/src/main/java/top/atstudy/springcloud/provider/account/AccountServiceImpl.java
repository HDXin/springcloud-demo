package top.atstudy.springcloud.provider.account;

import org.hibernate.collection.internal.PersistentBag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.JpaSort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.persistence.criteria.*;
import java.util.ArrayList;
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

    @Override
    public Page<Account> findByQuery(AccountQuery query1) {

        int pageNo = 0;
        int pageSize = 5;
        PageRequest page = new PageRequest(pageNo, pageSize);

        Specification<Account> specification = new Specification<Account>() {

            /**
             *
             * @param root
             * @param query
             * @param cb
             * @return
             */
            @Override
            public Predicate toPredicate(Root<Account> root, CriteriaQuery<?> query, CriteriaBuilder cb) {
                List<Predicate> predicates = new ArrayList<>();

                if(!StringUtils.isEmpty(query1.getId())){
                    Path path = root.get("id");
                    Predicate predicate = cb.gt(path, query1.getId());
                    predicates.add(predicate);
                }

                if(!StringUtils.isEmpty(query1.getName())){
                    Path path2 = root.get("name");
                    Predicate predicate2 = cb.like(path2, query1.getName());
                    predicates.add(predicate2);
                }

                if(!StringUtils.isEmpty(query1.getMobile())){
                    Path path2 = root.get("mobile");
                    Predicate predicate3 = cb.like(path2, query1.getMobile());
                    predicates.add(predicate3);
                }


                return cb.and(predicates.toArray(new Predicate[predicates.size()]));
            }
        };

        return accountRepository.findAll(specification, page);
    }
}
