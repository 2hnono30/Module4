package repository;

import model.CustomerEntity;
import model.ProvinceEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CustomerRepository extends PagingAndSortingRepository<CustomerEntity, Integer> {
    public Iterable<CustomerEntity> findAllByProvinceByProvinceId(ProvinceEntity province);

    public Page<CustomerEntity> findAllByFirstNameContaining(String firstName, Pageable pageable);
}