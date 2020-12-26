package com.example.client.controller;

import com.example.client.model.PaymentType;
import com.example.client.service.IPaymentTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment_types")
public class PaymentTypeController extends CRUDPageController<PaymentType, IPaymentTypeService> {
}
