package com.service;

import com.domain.Customer;

import java.util.List;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 19:13
 **/
public interface CustomerService {
    /**
     * 查询所有客户信息
     */
    List<Customer> findAllCustomer();

    /**
     * 添加客户信息
     */
    int addCustomer(Customer customer);

    /**
     * 通过id查询客户信息
     */
    Customer findCustomerByID(String c_id);

    /**
     * 修改客户信息
     */
    int updateCustomer(Customer customer);

    /**
     * 删除客户信息
     */
    int deleteCustomer(String c_id);
}
