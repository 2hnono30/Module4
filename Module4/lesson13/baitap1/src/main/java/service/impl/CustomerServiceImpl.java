package service.impl;


import model.CustomerEntity;
import model.ProvinceEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import repository.CustomerRepository;
import service.CustomerService;

public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

/*    @Override
    public Iterable<CustomerEntity> findAll() {
        return customerRepository.findAll();
    }*/

    @Override
    public Page<CustomerEntity> findAll(Pageable pageable) {
        return customerRepository.findAll(pageable);
    }

    @Override
    public Page<CustomerEntity> findAllByFirstNameContaining(String firstName, Pageable pageable) {
        return customerRepository.findAllByFirstNameContaining(firstName, pageable);
    }

    @Override
    public CustomerEntity findById(Integer id) {
        return customerRepository.findOne(id);
    }

    @Override
    public void save(CustomerEntity customer) {
        customerRepository.save(customer);
    }

    @Override
    public void remove(Integer id) {
        customerRepository.delete(id);
    }

    @Override
    public Iterable<CustomerEntity> findAllByProvinceByProvinceId(ProvinceEntity province) {
        return customerRepository.findAllByProvinceByProvinceId(province);
    }
}