package com.lin.springboot.service.impl;

import com.lin.springboot.dao.PaymentDao;
import com.lin.springboot.entities.Payment;
import com.lin.springboot.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class PaymentServiceImpl implements PaymentService {

  @Resource
  private PaymentDao paymentDao;

  public int create(Payment payment) {
    return paymentDao.create(payment);
  }

  public Payment getPaymentById(long id) {
    return paymentDao.getPaymentById(id);
  }
}
