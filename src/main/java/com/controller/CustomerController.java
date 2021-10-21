package com.controller;

import com.domain.Customer;
import com.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

/**
 * @description:
 * @author: 羽程
 * @create: 2021-09-24 19:04
 **/
@Controller
public class CustomerController {
    @Autowired
    CustomerService service;
    @RequestMapping("/mvc/findAllCustomer")
    public void   findAllCustomer(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Customer> customer = service.findAllCustomer();
//        System.out.println(customer);
        req.setAttribute("CustomerList",customer);
        req.getRequestDispatcher("/index.jsp").forward(req,resp);
    }

    @RequestMapping("/mvc/addCustomer")
    public void addCustomer(Customer customer,HttpServletRequest req,HttpServletResponse response) throws ServletException, IOException {
        int i = service.addCustomer(customer);
        if (i>0){
            req.getRequestDispatcher("/mvc/findAllCustomer").forward(req,response);
        }else{
            req.setAttribute("error","添加失败");
            req.getRequestDispatcher("/index.jsp").forward(req,response);
        }
    }

    @RequestMapping("/mvc/deleteCustomer")
    public void deleteCustomer(String c_id,HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        int i = service.deleteCustomer(c_id);
        if (i>0){
            req.getRequestDispatcher("/mvc/findAllCustomer").forward(req,resp);
        }else {
            req.setAttribute("error","删除失败");
            req.getRequestDispatcher("/index.jsp").forward(req,resp);
        }
    }

    @RequestMapping("/mvc/findCustomerByID")
    public void findCustomerByID(String c_id,HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException {
        Customer customer = service.findCustomerByID(c_id);
        req.setAttribute("Customer",customer);
        req.getRequestDispatcher("/UpdateCustomer.jsp").forward(req,resp);
    }

    @RequestMapping("/mvc/UpdateCustomer")
    public ModelAndView UpdateCustomer(Customer customer){
        ModelAndView mv=new ModelAndView();
        int i = service.updateCustomer(customer);
        if (i>0){
            mv.setViewName("/mvc/findAllCustomer");
            return mv;
        }else{
            mv.addObject("error","修改失败");
            mv.setViewName("/index.jsp");
            return mv;
        }
    }

}
