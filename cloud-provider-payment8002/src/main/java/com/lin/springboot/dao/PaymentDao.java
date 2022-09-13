package com.lin.springboot.dao;

import com.lin.springboot.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface PaymentDao {

  public int create(Payment payment);

  public Payment getPaymentById(@Param("id") long id);

}
