package top.atstudy.springcloud.provider.account;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/16 22:03
 */
public class AccountQuery extends PageRequest {

    private Long id;

    private String name;

    private String mobile;

    public AccountQuery(){super(0, 16);}

    public AccountQuery(int page, int size) {
        super(page, size);
    }

    public AccountQuery(int page, int size, Sort.Direction direction, String... properties) {
        super(page, size, direction, properties);
    }

    public AccountQuery(int page, int size, Sort sort) {
        super(page, size, sort);
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
