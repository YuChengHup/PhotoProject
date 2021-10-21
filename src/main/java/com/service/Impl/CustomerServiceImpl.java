package com.service.Impl;

import com.dao.CustomerDao;
import com.dao.EmpDao;
import com.dao.Impl.CustomerDaoImpl;
import com.domain.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 19:14
 **/
@Service
public class CustomerServiceImpl implements CustomerService {
    @Autowired private CustomerDao customerDao;

    @Override
    public List<Customer> findAllCustomer() {
        List<Customer> allCustomer = customerDao.findAllCustomer();
        return allCustomer;
    }

    @Override
    public int addCustomer(Customer customer) {
        int i = customerDao.addCustomer(customer);
        return i;
    }

    @Override
    public Customer findCustomerByID(String c_id) {
        Customer cUstomerById = customerDao.findCUstomerById(c_id);
        return cUstomerById;
    }

    @Override
    public int updateCustomer(Customer customer) {
        int i = customerDao.UpdateCustomer(customer);
        return i;
    }

    @Override
    public int deleteCustomer(String c_id) {
        int i = customerDao.DeleteCustomer(c_id);
        return i;
    }
}
