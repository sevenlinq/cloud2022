package com.lin.springboot.controller;

import com.lin.springboot.entities.CommonResult;
import com.lin.springboot.entities.Payment;
import com.lin.springboot.service.PaymentService;
import com.lin.springboot.service.impl.PaymentServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@Slf4j
public class PaymentController {

  @Resource
  private PaymentServiceImpl paymentService;

  @PostMapping("/payment/create")
  public CommonResult create(Payment payment){
    int result = paymentService.create(payment);
    log.info("生成流水");
    if(result>0){
      return new CommonResult(200,"创建成功",result);
    }else{
      return new CommonResult(444,"创建失败",result);
    }
  }

  @GetMapping("/payment/get/{id}")
  public CommonResult getPaymentById(@PathVariable("id") long id){
    Payment payment = paymentService.getPaymentById(id);
    if(payment!=null){
      return new CommonResult<Payment>(200,"查找成功",payment);
    }else {
      return new CommonResult<Payment>(444,"查找失败",null);
    }
  }

}
