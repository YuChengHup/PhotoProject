package com.dao.Impl;

import com.dao.CustomerDao;
import com.domain.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapperResultSetExtractor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 19:07
 **/

@Repository
public class CustomerDaoImpl implements CustomerDao {
    @Autowired private JdbcTemplate jd;
    @Override
    public List<Customer> findAllCustomer() {
        Object[] objs={};
        List<Customer> customers = jd.query("select * from customer", new BeanPropertyRowMapper<Customer>(Customer.class));
        return customers;
    }

    @Override
    public Customer findCUstomerById(String c_id) {
        Object[] objs={c_id};
        Customer customer = jd.queryForObject("select * from customer where c_id=?", objs, new BeanPropertyRowMapper<Customer>(Customer.class));
        return customer;
    }

    @Override
    public int UpdateCustomer(Customer customer) {
        Object[] objs={customer.getC_name(),customer.getC_sex(),customer.getC_tell(),customer.getC_job(),customer.getC_company(),customer.getC_id()};
        int i = jd.update("update customer set c_name=?,c_sex=?,c_tell=?,c_job=?,c_company=? where c_id=?",objs);
        return i;
    }

    @Override
    public int DeleteCustomer(String c_id) {
        Object[] objs={c_id};
        int i = jd.update("delete from customer where c_id=? ",objs);
        return i;
    }

    @Override
    public int addCustomer(Customer customer) {
        Object[] objs={customer.getC_name(),customer.getC_sex(),customer.getC_tell(),customer.getC_job(),customer.getC_company()};
        int i = jd.update("insert into customer values (null ,?,?,?,?,?)", objs);
        return i;
    }
}
