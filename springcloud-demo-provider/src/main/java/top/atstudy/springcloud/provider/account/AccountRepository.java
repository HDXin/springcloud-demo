package top.atstudy.springcloud.provider.account;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/5 15:13
 */
public interface AccountRepository extends JpaRepository<Account, Long> {
}
