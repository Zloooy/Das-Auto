package com.example.server.service;

import com.example.server.model.PaymentType;
import com.example.server.repository.PaymentTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentTypeRestService extends CRUDPageRestService<PaymentType, PaymentTypeRepository> implements IPaymentTypeService{
}
