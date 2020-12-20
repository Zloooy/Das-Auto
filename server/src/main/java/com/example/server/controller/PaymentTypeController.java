package com.example.server.controller;

import com.example.server.model.PaymentType;
import com.example.server.service.IPaymentTypeService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment_types")
public class PaymentTypeController extends CRUDPageController<PaymentType, IPaymentTypeService> {
}
