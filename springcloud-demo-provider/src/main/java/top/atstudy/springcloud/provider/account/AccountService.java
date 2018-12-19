package top.atstudy.springcloud.provider.account;

import org.springframework.data.domain.Page;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/5 15:15
 */
public interface AccountService extends IDomainService<Account>{


    long countByQuery(String name, String mobile);

    Page<Account> findByQuery(AccountQuery query);
}
