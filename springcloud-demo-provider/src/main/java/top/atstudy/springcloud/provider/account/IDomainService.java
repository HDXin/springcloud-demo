package top.atstudy.springcloud.provider.account;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;

import java.util.List;

public interface IDomainService<T> {
	List<T> findAll();

	List<T> findAll(Sort sort);

	List<T> findAll(List<Long> ids);

	List<T> save(Iterable<T> var1);

	void flush();

	T saveAndFlush(T t);

	void deleteInBatch(Iterable<T> var1);

	void deleteAllInBatch();

	T getOne(Long id);

	List<T> findAll(Example<T> example);

	List<T> findAll(Example<T> example, Sort sort);
}
