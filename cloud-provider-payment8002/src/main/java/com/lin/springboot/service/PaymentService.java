package com.lin.springboot.service;

import com.lin.springboot.entities.Payment;

public interface PaymentService {

  public int create(Payment payment);

  public Payment getPaymentById(long id);

}
