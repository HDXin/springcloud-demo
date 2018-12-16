package top.atstudy.springcloud.provider.account;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author huangdexin @ harley
 * @email huangdexin@kuaicto.com
 * @date 2018/12/5 14:20
 */
@Getter
@Setter
@Entity
public class Account implements Serializable {

    @Id
    @Column(length = 20)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(length = 30)
    private String name;

    @Temporal(TemporalType.TIMESTAMP)
    private Date createTime;

    private String mobile;

    @Temporal(TemporalType.DATE)
    private Date birth;

}
