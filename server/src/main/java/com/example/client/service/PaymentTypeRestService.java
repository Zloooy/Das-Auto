package com.example.client.service;

import com.example.client.model.PaymentType;
import com.example.client.repository.PaymentTypeRepository;
import org.springframework.stereotype.Service;

@Service
public class PaymentTypeRestService extends CRUDPageRestService<PaymentType, PaymentTypeRepository> implements IPaymentTypeService{
}
