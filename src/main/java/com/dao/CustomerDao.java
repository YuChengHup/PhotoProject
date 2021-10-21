package com.dao;

import com.domain.Customer;

import java.util.List;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 19:07
 **/
public interface CustomerDao {
    /**
     * 查询所有顾客信息
     */
    List<Customer> findAllCustomer();

    /**
     * 通过ID查找顾客信息
     * @return
     */
    Customer findCUstomerById(String c_id);

    /**
     * 修改客户信息
     */
    int UpdateCustomer(Customer customer);

    /**
     * 删除客户信息
     */
    int DeleteCustomer(String c_id);

    /**
     * 添加顾客信息
     */
    int addCustomer(Customer customer);
}
